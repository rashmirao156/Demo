package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.GlobalConstants;
import com.deloitte.sample.integration.demo.adapter.configuration.AdapterConfiguration;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Component
public class FileProcessor {

  @Autowired AdapterConfiguration adapterConfiguration;

  public final void searchInboundDirForZipFiles() throws Exception {
    File inboundDir = new File(adapterConfiguration.getAdpInboundDir());

    if (inboundDir.isDirectory()) {

      String[] inboundFiles = inboundDir.list();
      for (String inboundFileName : inboundFiles) {
        if (inboundFileName.endsWith(".zip")) {
          String zipFilePath =
              adapterConfiguration.getAdpInboundDir() + File.separator + inboundFileName;
          unzip(zipFilePath, adapterConfiguration.getAdpOutboundDir());
        }
      }
    }
  }

  public final Map<String, String> getMapFromAdapterOutboundDir() throws Exception {

    Map<String, String> nuggetMessageMap = new HashMap<>();

    File outboundDir = new File(adapterConfiguration.getAdpOutboundDir());

    if (outboundDir.isDirectory()) {

      String[] outboundFiles = outboundDir.list();
      for (String outboundFileName : outboundFiles) {
        if (outboundFileName.equals(GlobalConstants.TRADE_FILE_NAME)) {
          nuggetMessageMap.put(GlobalConstants.TRADE_KEY, getFileContent(outboundFileName));
        } else if (outboundFileName.equals(GlobalConstants.SECURITY_FILE_NAME)) {
          nuggetMessageMap.put(GlobalConstants.SECURITY_KEY, getFileContent(outboundFileName));
        } else if (outboundFileName.equals(GlobalConstants.PRICE_FILE_NAME)) {
          nuggetMessageMap.put(GlobalConstants.PRICE_KEY, getFileContent(outboundFileName));
        }
      }
    }

    return nuggetMessageMap;
  }

  private final String getFileContent(String outboundFileName) throws Exception {

    String filePath = adapterConfiguration.getAdpOutboundDir() + File.separator + outboundFileName;
    String fileContent = FileUtils.readFileToString(new File(filePath), Charset.defaultCharset());
    return fileContent;
  }

  private static void unzip(String zipFilePath, String destDir) throws Exception {
    File dir = new File(destDir);
    // create output directory if it doesn't exist
    if (!dir.exists()) dir.mkdirs();
    FileInputStream fis;
    // buffer for read and write data to file
    byte[] buffer = new byte[1024];
    try {
      fis = new FileInputStream(zipFilePath);
      ZipInputStream zis = new ZipInputStream(fis);
      ZipEntry ze = zis.getNextEntry();
      while (ze != null) {
        String fileName = ze.getName();
        File newFile = new File(destDir + File.separator + fileName);
        System.out.println("Unzipping to " + newFile.getAbsolutePath());
        // create directories for sub directories in zip
        new File(newFile.getParent()).mkdirs();
        FileOutputStream fos = new FileOutputStream(newFile);
        int len;
        while ((len = zis.read(buffer)) > 0) {
          fos.write(buffer, 0, len);
        }
        fos.close();
        // close this ZipEntry
        zis.closeEntry();
        ze = zis.getNextEntry();
      }
      // close last ZipEntry
      zis.closeEntry();
      zis.close();
      fis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

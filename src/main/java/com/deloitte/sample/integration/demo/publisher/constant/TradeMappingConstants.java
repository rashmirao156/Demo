package com.deloitte.sample.integration.demo.publisher.constant;

public class TradeMappingConstants {
  public static final String NAMESPACE = "http://www.fixprotocol.org/FIXML-5-0-SP2";
  public static final String EXECUTION_TIME = "EXECUTION_TIME";
  public static final String INVNUM = "INVNUM";
  public static final String TOUCHCOUNT = "TOUCHCOUNT";
  public static final String TRD_CURRENCY = "TRD_CURRENCY";
  public static final String TRD_MODIFY_TIME = "TRD_MODIFY_TIME";
  public static final String TRD_PRICE = "TRD_PRICE";
  public static final String TRD_PRINCIPAL = "TRD_PRINCIPAL";
  public static final String TRD_STATUS = "TRD_STATUS";
  public static final String TRD_TRADE_DATE = "TRD_TRADE_DATE";
  public static final String SOURCE_DATETIME_FORMAT = "MM/dd/yyyy HH:mm:ss.SSS";
    public static final String FUNDXPATH = "//FUND";

  public static final String INVNUMXPATH ="//INVNUM" ;

  // Acknowledgement related fields
  public static final String ACK_MAP_HEADER_KEY="ACK_MAP";
  public static final String AGGREGATED_ACK_DATA_MAP = "AGGREGATED_ACK_DATA_MAP";
  public static final String ACK_SUCCESS_MESSAGE = "Trade Published Sucessfully";
  public static final String ACK_SUCCESS_CODE = "S";
  public static final String ACK_FAILURE_MESSAGE = "Failed to publish Trade";
  public static final String ACK_FAILURE_CODE = "F";
}

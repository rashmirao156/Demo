/*
package com.macquarie.mam.integration.trade.builder.impl;

import com.macquarie.canon.fixml.v5.sp2.*;
import com.macquarie.mam.integration.trade.processor.constant.TradeMappingConstants;
import org.w3c.dom.Node;
import javax.xml.transform.dom.DOMSource;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrdCapRptSideGrpBlockTFIXMLBuilder extends GenericFIXMLBuilder {

  @Override
  protected void populateFieldNameMappings() {
    fieldNameXPathMap.put("settlCurrFxRt", TradeMappingConstants.RPTSIDESETTLCURRFXRT);
    fieldNameXPathMap.put("firmTrdEvntID", TradeMappingConstants.TRANTYPE);
    fieldNameXPathMap.put("acct", TradeMappingConstants.PORTFOLIONAME);
    fieldNameXPathMap.put("acrdIntAmt", TradeMappingConstants.TRDINTEREST);
    fieldNameXPathMap.put("rsnCD", TradeMappingConstants.TRDPURPOSE);
    fieldNameXPathMap.put("intAtMat", TradeMappingConstants.RPTSIDEINTATMAT);
  }

  */
/**
   * Constructor to populate the straight forward field mappings. This includes the mappings of
   * dimple data type like String, Integer etc
   *
   * @param tradeCaptureReportMessageT
   *//*

  public TrdCapRptSideGrpBlockTFIXMLBuilder(TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    super(tradeCaptureReportMessageT);
  }

  public TrdCapRptSideGrpBlockT buildTrdCapRptSideGrpBlockT(
          final DOMSource domSource, final DOMSource securityForCUSIP, final DOMSource priceSource)
          throws Exception {

    TrdCapRptSideGrpBlockT trdCapRptSideGrpBlockT = new TrdCapRptSideGrpBlockT();
    if (!fieldNameXPathMap.isEmpty()) {

      // Adding mapping from Trade XML File TRANSACTIONS/TRADE/INT_AT_MATURITY to
      // TrdCaptRpt/RptSide/@IntAtMaturity
      // Adding mapping from Trade XML File TRANSACTIONS/TRADE/PORTFOLIOS_PORTFOLIO_NAME to
      // TrdCaptRpt/RptSide/@Acct
      // Adding mapping from Trade XML File TRANSACTIONS/TRADE/SETTLE_EXCH_RATE to
      // TrdCaptRpt/RptSide/@SettlCurrFxRt
      // Adding mapping from Trade XML File TRANSACTIONS/TRADE/TRAN_TYPE to
      // TrdCaptRpt/RptSide/@FirmTrdEvntID
      // Adding mapping from Trade XML File TRANSACTIONS/TRADE/TRD_INTEREST to
      // TrdCaptRpt/RptSide/@AcrdIntAmt
      //
      populateObject(trdCapRptSideGrpBlockT, domSource);
    }

    // Adding Mappings from Trade XML File TRANSACTIONS/TRADE/SETTLE_EXCH_RATE
    //	TrdCaptRpt/RptSide/@SettlCurrFxRt
    String rptsidesettlcurrfxrtStr =
            template.evaluateAsString(TradeMappingConstants.RPTSIDESETTLCURRFXRT, domSource);

    if (rptsidesettlcurrfxrtStr != null && rptsidesettlcurrfxrtStr.equals("D")) {
      trdCapRptSideGrpBlockT.setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT.D);
    } else if (rptsidesettlcurrfxrtStr != null && rptsidesettlcurrfxrtStr.equals("M")) {
      trdCapRptSideGrpBlockT.setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT.M);
    }

    buildPartiesBlockT(trdCapRptSideGrpBlockT.getPty(), domSource);

    // Adding following mappings:
    // From Trade XML File TRANSACTIONS/TRADE/TRDCHARGE_set to TrdCaptRpt/RptSide/MiscFees/@Typ
    // From to TrdCaptRpt/RptSide/MiscFeesSub/@Typ
    // From to TrdCaptRpt/RptSide/MiscFees/@Typ
    // From to TrdCaptRpt/RptSide/MiscFees/@Qual
    trdCapRptSideGrpBlockT.getMiscFees().addAll(buildMiscFeesGrpBlockT(domSource));

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_SETTLE_LOCATION to
    // TrdCaptRpt/RptSide/SettlDetails/SettlParties/@ID
    // "D" to TrdCaptRpt/RptSide/SettlDetails/SettlParties/@Src
    // "90" to TrdCaptRpt/RptSide/SettlDetails/SettlParties/@R
    String settleLocationId =
            template.evaluateAsString(TradeMappingConstants.TRD_SETTLE_LOCATION, domSource);
    if (settleLocationId != null && !settleLocationId.isEmpty()) {
      SettlDetailsBlockT settlDetailsBlockT = new SettlDetailsBlockT();
      trdCapRptSideGrpBlockT.getSettlDetails().add(settlDetailsBlockT);
      SettlPartiesBlockT settlPartiesBlockT = new SettlPartiesBlockT();
      settlDetailsBlockT.getPty().add(settlPartiesBlockT);
      settlPartiesBlockT.setID(settleLocationId);
      settlPartiesBlockT.setSrc("D");
      settlPartiesBlockT.setR(BigInteger.valueOf(Long.valueOf("90")));
    }

    // Enrich Trade from Security
    if (securityForCUSIP != null) {

      build(trdCapRptSideGrpBlockT, securityForCUSIP);

      // Populating FIXML elements from REPO Leg
      buildPartiesBlockTForRepo(trdCapRptSideGrpBlockT.getPty(), domSource, securityForCUSIP);
    }

    // Enrich Trade from Price XML

    // Adding mapping from Price XML File SECURITY/ACCRUAL_DAYS	TrdCaptRpt/RptSide/@NumDaysInt
    // Covert from float to int (drop everything from the decimal point onwards)
    trdCapRptSideGrpBlockT.setNumDaysInt(getNumDaysInt(domSource, priceSource));

    trdCapRptSideGrpBlockT.setSide(getSide(domSource));

    // Adding mapping from Trade XML File TRANSACTIONS/TRADE/MULTI_FUND_ID	to
    // TrdCaptRpt/RptSide/@GrpID
    trdCapRptSideGrpBlockT.setGrpID(
            template.evaluateAsString(TradeMappingConstants.MULTI_FUND_ID, domSource));

    return trdCapRptSideGrpBlockT;
  }

  @Override
  public TradeCaptureReportMessageT build(
          DOMSource domSource, DOMSource securitySource, DOMSource priceSource, DOMSource issuerSource)
          throws Exception {
    this.tradeCaptureReportMessageT
            .getRptSide()
            .add(buildTrdCapRptSideGrpBlockT(domSource, securitySource, priceSource));
    return this.tradeCaptureReportMessageT;
  }

  */
/**
   * Identify the security ASSET element from Price XML corresponding to the CUSIP from the trade
   * nugget
   *
   * @param tradeSource
   * @param priceSource
   * @return
   *//*

  private BigInteger getNumDaysInt(final DOMSource tradeSource, final DOMSource priceSource) {

    String cusip = template.evaluateAsString(TradeMappingConstants.INSTRMTID, tradeSource);
    List<Node> assets = template.evaluateAsNodeList(TradeMappingConstants.PRICE, priceSource);
    String priceaccrualdays = getAccrualDaysFromPriceNode(cusip, priceSource);
    BigInteger numdaysInt = null;

    // Covert from float to int (drop everything from the decimal point onwards)
    if (priceaccrualdays != null && !priceaccrualdays.isEmpty()) {
      long priceaccrualdaysLong = (long) Float.parseFloat(priceaccrualdays);
      numdaysInt = BigInteger.valueOf(priceaccrualdaysLong);
    }
    return numdaysInt;
  }

  */
/**
   * Identify the price SECURITY element corresponding to the CUSIP from the trade nugget
   *
   * @param tradeCUSIP
   * @param priceSource
   * @return
   *//*

  private String getAccrualDaysFromPriceNode(String tradeCUSIP, final DOMSource priceSource) {

    String accrualDaysXPath =
            TradeMappingConstants.PRICE
                    + "[CUSIP=\""
                    + tradeCUSIP
                    + "\"]"
                    + TradeMappingConstants.PRICEACCRUALDAYS;
    return template.evaluateAsString(accrualDaysXPath, priceSource);
  }

  private String getSide(DOMSource tradeSource) {

    String side = null;
    String tranType = template.evaluateAsString(TradeMappingConstants.TRANTYPE, tradeSource);

    */
/*
    IF TRAN_TYPE contains ‘BUYSELL’ or ‘SELLBUY’
    THEN 7
    ELSEIF TRAN_TYPE contains ‘BUY’
       IF TRAN_TYPE contains ‘UNWIND’
       THEN 2
       ELSE 1
    ELSEIF TRAN_TYPE contains ‘SELL’
       IF TRAN_TYPE contains ‘UNWIND’
       THEN 1
       ELSE 2
    ELSE 7
     *//*

    if (tranType.contains("BUYSELL") || tranType.contains("SELLBUY")) {
      side = "7";
    } else if (tranType.contains("BUY")) {
      if (tranType.contains("UNWIND")) {
        side = "2";
      } else {
        side = "1";
      }
    } else if (tranType.contains("SELL")) {
      if (tranType.contains("UNWIND")) {
        side = "1";
      } else {
        side = "2";
      }
    } else {
      side = "7";
    }

    return side;
  }

  public void build(
          TrdCapRptSideGrpBlockT trdCapRptSideGrpBlockT, final DOMSource securityForCUSIP) {

    // Adding mapping from sm XML File ASSETS/ASSET/EXCHANGE to TrdCaptRpt/RptSide/@ExchSpeclInstr
    trdCapRptSideGrpBlockT.setExchSpeclInstr(
            getNodeValue(TradeMappingConstants.ASSETEXCHANGE, securityForCUSIP));

    // ACCRUAL_DT
    // Adding the following mappings:
    // froms m XML File ASSETS/ASSET/SETTLE_LOCATION to
    // TrdCaptRpt/RptSide/SettlDetails/SettlParties/@ID
    // "D" to TrdCaptRpt/RptSide/SettlDetails/SettlParties/@Src
    // "10" to TrdCaptRpt/RptSide/SettlDetails/SettlParties/@R
    String settlePartiesId =
            getNodeValue(TradeMappingConstants.ASSETSETTLELOCATION, securityForCUSIP);
    if (settlePartiesId != null && !settlePartiesId.isEmpty()) {
      SettlDetailsBlockT settlDetailsBlockT = new SettlDetailsBlockT();
      trdCapRptSideGrpBlockT.getSettlDetails().add(settlDetailsBlockT);
      SettlPartiesBlockT settlPartiesBlockT = new SettlPartiesBlockT();
      settlDetailsBlockT.getPty().add(settlPartiesBlockT);
      settlPartiesBlockT.setID(settlePartiesId);
      settlPartiesBlockT.setSrc("D");
      settlPartiesBlockT.setR(BigInteger.valueOf(Long.valueOf("10")));
    }
  }

  */
/**
   * Adding mappings from Trade XML File TRANSACTIONS/TRADE//TRDCHARGE_set to
   * TrdCaptRpt/RptSide/MiscFees
   *
   * @param domSource
   * @return
   *//*

  private List<MiscFeesGrpBlockT> buildMiscFeesGrpBlockT(final DOMSource domSource) {

    List<MiscFeesGrpBlockT> miscFeesGrpBlockTs = new ArrayList<>();
    List<Node> trdChargeSetNodes =
            template.evaluateAsNodeList(TradeMappingConstants.TRDCHARGESET, domSource);
    int size = trdChargeSetNodes.size();

    Map<String, MiscFeesGrpBlockT> categoryMiscFeesMap = new HashMap<>();

    for (int i = 1; i <= size; i++) {
      String trdChargeRecordContextPath =
              TradeMappingConstants.TRDCHARGESET
                      + "["
                      + i
                      + "]"
                      + TradeMappingConstants.TRDCHARGERECORD;
      List<Node> trdChargeRecords =
              template.evaluateAsNodeList(trdChargeRecordContextPath, domSource);
      int recordSize = trdChargeRecords.size();

      for (int j = 1; j <= recordSize; j++) {

        String category =
                template.evaluateAsString(
                        trdChargeRecordContextPath + "[" + j + "]" + TradeMappingConstants.CATEGORY,
                        domSource);
        BigDecimal trdChargeAmount =
                new BigDecimal(
                        template.evaluateAsString(
                                trdChargeRecordContextPath
                                        + "["
                                        + j
                                        + "]"
                                        + TradeMappingConstants.TRDCHARGEAMOUNT,
                                domSource));
        MiscFeesSubGrpBlockT miscFeesSubGrpBlockT = new MiscFeesSubGrpBlockT();
        miscFeesSubGrpBlockT.setTyp(category);
        miscFeesSubGrpBlockT.setAmt(trdChargeAmount);
        String miscFeesGrpType = TradeMappingConstants.CATEGORY_SUBTYPE_MAP.get(category);

        if (categoryMiscFeesMap.containsKey(miscFeesGrpType)) {
          MiscFeesGrpBlockT miscFeesGrpBlockT = categoryMiscFeesMap.get(miscFeesGrpType);
          miscFeesGrpBlockT.getMiscFeesSub().add(miscFeesSubGrpBlockT);
        } else {
          MiscFeesGrpBlockT miscFeesGrpBlockT = new MiscFeesGrpBlockT();
          categoryMiscFeesMap.put(miscFeesGrpType, miscFeesGrpBlockT);
          miscFeesGrpBlockT.getMiscFeesSub().add(miscFeesSubGrpBlockT);
          miscFeesGrpBlockT.setTyp(miscFeesGrpType);
          miscFeesGrpBlockT.setQual(
                  BigInteger.valueOf(TradeMappingConstants.CATEGORY_QUAL_MAP.get(category)));
        }
      }
    }

    miscFeesGrpBlockTs.addAll(categoryMiscFeesMap.values());

    return miscFeesGrpBlockTs;
  }

  protected void buildPartiesBlockT(List<PartiesBlockT> parties, final DOMSource domSource) {

    // Adding following mappings:
    // from Trade XML File TRANSACTIONS/TRADE/FUND to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "38" to TrdCaptRpt/RptSide/Parties/@R"
    buildPartiesBlockT(parties, TradeMappingConstants.TRDID, domSource, "D", "38");

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_CONFIRMED_BY to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "37" to TrdCaptRpt/RptSide/Parties/@R
    buildPartiesBlockT(parties, TradeMappingConstants.TRDCONFIRMEDBY, domSource, "D", "37");

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_COUNTERPARTY to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "17" to TrdCaptRpt/RptSide/Parties/@R
    buildPartiesBlockT(parties, TradeMappingConstants.TRDCOUNTERPARTY, domSource, "D", "17");

    // Adding following mappings:
    // from Trade XML File TRANSACTIONS/TRADE/TRD_EX_BROKER_CODE to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "1" to TrdCaptRpt/RptSide/Parties/@R"
    buildPartiesBlockT(parties, TradeMappingConstants.RPTSIDEPTYIDBROKER, domSource, "D", "1");

    // Adding following mappings:
    // from Trade XML File TRANSACTIONS/TRADE/BROKER_REASON to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "122" to TrdCaptRpt/RptSide/Parties/@R"
    buildPartiesBlockT(parties, TradeMappingConstants.BROKERREASONID, domSource, "D", "122");

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_MODIFIED_BY to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "118" to TrdCaptRpt/RptSide/Parties/@R
    buildPartiesBlockT(parties, TradeMappingConstants.TRDMODIFIEDBY, domSource, "D", "118");

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_REVIEWED_BY to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "53" to TrdCaptRpt/RptSide/Parties/@R
    buildPartiesBlockT(parties, TradeMappingConstants.TRDREVIEWEDBY, domSource, "D", "53");

    // Adding the following mappings:
    // Trade XML File TRANSACTIONS/TRADE/TRD_TRADER to TrdCaptRpt/RptSide/Parties/@ID
    //  "D" to TrdCaptRpt/RptSide/Parties/@Src
    //  "12" to TrdCaptRpt/RptSide/Parties/@R
    buildPartiesBlockT(parties, TradeMappingConstants.RPTSIDEPTYIDTRADER, domSource, "D", "12");
  }

  */
/**
   * Populating FIXML elements from the ASSET corresponding to REPO Leg
   *
   * @param parties
   * @param repoSource
   * @param securitySource
   *//*

  private void buildPartiesBlockTForRepo(
          List<PartiesBlockT> parties, final DOMSource repoSource, final DOMSource securitySource) {

    // Adding the following mappings:
    // From XML File ASSETS/ASSET/LEAD_MGR to TrdCaptRpt/RptSide/Pty/@ID
    // From "D" to TrdCaptRpt/RptSide/Pty/@Src
    // From "4" to TrdCaptRpt/RptSide/Pty/@R
    String leadMgr = getNodeValue(TradeMappingConstants.LEAD_MGR, securitySource);
    if (leadMgr != null && !leadMgr.isEmpty()) {
      PartiesBlockT partiesBlockT = new PartiesBlockT();
      partiesBlockT.setID(leadMgr);
      partiesBlockT.setSrc("D");
      partiesBlockT.setR(BigInteger.valueOf(Long.valueOf("4")));
      parties.add(partiesBlockT);
    }
  }

  private void addPtysSubGrpBlockT(List<PtysSubGrpBlockT> sub, String id, String type) {

    if (id != null && !id.isEmpty()) {
      PtysSubGrpBlockT ptysSubGrpBlockT = new PtysSubGrpBlockT();
      ptysSubGrpBlockT.setID(id);
      ptysSubGrpBlockT.setTyp(type);
      sub.add(ptysSubGrpBlockT);
    }
  }

  protected void buildPartiesBlockT(
          List<PartiesBlockT> parties, String xPath, final DOMSource domSource, String src, String r) {

    String id = template.evaluateAsString(xPath, domSource);
    PartiesBlockT partiesBlockT = null;

    if (id != null && !id.isEmpty()) {
      partiesBlockT = new PartiesBlockT();
      partiesBlockT.setID(template.evaluateAsString(xPath, domSource));
      partiesBlockT.setSrc(src);
      partiesBlockT.setR(BigInteger.valueOf(Long.valueOf(r)));
      parties.add(partiesBlockT);

      // START Mappings for TrdCaptRpt/RptSide/Parties/PtysSubGrp
      if (xPath.equals(TradeMappingConstants.RPTSIDEPTYIDBROKER)) {

        // Checking following mappings:
        // Trade XML File Trade XML File TRANSACTIONS/TRADE/EX_SUB_BROKER_ID to
        // TrdCaptRpt/RptSide/Parties/PtysSubGrp/@ID
        // "25" to TrdCaptRpt/RptSide/Parties/PtysSubGrp/@Typ
        addPtysSubGrpBlockT(
                partiesBlockT.getSub(),
                template.evaluateAsString(TradeMappingConstants.INSTRMTSUBID, domSource),
                "25");
      }

      if (xPath.equals(TradeMappingConstants.TRDCOUNTERPARTY)) {

        // Adding the following mappings:
        // Trade XML File BROKER/COUNTERPARTIES/COUNTERPARTY/BROKER_TYPE to
        // TrdCaptRpt/RptSide/Parties/PtysSubGrp/@ID
        // "40" to TrdCaptRpt/RptSide/Parties/PtysSubGrp/@Typ
        List<String> brokerIds = getBrokerIds(domSource);
        if (!brokerIds.isEmpty()) {

          for (String brokerId : brokerIds) {
            addPtysSubGrpBlockT(partiesBlockT.getSub(), brokerId, "40");
          }
        }

        // Checking following mappings:
        // Trade XML File Trade XML File TRANSACTIONS/TRADE/SUB_BROKER_ID to
        // TrdCaptRpt/RptSide/Parties/PtysSubGrp/@ID
        // "25" to TrdCaptRpt/RptSide/Parties/PtysSubGrp/@Typ
        addPtysSubGrpBlockT(
                partiesBlockT.getSub(),
                template.evaluateAsString(TradeMappingConstants.SUBBROKERID, domSource),
                "25");

        // Checking following mappings:
        // Trade XML File Trade XML File TRANSACTIONS/TRADE/TRD_EX_DESK_TYPE to
        // TrdCaptRpt/RptSide/Parties/PtysSubGrp/@ID
        // "52" to TrdCaptRpt/RptSide/Parties/PtysSubGrp/@Typ
        addPtysSubGrpBlockT(
                partiesBlockT.getSub(),
                template.evaluateAsString(TradeMappingConstants.TRDEXDESKTYPE, domSource),
                "24");
      }
      // END Mappings for TrdCaptRpt/RptSide/Parties/PtysSubGrp
    }
  }

  private List<String> getBrokerIds(final DOMSource tradeSource) {

    List<String> brokerIds = new ArrayList<>();

    String counterPartiesXPath = TradeMappingConstants.BROKERCOUNTERPARTIES;
    List<Node> counterParties = template.evaluateAsNodeList(counterPartiesXPath, tradeSource);
    for (int i = 1; i <= counterParties.size(); i++) {

      String counterPartyXPath =
              counterPartiesXPath + "[" + i + "]" + TradeMappingConstants.COUNTERPARTY;
      List<Node> counterPartyElements = template.evaluateAsNodeList(counterPartyXPath, tradeSource);

      for (int j = 1; j <= counterPartyElements.size(); j++) {
        String brokerId =
                template.evaluateAsString(
                        counterPartyXPath + "[" + j + "]/" + TradeMappingConstants.COUNTERPARTYBROKERID,
                        tradeSource);

        if (brokerId != null && !brokerId.isEmpty()) {
          brokerIds.add(brokerId);
        }
      }
    }

    return brokerIds;
  }
}
*/

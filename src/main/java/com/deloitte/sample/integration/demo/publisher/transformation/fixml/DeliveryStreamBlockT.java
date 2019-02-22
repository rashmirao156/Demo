//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for DeliveryStream_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeliveryStream_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DeliveryStreamElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DeliveryStreamAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "DeliveryStream_Block_t",
  propOrder = {"cmdtySrc", "cycle"}
)
public class DeliveryStreamBlockT {

  @XmlElement(name = "CmdtySrc")
  protected List<DeliveryStreamCommoditySourceGrpBlockT> cmdtySrc;

  @XmlElement(name = "Cycle")
  protected List<DeliveryStreamCycleGrpBlockT> cycle;

  @XmlAttribute(name = "Typ")
  protected BigInteger typ;

  @XmlAttribute(name = "Ppln")
  protected String ppln;

  @XmlAttribute(name = "EntryPnt")
  protected String entryPnt;

  @XmlAttribute(name = "WthdrwlPnt")
  protected String wthdrwlPnt;

  @XmlAttribute(name = "DlvryPnt")
  protected String dlvryPnt;

  @XmlAttribute(name = "DlvryPntSrc")
  protected BigInteger dlvryPntSrc;

  @XmlAttribute(name = "DlvryPntDesc")
  protected String dlvryPntDesc;

  @XmlAttribute(name = "DlvryRstctn")
  protected BigInteger dlvryRstctn;

  @XmlAttribute(name = "Cntgncy")
  protected String cntgncy;

  @XmlAttribute(name = "CntgPty")
  protected BigInteger cntgPty;

  @XmlAttribute(name = "DlvrAtSrc")
  protected String dlvrAtSrc;

  @XmlAttribute(name = "RiskApprtnmt")
  protected String riskApprtnmt;

  @XmlAttribute(name = "RiskApprtnmtSrc")
  protected String riskApprtnmtSrc;

  @XmlAttribute(name = "TtlXfer")
  protected String ttlXfer;

  @XmlAttribute(name = "TtlXferCond")
  protected BigInteger ttlXferCond;

  @XmlAttribute(name = "Imprtr")
  protected String imprtr;

  @XmlAttribute(name = "NegtvTlrnc")
  protected BigDecimal negtvTlrnc;

  @XmlAttribute(name = "PostvTlrnc")
  protected BigDecimal postvTlrnc;

  @XmlAttribute(name = "TlrncUOM")
  protected UnitOfMeasureEnumT tlrncUOM;

  @XmlAttribute(name = "TlrncTyp")
  protected BigInteger tlrncTyp;

  @XmlAttribute(name = "TlrncOptSide")
  protected BigInteger tlrncOptSide;

  @XmlAttribute(name = "TotPostvTlrnc")
  protected BigDecimal totPostvTlrnc;

  @XmlAttribute(name = "TotNegtvTlrnc")
  protected BigDecimal totNegtvTlrnc;

  @XmlAttribute(name = "CnvrsnFctr")
  protected BigDecimal cnvrsnFctr;

  @XmlAttribute(name = "Eqpmt")
  protected String eqpmt;

  @XmlAttribute(name = "ElctngSide")
  protected BigInteger elctngSide;

  @XmlAttribute(name = "RteChrtr")
  protected String rteChrtr;

  /**
   * Gets the value of the cmdtySrc property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the cmdtySrc property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCmdtySrc().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * DeliveryStreamCommoditySourceGrpBlockT }
   */
  public List<DeliveryStreamCommoditySourceGrpBlockT> getCmdtySrc() {
    if (cmdtySrc == null) {
      cmdtySrc = new ArrayList<DeliveryStreamCommoditySourceGrpBlockT>();
    }
    return this.cmdtySrc;
  }

  /**
   * Gets the value of the cycle property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the cycle property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCycle().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link DeliveryStreamCycleGrpBlockT
   * }
   */
  public List<DeliveryStreamCycleGrpBlockT> getCycle() {
    if (cycle == null) {
      cycle = new ArrayList<DeliveryStreamCycleGrpBlockT>();
    }
    return this.cycle;
  }

  /**
   * Gets the value of the typ property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTyp() {
    return typ;
  }

  /**
   * Sets the value of the typ property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTyp(BigInteger value) {
    this.typ = value;
  }

  /**
   * Gets the value of the ppln property.
   *
   * @return possible object is {@link String }
   */
  public String getPpln() {
    return ppln;
  }

  /**
   * Sets the value of the ppln property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPpln(String value) {
    this.ppln = value;
  }

  /**
   * Gets the value of the entryPnt property.
   *
   * @return possible object is {@link String }
   */
  public String getEntryPnt() {
    return entryPnt;
  }

  /**
   * Sets the value of the entryPnt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEntryPnt(String value) {
    this.entryPnt = value;
  }

  /**
   * Gets the value of the wthdrwlPnt property.
   *
   * @return possible object is {@link String }
   */
  public String getWthdrwlPnt() {
    return wthdrwlPnt;
  }

  /**
   * Sets the value of the wthdrwlPnt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setWthdrwlPnt(String value) {
    this.wthdrwlPnt = value;
  }

  /**
   * Gets the value of the dlvryPnt property.
   *
   * @return possible object is {@link String }
   */
  public String getDlvryPnt() {
    return dlvryPnt;
  }

  /**
   * Sets the value of the dlvryPnt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDlvryPnt(String value) {
    this.dlvryPnt = value;
  }

  /**
   * Gets the value of the dlvryPntSrc property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getDlvryPntSrc() {
    return dlvryPntSrc;
  }

  /**
   * Sets the value of the dlvryPntSrc property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setDlvryPntSrc(BigInteger value) {
    this.dlvryPntSrc = value;
  }

  /**
   * Gets the value of the dlvryPntDesc property.
   *
   * @return possible object is {@link String }
   */
  public String getDlvryPntDesc() {
    return dlvryPntDesc;
  }

  /**
   * Sets the value of the dlvryPntDesc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDlvryPntDesc(String value) {
    this.dlvryPntDesc = value;
  }

  /**
   * Gets the value of the dlvryRstctn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getDlvryRstctn() {
    return dlvryRstctn;
  }

  /**
   * Sets the value of the dlvryRstctn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setDlvryRstctn(BigInteger value) {
    this.dlvryRstctn = value;
  }

  /**
   * Gets the value of the cntgncy property.
   *
   * @return possible object is {@link String }
   */
  public String getCntgncy() {
    return cntgncy;
  }

  /**
   * Sets the value of the cntgncy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCntgncy(String value) {
    this.cntgncy = value;
  }

  /**
   * Gets the value of the cntgPty property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getCntgPty() {
    return cntgPty;
  }

  /**
   * Sets the value of the cntgPty property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setCntgPty(BigInteger value) {
    this.cntgPty = value;
  }

  /**
   * Gets the value of the dlvrAtSrc property.
   *
   * @return possible object is {@link String }
   */
  public String getDlvrAtSrc() {
    return dlvrAtSrc;
  }

  /**
   * Sets the value of the dlvrAtSrc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDlvrAtSrc(String value) {
    this.dlvrAtSrc = value;
  }

  /**
   * Gets the value of the riskApprtnmt property.
   *
   * @return possible object is {@link String }
   */
  public String getRiskApprtnmt() {
    return riskApprtnmt;
  }

  /**
   * Sets the value of the riskApprtnmt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRiskApprtnmt(String value) {
    this.riskApprtnmt = value;
  }

  /**
   * Gets the value of the riskApprtnmtSrc property.
   *
   * @return possible object is {@link String }
   */
  public String getRiskApprtnmtSrc() {
    return riskApprtnmtSrc;
  }

  /**
   * Sets the value of the riskApprtnmtSrc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRiskApprtnmtSrc(String value) {
    this.riskApprtnmtSrc = value;
  }

  /**
   * Gets the value of the ttlXfer property.
   *
   * @return possible object is {@link String }
   */
  public String getTtlXfer() {
    return ttlXfer;
  }

  /**
   * Sets the value of the ttlXfer property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTtlXfer(String value) {
    this.ttlXfer = value;
  }

  /**
   * Gets the value of the ttlXferCond property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTtlXferCond() {
    return ttlXferCond;
  }

  /**
   * Sets the value of the ttlXferCond property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTtlXferCond(BigInteger value) {
    this.ttlXferCond = value;
  }

  /**
   * Gets the value of the imprtr property.
   *
   * @return possible object is {@link String }
   */
  public String getImprtr() {
    return imprtr;
  }

  /**
   * Sets the value of the imprtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setImprtr(String value) {
    this.imprtr = value;
  }

  /**
   * Gets the value of the negtvTlrnc property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getNegtvTlrnc() {
    return negtvTlrnc;
  }

  /**
   * Sets the value of the negtvTlrnc property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setNegtvTlrnc(BigDecimal value) {
    this.negtvTlrnc = value;
  }

  /**
   * Gets the value of the postvTlrnc property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPostvTlrnc() {
    return postvTlrnc;
  }

  /**
   * Sets the value of the postvTlrnc property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPostvTlrnc(BigDecimal value) {
    this.postvTlrnc = value;
  }

  /**
   * Gets the value of the tlrncUOM property.
   *
   * @return possible object is {@link UnitOfMeasureEnumT }
   */
  public UnitOfMeasureEnumT getTlrncUOM() {
    return tlrncUOM;
  }

  /**
   * Sets the value of the tlrncUOM property.
   *
   * @param value allowed object is {@link UnitOfMeasureEnumT }
   */
  public void setTlrncUOM(UnitOfMeasureEnumT value) {
    this.tlrncUOM = value;
  }

  /**
   * Gets the value of the tlrncTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTlrncTyp() {
    return tlrncTyp;
  }

  /**
   * Sets the value of the tlrncTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTlrncTyp(BigInteger value) {
    this.tlrncTyp = value;
  }

  /**
   * Gets the value of the tlrncOptSide property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTlrncOptSide() {
    return tlrncOptSide;
  }

  /**
   * Sets the value of the tlrncOptSide property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTlrncOptSide(BigInteger value) {
    this.tlrncOptSide = value;
  }

  /**
   * Gets the value of the totPostvTlrnc property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getTotPostvTlrnc() {
    return totPostvTlrnc;
  }

  /**
   * Sets the value of the totPostvTlrnc property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setTotPostvTlrnc(BigDecimal value) {
    this.totPostvTlrnc = value;
  }

  /**
   * Gets the value of the totNegtvTlrnc property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getTotNegtvTlrnc() {
    return totNegtvTlrnc;
  }

  /**
   * Sets the value of the totNegtvTlrnc property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setTotNegtvTlrnc(BigDecimal value) {
    this.totNegtvTlrnc = value;
  }

  /**
   * Gets the value of the cnvrsnFctr property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCnvrsnFctr() {
    return cnvrsnFctr;
  }

  /**
   * Sets the value of the cnvrsnFctr property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCnvrsnFctr(BigDecimal value) {
    this.cnvrsnFctr = value;
  }

  /**
   * Gets the value of the eqpmt property.
   *
   * @return possible object is {@link String }
   */
  public String getEqpmt() {
    return eqpmt;
  }

  /**
   * Sets the value of the eqpmt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEqpmt(String value) {
    this.eqpmt = value;
  }

  /**
   * Gets the value of the elctngSide property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getElctngSide() {
    return elctngSide;
  }

  /**
   * Sets the value of the elctngSide property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setElctngSide(BigInteger value) {
    this.elctngSide = value;
  }

  /**
   * Gets the value of the rteChrtr property.
   *
   * @return possible object is {@link String }
   */
  public String getRteChrtr() {
    return rteChrtr;
  }

  /**
   * Sets the value of the rteChrtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRteChrtr(String value) {
    this.rteChrtr = value;
  }
}

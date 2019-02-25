//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * MarginRequirementInquiry can be found in Volume 5 of the specification
 *
 * <p>Java class for MarginRequirementInquiry_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarginRequirementInquiry_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarginRequirementInquiryElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarginRequirementInquiryAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "MarginRequirementInquiry_message_t",
  propOrder = {"mgnReqmtInqQual", "pty", "instrmt"}
)
public class MarginRequirementInquiryMessageT extends AbstractMessageT {

  @XmlElement(name = "MgnReqmtInqQual", required = true)
  protected List<MarginReqmtInqQualGrpBlockT> mgnReqmtInqQual;

  @XmlElement(name = "Pty")
  protected List<PartiesBlockT> pty;

  @XmlElement(name = "Instrmt")
  protected InstrumentBlockT instrmt;

  @XmlAttribute(name = "ID", required = true)
  protected String id;

  @XmlAttribute(name = "SubReqTyp")
  protected String subReqTyp;

  @XmlAttribute(name = "RspTransportTyp")
  protected BigInteger rspTransportTyp;

  @XmlAttribute(name = "RspDest")
  protected String rspDest;

  @XmlAttribute(name = "BizDt")
  protected XMLGregorianCalendar bizDt;

  @XmlAttribute(name = "SetSesID")
  protected SettlSessIDEnumT setSesID;

  @XmlAttribute(name = "SetSesSub")
  protected String setSesSub;

  @XmlAttribute(name = "Clss")
  protected String clss;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  /**
   * Gets the value of the mgnReqmtInqQual property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the mgnReqmtInqQual property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getMgnReqmtInqQual().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link MarginReqmtInqQualGrpBlockT
   * }
   */
  public List<MarginReqmtInqQualGrpBlockT> getMgnReqmtInqQual() {
    if (mgnReqmtInqQual == null) {
      mgnReqmtInqQual = new ArrayList<MarginReqmtInqQualGrpBlockT>();
    }
    return this.mgnReqmtInqQual;
  }

  /**
   * Gets the value of the pty property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the pty property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPty().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PartiesBlockT }
   */
  public List<PartiesBlockT> getPty() {
    if (pty == null) {
      pty = new ArrayList<PartiesBlockT>();
    }
    return this.pty;
  }

  /**
   * Gets the value of the instrmt property.
   *
   * @return possible object is {@link InstrumentBlockT }
   */
  public InstrumentBlockT getInstrmt() {
    return instrmt;
  }

  /**
   * Sets the value of the instrmt property.
   *
   * @param value allowed object is {@link InstrumentBlockT }
   */
  public void setInstrmt(InstrumentBlockT value) {
    this.instrmt = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setID(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the subReqTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getSubReqTyp() {
    return subReqTyp;
  }

  /**
   * Sets the value of the subReqTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSubReqTyp(String value) {
    this.subReqTyp = value;
  }

  /**
   * Gets the value of the rspTransportTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getRspTransportTyp() {
    return rspTransportTyp;
  }

  /**
   * Sets the value of the rspTransportTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setRspTransportTyp(BigInteger value) {
    this.rspTransportTyp = value;
  }

  /**
   * Gets the value of the rspDest property.
   *
   * @return possible object is {@link String }
   */
  public String getRspDest() {
    return rspDest;
  }

  /**
   * Sets the value of the rspDest property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRspDest(String value) {
    this.rspDest = value;
  }

  /**
   * Gets the value of the bizDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBizDt() {
    return bizDt;
  }

  /**
   * Sets the value of the bizDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setBizDt(XMLGregorianCalendar value) {
    this.bizDt = value;
  }

  /**
   * Gets the value of the setSesID property.
   *
   * @return possible object is {@link SettlSessIDEnumT }
   */
  public SettlSessIDEnumT getSetSesID() {
    return setSesID;
  }

  /**
   * Sets the value of the setSesID property.
   *
   * @param value allowed object is {@link SettlSessIDEnumT }
   */
  public void setSetSesID(SettlSessIDEnumT value) {
    this.setSesID = value;
  }

  /**
   * Gets the value of the setSesSub property.
   *
   * @return possible object is {@link String }
   */
  public String getSetSesSub() {
    return setSesSub;
  }

  /**
   * Sets the value of the setSesSub property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSetSesSub(String value) {
    this.setSesSub = value;
  }

  /**
   * Gets the value of the clss property.
   *
   * @return possible object is {@link String }
   */
  public String getClss() {
    return clss;
  }

  /**
   * Sets the value of the clss property.
   *
   * @param value allowed object is {@link String }
   */
  public void setClss(String value) {
    this.clss = value;
  }

  /**
   * Gets the value of the txnTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTxnTm() {
    return txnTm;
  }

  /**
   * Sets the value of the txnTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTxnTm(XMLGregorianCalendar value) {
    this.txnTm = value;
  }

  /**
   * Gets the value of the txt property.
   *
   * @return possible object is {@link String }
   */
  public String getTxt() {
    return txt;
  }

  /**
   * Sets the value of the txt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTxt(String value) {
    this.txt = value;
  }

  /**
   * Gets the value of the encTxtLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncTxtLen() {
    return encTxtLen;
  }

  /**
   * Sets the value of the encTxtLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncTxtLen(BigInteger value) {
    this.encTxtLen = value;
  }

  /**
   * Gets the value of the encTxt property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncTxt() {
    return encTxt;
  }

  /**
   * Sets the value of the encTxt property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncTxt(byte[] value) {
    this.encTxt = value;
  }
}
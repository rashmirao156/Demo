//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Java class for AdditionalTermBondRefGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AdditionalTermBondRefGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AdditionalTermBondRefGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AdditionalTermBondRefGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTermBondRefGrp_Block_t")
public class AdditionalTermBondRefGrpBlockT {

  @XmlAttribute(name = "ID")
  protected String id;

  @XmlAttribute(name = "Src")
  protected String src;

  @XmlAttribute(name = "Desc")
  protected String desc;

  @XmlAttribute(name = "EncDescLen")
  protected BigInteger encDescLen;

  @XmlAttribute(name = "EncDesc")
  protected byte[] encDesc;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  @XmlAttribute(name = "Issr")
  protected String issr;

  @XmlAttribute(name = "EncIssrLen")
  protected BigInteger encIssrLen;

  @XmlAttribute(name = "EncIssr")
  protected byte[] encIssr;

  @XmlAttribute(name = "Snrty")
  protected SeniorityEnumT snrty;

  @XmlAttribute(name = "CpnTyp")
  protected BigInteger cpnTyp;

  @XmlAttribute(name = "CpnRt")
  protected BigDecimal cpnRt;

  @XmlAttribute(name = "MatDt")
  protected XMLGregorianCalendar matDt;

  @XmlAttribute(name = "Par")
  protected BigDecimal par;

  @XmlAttribute(name = "CurTotAmt")
  protected BigDecimal curTotAmt;

  @XmlAttribute(name = "CpnPeriod")
  protected BigInteger cpnPeriod;

  @XmlAttribute(name = "CpnUnit")
  protected CouponFrequencyUnitEnumT cpnUnit;

  @XmlAttribute(name = "DayCnt")
  protected String dayCnt;

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
   * Gets the value of the src property.
   *
   * @return possible object is {@link String }
   */
  public String getSrc() {
    return src;
  }

  /**
   * Sets the value of the src property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSrc(String value) {
    this.src = value;
  }

  /**
   * Gets the value of the desc property.
   *
   * @return possible object is {@link String }
   */
  public String getDesc() {
    return desc;
  }

  /**
   * Sets the value of the desc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDesc(String value) {
    this.desc = value;
  }

  /**
   * Gets the value of the encDescLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncDescLen() {
    return encDescLen;
  }

  /**
   * Sets the value of the encDescLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncDescLen(BigInteger value) {
    this.encDescLen = value;
  }

  /**
   * Gets the value of the encDesc property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncDesc() {
    return encDesc;
  }

  /**
   * Sets the value of the encDesc property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncDesc(byte[] value) {
    this.encDesc = value;
  }

  /**
   * Gets the value of the ccy property.
   *
   * @return possible object is {@link String }
   */
  public String getCcy() {
    return ccy;
  }

  /**
   * Sets the value of the ccy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCcy(String value) {
    this.ccy = value;
  }

  /**
   * Gets the value of the issr property.
   *
   * @return possible object is {@link String }
   */
  public String getIssr() {
    return issr;
  }

  /**
   * Sets the value of the issr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setIssr(String value) {
    this.issr = value;
  }

  /**
   * Gets the value of the encIssrLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncIssrLen() {
    return encIssrLen;
  }

  /**
   * Sets the value of the encIssrLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncIssrLen(BigInteger value) {
    this.encIssrLen = value;
  }

  /**
   * Gets the value of the encIssr property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncIssr() {
    return encIssr;
  }

  /**
   * Sets the value of the encIssr property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncIssr(byte[] value) {
    this.encIssr = value;
  }

  /**
   * Gets the value of the snrty property.
   *
   * @return possible object is {@link SeniorityEnumT }
   */
  public SeniorityEnumT getSnrty() {
    return snrty;
  }

  /**
   * Sets the value of the snrty property.
   *
   * @param value allowed object is {@link SeniorityEnumT }
   */
  public void setSnrty(SeniorityEnumT value) {
    this.snrty = value;
  }

  /**
   * Gets the value of the cpnTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getCpnTyp() {
    return cpnTyp;
  }

  /**
   * Sets the value of the cpnTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setCpnTyp(BigInteger value) {
    this.cpnTyp = value;
  }

  /**
   * Gets the value of the cpnRt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCpnRt() {
    return cpnRt;
  }

  /**
   * Sets the value of the cpnRt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCpnRt(BigDecimal value) {
    this.cpnRt = value;
  }

  /**
   * Gets the value of the matDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getMatDt() {
    return matDt;
  }

  /**
   * Sets the value of the matDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setMatDt(XMLGregorianCalendar value) {
    this.matDt = value;
  }

  /**
   * Gets the value of the par property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPar() {
    return par;
  }

  /**
   * Sets the value of the par property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPar(BigDecimal value) {
    this.par = value;
  }

  /**
   * Gets the value of the curTotAmt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCurTotAmt() {
    return curTotAmt;
  }

  /**
   * Sets the value of the curTotAmt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCurTotAmt(BigDecimal value) {
    this.curTotAmt = value;
  }

  /**
   * Gets the value of the cpnPeriod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getCpnPeriod() {
    return cpnPeriod;
  }

  /**
   * Sets the value of the cpnPeriod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setCpnPeriod(BigInteger value) {
    this.cpnPeriod = value;
  }

  /**
   * Gets the value of the cpnUnit property.
   *
   * @return possible object is {@link CouponFrequencyUnitEnumT }
   */
  public CouponFrequencyUnitEnumT getCpnUnit() {
    return cpnUnit;
  }

  /**
   * Sets the value of the cpnUnit property.
   *
   * @param value allowed object is {@link CouponFrequencyUnitEnumT }
   */
  public void setCpnUnit(CouponFrequencyUnitEnumT value) {
    this.cpnUnit = value;
  }

  /**
   * Gets the value of the dayCnt property.
   *
   * @return possible object is {@link String }
   */
  public String getDayCnt() {
    return dayCnt;
  }

  /**
   * Sets the value of the dayCnt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDayCnt(String value) {
    this.dayCnt = value;
  }
}

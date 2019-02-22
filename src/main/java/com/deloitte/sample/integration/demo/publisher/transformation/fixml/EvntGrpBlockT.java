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
 * Java class for EvntGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EvntGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}EvntGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}EvntGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvntGrp_Block_t")
public class EvntGrpBlockT {

  @XmlAttribute(name = "EventTyp")
  protected String eventTyp;

  @XmlAttribute(name = "Dt")
  protected XMLGregorianCalendar dt;

  @XmlAttribute(name = "Tm")
  protected XMLGregorianCalendar tm;

  @XmlAttribute(name = "TmUnit")
  protected EventTimeUnitEnumT tmUnit;

  @XmlAttribute(name = "TmPeriod")
  protected BigInteger tmPeriod;

  @XmlAttribute(name = "MoYr")
  protected String moYr;

  @XmlAttribute(name = "Px")
  protected BigDecimal px;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  /**
   * Gets the value of the eventTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getEventTyp() {
    return eventTyp;
  }

  /**
   * Sets the value of the eventTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEventTyp(String value) {
    this.eventTyp = value;
  }

  /**
   * Gets the value of the dt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDt() {
    return dt;
  }

  /**
   * Sets the value of the dt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDt(XMLGregorianCalendar value) {
    this.dt = value;
  }

  /**
   * Gets the value of the tm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTm() {
    return tm;
  }

  /**
   * Sets the value of the tm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTm(XMLGregorianCalendar value) {
    this.tm = value;
  }

  /**
   * Gets the value of the tmUnit property.
   *
   * @return possible object is {@link EventTimeUnitEnumT }
   */
  public EventTimeUnitEnumT getTmUnit() {
    return tmUnit;
  }

  /**
   * Sets the value of the tmUnit property.
   *
   * @param value allowed object is {@link EventTimeUnitEnumT }
   */
  public void setTmUnit(EventTimeUnitEnumT value) {
    this.tmUnit = value;
  }

  /**
   * Gets the value of the tmPeriod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTmPeriod() {
    return tmPeriod;
  }

  /**
   * Sets the value of the tmPeriod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTmPeriod(BigInteger value) {
    this.tmPeriod = value;
  }

  /**
   * Gets the value of the moYr property.
   *
   * @return possible object is {@link String }
   */
  public String getMoYr() {
    return moYr;
  }

  /**
   * Sets the value of the moYr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMoYr(String value) {
    this.moYr = value;
  }

  /**
   * Gets the value of the px property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPx() {
    return px;
  }

  /**
   * Sets the value of the px property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPx(BigDecimal value) {
    this.px = value;
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

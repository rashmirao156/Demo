//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for DeliveryScheduleGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeliveryScheduleGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DeliveryScheduleGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DeliveryScheduleGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "DeliveryScheduleGrp_Block_t",
  propOrder = {"day"}
)
public class DeliveryScheduleGrpBlockT {

  @XmlElement(name = "Day")
  protected List<DeliveryScheduleSettlDayGrpBlockT> day;

  @XmlAttribute(name = "Typ")
  protected BigInteger typ;

  @XmlAttribute(name = "XID")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  protected String xid;

  @XmlAttribute(name = "Notl")
  protected BigDecimal notl;

  @XmlAttribute(name = "NotlUOM")
  protected UnitOfMeasureEnumT notlUOM;

  @XmlAttribute(name = "NotlFreq")
  protected BigInteger notlFreq;

  @XmlAttribute(name = "NegtvTlrnc")
  protected BigDecimal negtvTlrnc;

  @XmlAttribute(name = "PostvTlrnc")
  protected BigDecimal postvTlrnc;

  @XmlAttribute(name = "TlrncUOM")
  protected UnitOfMeasureEnumT tlrncUOM;

  @XmlAttribute(name = "TlrncTyp")
  protected BigInteger tlrncTyp;

  @XmlAttribute(name = "Ctry")
  protected String ctry;

  @XmlAttribute(name = "TZ")
  protected String tz;

  @XmlAttribute(name = "FlowTyp")
  protected BigInteger flowTyp;

  @XmlAttribute(name = "Holidays")
  protected BigInteger holidays;

  /**
   * Gets the value of the day property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the day property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getDay().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * DeliveryScheduleSettlDayGrpBlockT }
   */
  public List<DeliveryScheduleSettlDayGrpBlockT> getDay() {
    if (day == null) {
      day = new ArrayList<DeliveryScheduleSettlDayGrpBlockT>();
    }
    return this.day;
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
   * Gets the value of the xid property.
   *
   * @return possible object is {@link String }
   */
  public String getXID() {
    return xid;
  }

  /**
   * Sets the value of the xid property.
   *
   * @param value allowed object is {@link String }
   */
  public void setXID(String value) {
    this.xid = value;
  }

  /**
   * Gets the value of the notl property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getNotl() {
    return notl;
  }

  /**
   * Sets the value of the notl property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setNotl(BigDecimal value) {
    this.notl = value;
  }

  /**
   * Gets the value of the notlUOM property.
   *
   * @return possible object is {@link UnitOfMeasureEnumT }
   */
  public UnitOfMeasureEnumT getNotlUOM() {
    return notlUOM;
  }

  /**
   * Sets the value of the notlUOM property.
   *
   * @param value allowed object is {@link UnitOfMeasureEnumT }
   */
  public void setNotlUOM(UnitOfMeasureEnumT value) {
    this.notlUOM = value;
  }

  /**
   * Gets the value of the notlFreq property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getNotlFreq() {
    return notlFreq;
  }

  /**
   * Sets the value of the notlFreq property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setNotlFreq(BigInteger value) {
    this.notlFreq = value;
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
   * Gets the value of the ctry property.
   *
   * @return possible object is {@link String }
   */
  public String getCtry() {
    return ctry;
  }

  /**
   * Sets the value of the ctry property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCtry(String value) {
    this.ctry = value;
  }

  /**
   * Gets the value of the tz property.
   *
   * @return possible object is {@link String }
   */
  public String getTZ() {
    return tz;
  }

  /**
   * Sets the value of the tz property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTZ(String value) {
    this.tz = value;
  }

  /**
   * Gets the value of the flowTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFlowTyp() {
    return flowTyp;
  }

  /**
   * Sets the value of the flowTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFlowTyp(BigInteger value) {
    this.flowTyp = value;
  }

  /**
   * Gets the value of the holidays property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getHolidays() {
    return holidays;
  }

  /**
   * Sets the value of the holidays property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setHolidays(BigInteger value) {
    this.holidays = value;
  }
}
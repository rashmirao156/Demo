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
 * Java class for TradePositionQty_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TradePositionQty_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradePositionQtyElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradePositionQtyAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePositionQty_Block_t")
public class TradePositionQtyBlockT {

  @XmlAttribute(name = "Typ")
  protected PosTypeEnumT typ;

  @XmlAttribute(name = "Long")
  protected BigDecimal _long;

  @XmlAttribute(name = "Short")
  protected BigDecimal _short;

  @XmlAttribute(name = "CvrdQty")
  protected BigDecimal cvrdQty;

  @XmlAttribute(name = "Stat")
  protected BigInteger stat;

  @XmlAttribute(name = "QtyDt")
  protected XMLGregorianCalendar qtyDt;

  /**
   * Gets the value of the typ property.
   *
   * @return possible object is {@link PosTypeEnumT }
   */
  public PosTypeEnumT getTyp() {
    return typ;
  }

  /**
   * Sets the value of the typ property.
   *
   * @param value allowed object is {@link PosTypeEnumT }
   */
  public void setTyp(PosTypeEnumT value) {
    this.typ = value;
  }

  /**
   * Gets the value of the long property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getLong() {
    return _long;
  }

  /**
   * Sets the value of the long property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setLong(BigDecimal value) {
    this._long = value;
  }

  /**
   * Gets the value of the short property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getShort() {
    return _short;
  }

  /**
   * Sets the value of the short property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setShort(BigDecimal value) {
    this._short = value;
  }

  /**
   * Gets the value of the cvrdQty property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCvrdQty() {
    return cvrdQty;
  }

  /**
   * Sets the value of the cvrdQty property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCvrdQty(BigDecimal value) {
    this.cvrdQty = value;
  }

  /**
   * Gets the value of the stat property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getStat() {
    return stat;
  }

  /**
   * Sets the value of the stat property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setStat(BigInteger value) {
    this.stat = value;
  }

  /**
   * Gets the value of the qtyDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getQtyDt() {
    return qtyDt;
  }

  /**
   * Sets the value of the qtyDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setQtyDt(XMLGregorianCalendar value) {
    this.qtyDt = value;
  }
}

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
import java.math.BigDecimal;

/**
 * Java class for SettlementAmountGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SettlementAmountGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementAmountGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementAmountGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAmountGrp_Block_t")
public class SettlementAmountGrpBlockT {

  @XmlAttribute(name = "Amt")
  protected BigDecimal amt;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  /**
   * Gets the value of the amt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getAmt() {
    return amt;
  }

  /**
   * Sets the value of the amt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setAmt(BigDecimal value) {
    this.amt = value;
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
}

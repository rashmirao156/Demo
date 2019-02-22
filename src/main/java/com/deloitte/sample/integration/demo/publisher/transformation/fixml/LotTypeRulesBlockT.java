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
 * Java class for LotTypeRules_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LotTypeRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LotTypeRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LotTypeRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotTypeRules_Block_t")
public class LotTypeRulesBlockT {

  @XmlAttribute(name = "LotTyp")
  protected String lotTyp;

  @XmlAttribute(name = "MinLotSz")
  protected BigDecimal minLotSz;

  /**
   * Gets the value of the lotTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getLotTyp() {
    return lotTyp;
  }

  /**
   * Sets the value of the lotTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLotTyp(String value) {
    this.lotTyp = value;
  }

  /**
   * Gets the value of the minLotSz property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getMinLotSz() {
    return minLotSz;
  }

  /**
   * Sets the value of the minLotSz property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setMinLotSz(BigDecimal value) {
    this.minLotSz = value;
  }
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

/**
 * Java class for UndInstrmtCollGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UndInstrmtCollGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UndInstrmtCollGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UndInstrmtCollGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "UndInstrmtCollGrp_Block_t",
  propOrder = {"undly"}
)
public class UndInstrmtCollGrpBlockT {

  @XmlElement(name = "Undly")
  protected UnderlyingInstrumentBlockT undly;

  @XmlAttribute(name = "Actn")
  protected BigInteger actn;

  /**
   * Gets the value of the undly property.
   *
   * @return possible object is {@link UnderlyingInstrumentBlockT }
   */
  public UnderlyingInstrumentBlockT getUndly() {
    return undly;
  }

  /**
   * Sets the value of the undly property.
   *
   * @param value allowed object is {@link UnderlyingInstrumentBlockT }
   */
  public void setUndly(UnderlyingInstrumentBlockT value) {
    this.undly = value;
  }

  /**
   * Gets the value of the actn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getActn() {
    return actn;
  }

  /**
   * Sets the value of the actn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setActn(BigInteger value) {
    this.actn = value;
  }
}

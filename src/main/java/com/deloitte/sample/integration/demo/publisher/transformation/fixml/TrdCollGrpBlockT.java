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

/**
 * Java class for TrdCollGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TrdCollGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdCollGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdCollGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdCollGrp_Block_t")
public class TrdCollGrpBlockT {

  @XmlAttribute(name = "RptID")
  protected String rptID;

  @XmlAttribute(name = "TrdRptID2")
  protected String trdRptID2;

  /**
   * Gets the value of the rptID property.
   *
   * @return possible object is {@link String }
   */
  public String getRptID() {
    return rptID;
  }

  /**
   * Sets the value of the rptID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRptID(String value) {
    this.rptID = value;
  }

  /**
   * Gets the value of the trdRptID2 property.
   *
   * @return possible object is {@link String }
   */
  public String getTrdRptID2() {
    return trdRptID2;
  }

  /**
   * Sets the value of the trdRptID2 property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTrdRptID2(String value) {
    this.trdRptID2 = value;
  }
}
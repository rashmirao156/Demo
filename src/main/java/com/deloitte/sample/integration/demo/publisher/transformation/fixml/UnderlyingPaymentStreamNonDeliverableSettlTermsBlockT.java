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
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for UnderlyingPaymentStreamNonDeliverableSettlTerms_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnderlyingPaymentStreamNonDeliverableSettlTerms_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingPaymentStreamNonDeliverableSettlTermsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingPaymentStreamNonDeliverableSettlTermsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "UnderlyingPaymentStreamNonDeliverableSettlTerms_Block_t",
  propOrder = {"bizCtr", "rtSrc", "fixngDt", "settlRtFallbck"}
)
public class UnderlyingPaymentStreamNonDeliverableSettlTermsBlockT {

  @XmlElement(name = "BizCtr")
  protected List<UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpBlockT> bizCtr;

  @XmlElement(name = "RtSrc")
  protected UnderlyingPaymentStreamNonDeliverableSettlRateSourceBlockT rtSrc;

  @XmlElement(name = "FixngDt")
  protected UnderlyingPaymentStreamNonDeliverableFixingDateGrpBlockT fixngDt;

  @XmlElement(name = "SettlRtFallbck")
  protected List<UnderlyingSettlRateDisruptionFallbackGrpBlockT> settlRtFallbck;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  @XmlAttribute(name = "BizDayCnvtn")
  protected BigInteger bizDayCnvtn;

  @XmlAttribute(name = "FixngReltv")
  protected BigInteger fixngReltv;

  @XmlAttribute(name = "FixngPeriod")
  protected BigInteger fixngPeriod;

  @XmlAttribute(name = "FixngUnit")
  protected PaymentStreamPaymentDateOffsetUnitEnumT fixngUnit;

  @XmlAttribute(name = "FixngDayTyp")
  protected BigInteger fixngDayTyp;

  /**
   * Gets the value of the bizCtr property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the bizCtr property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getBizCtr().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpBlockT }
   */
  public List<UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpBlockT> getBizCtr() {
    if (bizCtr == null) {
      bizCtr =
          new ArrayList<UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrpBlockT>();
    }
    return this.bizCtr;
  }

  /**
   * Gets the value of the rtSrc property.
   *
   * @return possible object is {@link UnderlyingPaymentStreamNonDeliverableSettlRateSourceBlockT }
   */
  public UnderlyingPaymentStreamNonDeliverableSettlRateSourceBlockT getRtSrc() {
    return rtSrc;
  }

  /**
   * Sets the value of the rtSrc property.
   *
   * @param value allowed object is {@link
   *     UnderlyingPaymentStreamNonDeliverableSettlRateSourceBlockT }
   */
  public void setRtSrc(UnderlyingPaymentStreamNonDeliverableSettlRateSourceBlockT value) {
    this.rtSrc = value;
  }

  /**
   * Gets the value of the fixngDt property.
   *
   * @return possible object is {@link UnderlyingPaymentStreamNonDeliverableFixingDateGrpBlockT }
   */
  public UnderlyingPaymentStreamNonDeliverableFixingDateGrpBlockT getFixngDt() {
    return fixngDt;
  }

  /**
   * Sets the value of the fixngDt property.
   *
   * @param value allowed object is {@link UnderlyingPaymentStreamNonDeliverableFixingDateGrpBlockT
   *     }
   */
  public void setFixngDt(UnderlyingPaymentStreamNonDeliverableFixingDateGrpBlockT value) {
    this.fixngDt = value;
  }

  /**
   * Gets the value of the settlRtFallbck property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the settlRtFallbck property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSettlRtFallbck().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * UnderlyingSettlRateDisruptionFallbackGrpBlockT }
   */
  public List<UnderlyingSettlRateDisruptionFallbackGrpBlockT> getSettlRtFallbck() {
    if (settlRtFallbck == null) {
      settlRtFallbck = new ArrayList<UnderlyingSettlRateDisruptionFallbackGrpBlockT>();
    }
    return this.settlRtFallbck;
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
   * Gets the value of the bizDayCnvtn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getBizDayCnvtn() {
    return bizDayCnvtn;
  }

  /**
   * Sets the value of the bizDayCnvtn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setBizDayCnvtn(BigInteger value) {
    this.bizDayCnvtn = value;
  }

  /**
   * Gets the value of the fixngReltv property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFixngReltv() {
    return fixngReltv;
  }

  /**
   * Sets the value of the fixngReltv property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFixngReltv(BigInteger value) {
    this.fixngReltv = value;
  }

  /**
   * Gets the value of the fixngPeriod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFixngPeriod() {
    return fixngPeriod;
  }

  /**
   * Sets the value of the fixngPeriod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFixngPeriod(BigInteger value) {
    this.fixngPeriod = value;
  }

  /**
   * Gets the value of the fixngUnit property.
   *
   * @return possible object is {@link PaymentStreamPaymentDateOffsetUnitEnumT }
   */
  public PaymentStreamPaymentDateOffsetUnitEnumT getFixngUnit() {
    return fixngUnit;
  }

  /**
   * Sets the value of the fixngUnit property.
   *
   * @param value allowed object is {@link PaymentStreamPaymentDateOffsetUnitEnumT }
   */
  public void setFixngUnit(PaymentStreamPaymentDateOffsetUnitEnumT value) {
    this.fixngUnit = value;
  }

  /**
   * Gets the value of the fixngDayTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFixngDayTyp() {
    return fixngDayTyp;
  }

  /**
   * Sets the value of the fixngDayTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFixngDayTyp(BigInteger value) {
    this.fixngDayTyp = value;
  }
}
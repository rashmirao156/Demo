//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlRateDisruptionFallbackGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlRateDisruptionFallbackGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlRateDisruptionFallbackGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlRateDisruptionFallbackGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlRateDisruptionFallbackGrp_Block_t", propOrder = {
    "rtSrc"
})
public class SettlRateDisruptionFallbackGrpBlockT {

    @XmlElement(name = "RtSrc")
    protected SettlRateFallbackRateSourceBlockT rtSrc;
    @XmlAttribute(name = "MaxDays")
    protected BigInteger maxDays;
    @XmlAttribute(name = "Survey")
    protected String survey;
    @XmlAttribute(name = "CalcAgent")
    protected BigInteger calcAgent;

    /**
     * Gets the value of the rtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlRateFallbackRateSourceBlockT }
     *     
     */
    public SettlRateFallbackRateSourceBlockT getRtSrc() {
        return rtSrc;
    }

    /**
     * Sets the value of the rtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlRateFallbackRateSourceBlockT }
     *     
     */
    public void setRtSrc(SettlRateFallbackRateSourceBlockT value) {
        this.rtSrc = value;
    }

    /**
     * Gets the value of the maxDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDays() {
        return maxDays;
    }

    /**
     * Sets the value of the maxDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDays(BigInteger value) {
        this.maxDays = value;
    }

    /**
     * Gets the value of the survey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurvey() {
        return survey;
    }

    /**
     * Sets the value of the survey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurvey(String value) {
        this.survey = value;
    }

    /**
     * Gets the value of the calcAgent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalcAgent() {
        return calcAgent;
    }

    /**
     * Sets the value of the calcAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalcAgent(BigInteger value) {
        this.calcAgent = value;
    }

}

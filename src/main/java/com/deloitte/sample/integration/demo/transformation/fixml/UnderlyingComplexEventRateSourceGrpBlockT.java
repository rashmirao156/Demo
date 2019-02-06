//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingComplexEventRateSourceGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingComplexEventRateSourceGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingComplexEventRateSourceGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingComplexEventRateSourceGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingComplexEventRateSourceGrp_Block_t")
public class UnderlyingComplexEventRateSourceGrpBlockT {

    @XmlAttribute(name = "RtSrc")
    protected BigInteger rtSrc;
    @XmlAttribute(name = "RtSrcTyp")
    protected BigInteger rtSrcTyp;
    @XmlAttribute(name = "RefPg")
    protected String refPg;
    @XmlAttribute(name = "RefHdg")
    protected String refHdg;

    /**
     * Gets the value of the rtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtSrc() {
        return rtSrc;
    }

    /**
     * Sets the value of the rtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtSrc(BigInteger value) {
        this.rtSrc = value;
    }

    /**
     * Gets the value of the rtSrcTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtSrcTyp() {
        return rtSrcTyp;
    }

    /**
     * Sets the value of the rtSrcTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtSrcTyp(BigInteger value) {
        this.rtSrcTyp = value;
    }

    /**
     * Gets the value of the refPg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPg() {
        return refPg;
    }

    /**
     * Sets the value of the refPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPg(String value) {
        this.refPg = value;
    }

    /**
     * Gets the value of the refHdg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefHdg() {
        return refHdg;
    }

    /**
     * Sets the value of the refHdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefHdg(String value) {
        this.refHdg = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketDisruptionFallbackReferencePriceGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDisruptionFallbackReferencePriceGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDisruptionFallbackReferencePriceGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDisruptionFallbackReferencePriceGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDisruptionFallbackReferencePriceGrp_Block_t")
public class MarketDisruptionFallbackReferencePriceGrpBlockT {

    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "EncDescLen")
    protected BigInteger encDescLen;
    @XmlAttribute(name = "EncDesc")
    protected byte[] encDesc;
    @XmlAttribute(name = "OpnUnits")
    protected BigDecimal opnUnits;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Dvsr")
    protected BigDecimal dvsr;

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the encDescLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncDescLen() {
        return encDescLen;
    }

    /**
     * Sets the value of the encDescLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncDescLen(BigInteger value) {
        this.encDescLen = value;
    }

    /**
     * Gets the value of the encDesc property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncDesc() {
        return encDesc;
    }

    /**
     * Sets the value of the encDesc property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncDesc(byte[] value) {
        this.encDesc = value;
    }

    /**
     * Gets the value of the opnUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpnUnits() {
        return opnUnits;
    }

    /**
     * Sets the value of the opnUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpnUnits(BigDecimal value) {
        this.opnUnits = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the dvsr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvsr() {
        return dvsr;
    }

    /**
     * Sets the value of the dvsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDvsr(BigDecimal value) {
        this.dvsr = value;
    }

}

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
 * <p>Java class for DiscretionInstructions_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscretionInstructions_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DiscretionInstructionsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DiscretionInstructionsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscretionInstructions_Block_t")
public class DiscretionInstructionsBlockT {

    @XmlAttribute(name = "DsctnInst")
    protected String dsctnInst;
    @XmlAttribute(name = "OfstValu")
    protected BigDecimal ofstValu;
    @XmlAttribute(name = "MoveTyp")
    protected BigInteger moveTyp;
    @XmlAttribute(name = "OfstTyp")
    protected BigInteger ofstTyp;
    @XmlAttribute(name = "LimitTyp")
    protected BigInteger limitTyp;
    @XmlAttribute(name = "RndDir")
    protected BigInteger rndDir;
    @XmlAttribute(name = "Scope")
    protected BigInteger scope;

    /**
     * Gets the value of the dsctnInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsctnInst() {
        return dsctnInst;
    }

    /**
     * Sets the value of the dsctnInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsctnInst(String value) {
        this.dsctnInst = value;
    }

    /**
     * Gets the value of the ofstValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfstValu() {
        return ofstValu;
    }

    /**
     * Sets the value of the ofstValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfstValu(BigDecimal value) {
        this.ofstValu = value;
    }

    /**
     * Gets the value of the moveTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveTyp() {
        return moveTyp;
    }

    /**
     * Sets the value of the moveTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveTyp(BigInteger value) {
        this.moveTyp = value;
    }

    /**
     * Gets the value of the ofstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfstTyp() {
        return ofstTyp;
    }

    /**
     * Sets the value of the ofstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfstTyp(BigInteger value) {
        this.ofstTyp = value;
    }

    /**
     * Gets the value of the limitTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitTyp() {
        return limitTyp;
    }

    /**
     * Sets the value of the limitTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitTyp(BigInteger value) {
        this.limitTyp = value;
    }

    /**
     * Gets the value of the rndDir property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRndDir() {
        return rndDir;
    }

    /**
     * Sets the value of the rndDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRndDir(BigInteger value) {
        this.rndDir = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScope(BigInteger value) {
        this.scope = value;
    }

}

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegOptionExercise_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegOptionExercise_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegOptionExerciseElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegOptionExerciseAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegOptionExercise_Block_t", propOrder = {
    "settlMethDt",
    "dts",
    "exp",
    "makeWhole"
})
public class LegOptionExerciseBlockT {

    @XmlElement(name = "SettlMethDt")
    protected LegSettlMethodElectionDateBlockT settlMethDt;
    @XmlElement(name = "Dts")
    protected LegOptionExerciseDatesBlockT dts;
    @XmlElement(name = "Exp")
    protected LegOptionExerciseExpirationBlockT exp;
    @XmlElement(name = "MakeWhole")
    protected LegOptionExerciseMakeWholeProvisionBlockT makeWhole;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "EncDescLen")
    protected BigInteger encDescLen;
    @XmlAttribute(name = "EncDesc")
    protected byte[] encDesc;
    @XmlAttribute(name = "AutoExerInd")
    protected String autoExerInd;
    @XmlAttribute(name = "AutoRt")
    protected BigDecimal autoRt;
    @XmlAttribute(name = "ExerCnfm")
    protected BigInteger exerCnfm;
    @XmlAttribute(name = "ManNtcBizCtr")
    protected String manNtcBizCtr;
    @XmlAttribute(name = "FallbckExerInd")
    protected String fallbckExerInd;
    @XmlAttribute(name = "LtdRightCnfmInd")
    protected String ltdRightCnfmInd;
    @XmlAttribute(name = "ExerSplitTktInd")
    protected String exerSplitTktInd;
    @XmlAttribute(name = "SettlMethElctngSide")
    protected BigInteger settlMethElctngSide;

    /**
     * Gets the value of the settlMethDt property.
     * 
     * @return
     *     possible object is
     *     {@link LegSettlMethodElectionDateBlockT }
     *     
     */
    public LegSettlMethodElectionDateBlockT getSettlMethDt() {
        return settlMethDt;
    }

    /**
     * Sets the value of the settlMethDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegSettlMethodElectionDateBlockT }
     *     
     */
    public void setSettlMethDt(LegSettlMethodElectionDateBlockT value) {
        this.settlMethDt = value;
    }

    /**
     * Gets the value of the dts property.
     * 
     * @return
     *     possible object is
     *     {@link LegOptionExerciseDatesBlockT }
     *     
     */
    public LegOptionExerciseDatesBlockT getDts() {
        return dts;
    }

    /**
     * Sets the value of the dts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegOptionExerciseDatesBlockT }
     *     
     */
    public void setDts(LegOptionExerciseDatesBlockT value) {
        this.dts = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link LegOptionExerciseExpirationBlockT }
     *     
     */
    public LegOptionExerciseExpirationBlockT getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegOptionExerciseExpirationBlockT }
     *     
     */
    public void setExp(LegOptionExerciseExpirationBlockT value) {
        this.exp = value;
    }

    /**
     * Gets the value of the makeWhole property.
     * 
     * @return
     *     possible object is
     *     {@link LegOptionExerciseMakeWholeProvisionBlockT }
     *     
     */
    public LegOptionExerciseMakeWholeProvisionBlockT getMakeWhole() {
        return makeWhole;
    }

    /**
     * Sets the value of the makeWhole property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegOptionExerciseMakeWholeProvisionBlockT }
     *     
     */
    public void setMakeWhole(LegOptionExerciseMakeWholeProvisionBlockT value) {
        this.makeWhole = value;
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
     * Gets the value of the autoExerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExerInd() {
        return autoExerInd;
    }

    /**
     * Sets the value of the autoExerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExerInd(String value) {
        this.autoExerInd = value;
    }

    /**
     * Gets the value of the autoRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutoRt() {
        return autoRt;
    }

    /**
     * Sets the value of the autoRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutoRt(BigDecimal value) {
        this.autoRt = value;
    }

    /**
     * Gets the value of the exerCnfm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExerCnfm() {
        return exerCnfm;
    }

    /**
     * Sets the value of the exerCnfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExerCnfm(BigInteger value) {
        this.exerCnfm = value;
    }

    /**
     * Gets the value of the manNtcBizCtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManNtcBizCtr() {
        return manNtcBizCtr;
    }

    /**
     * Sets the value of the manNtcBizCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManNtcBizCtr(String value) {
        this.manNtcBizCtr = value;
    }

    /**
     * Gets the value of the fallbckExerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbckExerInd() {
        return fallbckExerInd;
    }

    /**
     * Sets the value of the fallbckExerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbckExerInd(String value) {
        this.fallbckExerInd = value;
    }

    /**
     * Gets the value of the ltdRightCnfmInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdRightCnfmInd() {
        return ltdRightCnfmInd;
    }

    /**
     * Sets the value of the ltdRightCnfmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtdRightCnfmInd(String value) {
        this.ltdRightCnfmInd = value;
    }

    /**
     * Gets the value of the exerSplitTktInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerSplitTktInd() {
        return exerSplitTktInd;
    }

    /**
     * Sets the value of the exerSplitTktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerSplitTktInd(String value) {
        this.exerSplitTktInd = value;
    }

    /**
     * Gets the value of the settlMethElctngSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlMethElctngSide() {
        return settlMethElctngSide;
    }

    /**
     * Sets the value of the settlMethElctngSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlMethElctngSide(BigInteger value) {
        this.settlMethElctngSide = value;
    }

}

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
 * <p>Java class for PaymentStubGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStubGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentStubGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentStubGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStubGrp_Block_t", propOrder = {
    "startDt",
    "endDt"
})
public class PaymentStubGrpBlockT {

    @XmlElement(name = "StartDt")
    protected PaymentStubStartDateBlockT startDt;
    @XmlElement(name = "EndDt")
    protected PaymentStubEndDateBlockT endDt;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "Lngth")
    protected BigInteger lngth;
    @XmlAttribute(name = "Rt")
    protected BigDecimal rt;
    @XmlAttribute(name = "FixedAmt")
    protected BigDecimal fixedAmt;
    @XmlAttribute(name = "FixedCcy")
    protected String fixedCcy;
    @XmlAttribute(name = "Ndx")
    protected String ndx;
    @XmlAttribute(name = "NdxSrc")
    protected BigInteger ndxSrc;
    @XmlAttribute(name = "NdxPeriod")
    protected BigInteger ndxPeriod;
    @XmlAttribute(name = "NdxUnit")
    protected PaymentStreamRateIndexCurveUnitEnumT ndxUnit;
    @XmlAttribute(name = "RtMult")
    protected BigDecimal rtMult;
    @XmlAttribute(name = "Spread")
    protected BigDecimal spread;
    @XmlAttribute(name = "SpreadPosTyp")
    protected BigInteger spreadPosTyp;
    @XmlAttribute(name = "RtTrtmt")
    protected BigInteger rtTrtmt;
    @XmlAttribute(name = "CapRt")
    protected BigDecimal capRt;
    @XmlAttribute(name = "CapRtBuy")
    protected BigInteger capRtBuy;
    @XmlAttribute(name = "CapRtSell")
    protected BigInteger capRtSell;
    @XmlAttribute(name = "FlrRt")
    protected BigDecimal flrRt;
    @XmlAttribute(name = "FlrRtBuy")
    protected BigInteger flrRtBuy;
    @XmlAttribute(name = "FlrRtSell")
    protected BigInteger flrRtSell;
    @XmlAttribute(name = "Ndx2")
    protected String ndx2;
    @XmlAttribute(name = "Ndx2Src")
    protected BigInteger ndx2Src;
    @XmlAttribute(name = "Ndx2Period")
    protected BigInteger ndx2Period;
    @XmlAttribute(name = "Ndx2Unit")
    protected PaymentStreamRateIndexCurveUnitEnumT ndx2Unit;
    @XmlAttribute(name = "RtMult2")
    protected BigDecimal rtMult2;
    @XmlAttribute(name = "Spread2")
    protected BigDecimal spread2;
    @XmlAttribute(name = "Spread2PosTyp")
    protected BigInteger spread2PosTyp;
    @XmlAttribute(name = "RtTrtmt2")
    protected BigInteger rtTrtmt2;
    @XmlAttribute(name = "CapRt2")
    protected BigDecimal capRt2;
    @XmlAttribute(name = "FlrRt2")
    protected BigDecimal flrRt2;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStubStartDateBlockT }
     *     
     */
    public PaymentStubStartDateBlockT getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStubStartDateBlockT }
     *     
     */
    public void setStartDt(PaymentStubStartDateBlockT value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStubEndDateBlockT }
     *     
     */
    public PaymentStubEndDateBlockT getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStubEndDateBlockT }
     *     
     */
    public void setEndDt(PaymentStubEndDateBlockT value) {
        this.endDt = value;
    }

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
     * Gets the value of the lngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLngth() {
        return lngth;
    }

    /**
     * Sets the value of the lngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLngth(BigInteger value) {
        this.lngth = value;
    }

    /**
     * Gets the value of the rt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRt() {
        return rt;
    }

    /**
     * Sets the value of the rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRt(BigDecimal value) {
        this.rt = value;
    }

    /**
     * Gets the value of the fixedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedAmt() {
        return fixedAmt;
    }

    /**
     * Sets the value of the fixedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedAmt(BigDecimal value) {
        this.fixedAmt = value;
    }

    /**
     * Gets the value of the fixedCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedCcy() {
        return fixedCcy;
    }

    /**
     * Sets the value of the fixedCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedCcy(String value) {
        this.fixedCcy = value;
    }

    /**
     * Gets the value of the ndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdx() {
        return ndx;
    }

    /**
     * Sets the value of the ndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdx(String value) {
        this.ndx = value;
    }

    /**
     * Gets the value of the ndxSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdxSrc() {
        return ndxSrc;
    }

    /**
     * Sets the value of the ndxSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdxSrc(BigInteger value) {
        this.ndxSrc = value;
    }

    /**
     * Gets the value of the ndxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdxPeriod() {
        return ndxPeriod;
    }

    /**
     * Sets the value of the ndxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdxPeriod(BigInteger value) {
        this.ndxPeriod = value;
    }

    /**
     * Gets the value of the ndxUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStreamRateIndexCurveUnitEnumT }
     *     
     */
    public PaymentStreamRateIndexCurveUnitEnumT getNdxUnit() {
        return ndxUnit;
    }

    /**
     * Sets the value of the ndxUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStreamRateIndexCurveUnitEnumT }
     *     
     */
    public void setNdxUnit(PaymentStreamRateIndexCurveUnitEnumT value) {
        this.ndxUnit = value;
    }

    /**
     * Gets the value of the rtMult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtMult() {
        return rtMult;
    }

    /**
     * Sets the value of the rtMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtMult(BigDecimal value) {
        this.rtMult = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the spreadPosTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpreadPosTyp() {
        return spreadPosTyp;
    }

    /**
     * Sets the value of the spreadPosTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpreadPosTyp(BigInteger value) {
        this.spreadPosTyp = value;
    }

    /**
     * Gets the value of the rtTrtmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtTrtmt() {
        return rtTrtmt;
    }

    /**
     * Sets the value of the rtTrtmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtTrtmt(BigInteger value) {
        this.rtTrtmt = value;
    }

    /**
     * Gets the value of the capRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapRt() {
        return capRt;
    }

    /**
     * Sets the value of the capRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapRt(BigDecimal value) {
        this.capRt = value;
    }

    /**
     * Gets the value of the capRtBuy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapRtBuy() {
        return capRtBuy;
    }

    /**
     * Sets the value of the capRtBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapRtBuy(BigInteger value) {
        this.capRtBuy = value;
    }

    /**
     * Gets the value of the capRtSell property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapRtSell() {
        return capRtSell;
    }

    /**
     * Sets the value of the capRtSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapRtSell(BigInteger value) {
        this.capRtSell = value;
    }

    /**
     * Gets the value of the flrRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlrRt() {
        return flrRt;
    }

    /**
     * Sets the value of the flrRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlrRt(BigDecimal value) {
        this.flrRt = value;
    }

    /**
     * Gets the value of the flrRtBuy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlrRtBuy() {
        return flrRtBuy;
    }

    /**
     * Sets the value of the flrRtBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlrRtBuy(BigInteger value) {
        this.flrRtBuy = value;
    }

    /**
     * Gets the value of the flrRtSell property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlrRtSell() {
        return flrRtSell;
    }

    /**
     * Sets the value of the flrRtSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlrRtSell(BigInteger value) {
        this.flrRtSell = value;
    }

    /**
     * Gets the value of the ndx2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdx2() {
        return ndx2;
    }

    /**
     * Sets the value of the ndx2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdx2(String value) {
        this.ndx2 = value;
    }

    /**
     * Gets the value of the ndx2Src property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdx2Src() {
        return ndx2Src;
    }

    /**
     * Sets the value of the ndx2Src property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdx2Src(BigInteger value) {
        this.ndx2Src = value;
    }

    /**
     * Gets the value of the ndx2Period property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNdx2Period() {
        return ndx2Period;
    }

    /**
     * Sets the value of the ndx2Period property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNdx2Period(BigInteger value) {
        this.ndx2Period = value;
    }

    /**
     * Gets the value of the ndx2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStreamRateIndexCurveUnitEnumT }
     *     
     */
    public PaymentStreamRateIndexCurveUnitEnumT getNdx2Unit() {
        return ndx2Unit;
    }

    /**
     * Sets the value of the ndx2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStreamRateIndexCurveUnitEnumT }
     *     
     */
    public void setNdx2Unit(PaymentStreamRateIndexCurveUnitEnumT value) {
        this.ndx2Unit = value;
    }

    /**
     * Gets the value of the rtMult2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtMult2() {
        return rtMult2;
    }

    /**
     * Sets the value of the rtMult2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtMult2(BigDecimal value) {
        this.rtMult2 = value;
    }

    /**
     * Gets the value of the spread2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread2() {
        return spread2;
    }

    /**
     * Sets the value of the spread2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread2(BigDecimal value) {
        this.spread2 = value;
    }

    /**
     * Gets the value of the spread2PosTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpread2PosTyp() {
        return spread2PosTyp;
    }

    /**
     * Sets the value of the spread2PosTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpread2PosTyp(BigInteger value) {
        this.spread2PosTyp = value;
    }

    /**
     * Gets the value of the rtTrtmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtTrtmt2() {
        return rtTrtmt2;
    }

    /**
     * Sets the value of the rtTrtmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtTrtmt2(BigInteger value) {
        this.rtTrtmt2 = value;
    }

    /**
     * Gets the value of the capRt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapRt2() {
        return capRt2;
    }

    /**
     * Sets the value of the capRt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapRt2(BigDecimal value) {
        this.capRt2 = value;
    }

    /**
     * Gets the value of the flrRt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlrRt2() {
        return flrRt2;
    }

    /**
     * Sets the value of the flrRt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlrRt2(BigDecimal value) {
        this.flrRt2 = value;
    }

}
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
 * <p>Java class for UnderlyingDividendAccrualFloatingRate_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingDividendAccrualFloatingRate_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendAccrualFloatingRateElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendAccrualFloatingRateAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingDividendAccrualFloatingRate_Block_t")
public class UnderlyingDividendAccrualFloatingRateBlockT {

    @XmlAttribute(name = "Ndx")
    protected String ndx;
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
    @XmlAttribute(name = "InitRt")
    protected BigDecimal initRt;
    @XmlAttribute(name = "FnlRtRndDirctn")
    protected String fnlRtRndDirctn;
    @XmlAttribute(name = "FnlRtPrcsn")
    protected BigInteger fnlRtPrcsn;
    @XmlAttribute(name = "AvgngMeth")
    protected BigInteger avgngMeth;
    @XmlAttribute(name = "NegtvRtTrtmt")
    protected BigInteger negtvRtTrtmt;

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
     * Gets the value of the initRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitRt() {
        return initRt;
    }

    /**
     * Sets the value of the initRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitRt(BigDecimal value) {
        this.initRt = value;
    }

    /**
     * Gets the value of the fnlRtRndDirctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnlRtRndDirctn() {
        return fnlRtRndDirctn;
    }

    /**
     * Sets the value of the fnlRtRndDirctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnlRtRndDirctn(String value) {
        this.fnlRtRndDirctn = value;
    }

    /**
     * Gets the value of the fnlRtPrcsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFnlRtPrcsn() {
        return fnlRtPrcsn;
    }

    /**
     * Sets the value of the fnlRtPrcsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFnlRtPrcsn(BigInteger value) {
        this.fnlRtPrcsn = value;
    }

    /**
     * Gets the value of the avgngMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgngMeth() {
        return avgngMeth;
    }

    /**
     * Sets the value of the avgngMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgngMeth(BigInteger value) {
        this.avgngMeth = value;
    }

    /**
     * Gets the value of the negtvRtTrtmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegtvRtTrtmt() {
        return negtvRtTrtmt;
    }

    /**
     * Sets the value of the negtvRtTrtmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegtvRtTrtmt(BigInteger value) {
        this.negtvRtTrtmt = value;
    }

}
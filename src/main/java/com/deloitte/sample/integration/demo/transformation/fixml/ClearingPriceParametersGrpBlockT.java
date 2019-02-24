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
 * <p>Java class for ClearingPriceParametersGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingPriceParametersGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ClearingPriceParametersGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ClearingPriceParametersGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPriceParametersGrp_Block_t")
public class ClearingPriceParametersGrpBlockT {

    @XmlAttribute(name = "BizDayTyp")
    protected BigInteger bizDayTyp;
    @XmlAttribute(name = "ClrPxOfst")
    protected BigDecimal clrPxOfst;
    @XmlAttribute(name = "VegaMult")
    protected BigDecimal vegaMult;
    @XmlAttribute(name = "AnnlTrdgBizDays")
    protected BigInteger annlTrdgBizDays;
    @XmlAttribute(name = "TotTrdgBizDays")
    protected BigInteger totTrdgBizDays;
    @XmlAttribute(name = "TrdgBizDays")
    protected BigInteger trdgBizDays;
    @XmlAttribute(name = "StdVarnc")
    protected BigDecimal stdVarnc;
    @XmlAttribute(name = "RlzdVarnc")
    protected BigDecimal rlzdVarnc;
    @XmlAttribute(name = "ReltdClsPx")
    protected BigDecimal reltdClsPx;
    @XmlAttribute(name = "RFR")
    protected BigDecimal rfr;
    @XmlAttribute(name = "OvrNiteIntRt")
    protected BigDecimal ovrNiteIntRt;
    @XmlAttribute(name = "ARMVM")
    protected BigDecimal armvm;
    @XmlAttribute(name = "DiscFctr")
    protected BigDecimal discFctr;
    @XmlAttribute(name = "Vol")
    protected BigDecimal vol;
    @XmlAttribute(name = "SetPx")
    protected BigDecimal setPx;
    @XmlAttribute(name = "CalcMeth")
    protected BigInteger calcMeth;

    /**
     * Gets the value of the bizDayTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBizDayTyp() {
        return bizDayTyp;
    }

    /**
     * Sets the value of the bizDayTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBizDayTyp(BigInteger value) {
        this.bizDayTyp = value;
    }

    /**
     * Gets the value of the clrPxOfst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrPxOfst() {
        return clrPxOfst;
    }

    /**
     * Sets the value of the clrPxOfst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClrPxOfst(BigDecimal value) {
        this.clrPxOfst = value;
    }

    /**
     * Gets the value of the vegaMult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVegaMult() {
        return vegaMult;
    }

    /**
     * Sets the value of the vegaMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVegaMult(BigDecimal value) {
        this.vegaMult = value;
    }

    /**
     * Gets the value of the annlTrdgBizDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnlTrdgBizDays() {
        return annlTrdgBizDays;
    }

    /**
     * Sets the value of the annlTrdgBizDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnlTrdgBizDays(BigInteger value) {
        this.annlTrdgBizDays = value;
    }

    /**
     * Gets the value of the totTrdgBizDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotTrdgBizDays() {
        return totTrdgBizDays;
    }

    /**
     * Sets the value of the totTrdgBizDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotTrdgBizDays(BigInteger value) {
        this.totTrdgBizDays = value;
    }

    /**
     * Gets the value of the trdgBizDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrdgBizDays() {
        return trdgBizDays;
    }

    /**
     * Sets the value of the trdgBizDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrdgBizDays(BigInteger value) {
        this.trdgBizDays = value;
    }

    /**
     * Gets the value of the stdVarnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdVarnc() {
        return stdVarnc;
    }

    /**
     * Sets the value of the stdVarnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdVarnc(BigDecimal value) {
        this.stdVarnc = value;
    }

    /**
     * Gets the value of the rlzdVarnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRlzdVarnc() {
        return rlzdVarnc;
    }

    /**
     * Sets the value of the rlzdVarnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRlzdVarnc(BigDecimal value) {
        this.rlzdVarnc = value;
    }

    /**
     * Gets the value of the reltdClsPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReltdClsPx() {
        return reltdClsPx;
    }

    /**
     * Sets the value of the reltdClsPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReltdClsPx(BigDecimal value) {
        this.reltdClsPx = value;
    }

    /**
     * Gets the value of the rfr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRFR() {
        return rfr;
    }

    /**
     * Sets the value of the rfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRFR(BigDecimal value) {
        this.rfr = value;
    }

    /**
     * Gets the value of the ovrNiteIntRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvrNiteIntRt() {
        return ovrNiteIntRt;
    }

    /**
     * Sets the value of the ovrNiteIntRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvrNiteIntRt(BigDecimal value) {
        this.ovrNiteIntRt = value;
    }

    /**
     * Gets the value of the armvm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getARMVM() {
        return armvm;
    }

    /**
     * Sets the value of the armvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setARMVM(BigDecimal value) {
        this.armvm = value;
    }

    /**
     * Gets the value of the discFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscFctr() {
        return discFctr;
    }

    /**
     * Sets the value of the discFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscFctr(BigDecimal value) {
        this.discFctr = value;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol(BigDecimal value) {
        this.vol = value;
    }

    /**
     * Gets the value of the setPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetPx() {
        return setPx;
    }

    /**
     * Sets the value of the setPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetPx(BigDecimal value) {
        this.setPx = value;
    }

    /**
     * Gets the value of the calcMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalcMeth() {
        return calcMeth;
    }

    /**
     * Sets the value of the calcMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalcMeth(BigInteger value) {
        this.calcMeth = value;
    }

}
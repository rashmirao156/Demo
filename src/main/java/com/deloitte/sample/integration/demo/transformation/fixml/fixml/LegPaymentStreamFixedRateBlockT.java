//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LegPaymentStreamFixedRate_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegPaymentStreamFixedRate_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamFixedRateElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamFixedRateAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegPaymentStreamFixedRate_Block_t")
public class LegPaymentStreamFixedRateBlockT {

    @XmlAttribute(name = "Rt")
    protected BigDecimal rt;
    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "FixedAmtUOM")
    protected UnitOfMeasureEnumT fixedAmtUOM;
    @XmlAttribute(name = "FixedAmt")
    protected BigDecimal fixedAmt;
    @XmlAttribute(name = "FutValNotl")
    protected BigDecimal futValNotl;
    @XmlAttribute(name = "FutValDt")
    protected XMLGregorianCalendar futValDt;
    @XmlAttribute(name = "WorldScaleRt")
    protected BigDecimal worldScaleRt;
    @XmlAttribute(name = "CtrctPx")
    protected BigDecimal ctrctPx;
    @XmlAttribute(name = "CtrctPxCcy")
    protected String ctrctPxCcy;

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
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
     * Gets the value of the fixedAmtUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public UnitOfMeasureEnumT getFixedAmtUOM() {
        return fixedAmtUOM;
    }

    /**
     * Sets the value of the fixedAmtUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public void setFixedAmtUOM(UnitOfMeasureEnumT value) {
        this.fixedAmtUOM = value;
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
     * Gets the value of the futValNotl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFutValNotl() {
        return futValNotl;
    }

    /**
     * Sets the value of the futValNotl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFutValNotl(BigDecimal value) {
        this.futValNotl = value;
    }

    /**
     * Gets the value of the futValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFutValDt() {
        return futValDt;
    }

    /**
     * Sets the value of the futValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFutValDt(XMLGregorianCalendar value) {
        this.futValDt = value;
    }

    /**
     * Gets the value of the worldScaleRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorldScaleRt() {
        return worldScaleRt;
    }

    /**
     * Sets the value of the worldScaleRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorldScaleRt(BigDecimal value) {
        this.worldScaleRt = value;
    }

    /**
     * Gets the value of the ctrctPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctPx() {
        return ctrctPx;
    }

    /**
     * Sets the value of the ctrctPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrctPx(BigDecimal value) {
        this.ctrctPx = value;
    }

    /**
     * Gets the value of the ctrctPxCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctPxCcy() {
        return ctrctPxCcy;
    }

    /**
     * Sets the value of the ctrctPxCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctPxCcy(String value) {
        this.ctrctPxCcy = value;
    }

}

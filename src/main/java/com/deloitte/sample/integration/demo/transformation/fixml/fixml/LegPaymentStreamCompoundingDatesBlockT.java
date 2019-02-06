//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LegPaymentStreamCompoundingDates_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegPaymentStreamCompoundingDates_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamCompoundingDatesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamCompoundingDatesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegPaymentStreamCompoundingDates_Block_t", propOrder = {
    "bizCtr",
    "cmpndgDt",
    "startDt",
    "endDt"
})
public class LegPaymentStreamCompoundingDatesBlockT {

    @XmlElement(name = "BizCtr")
    protected List<LegPaymentStreamCompoundingDatesBusinessCenterGrpBlockT> bizCtr;
    @XmlElement(name = "CmpndgDt")
    protected List<LegPaymentStreamCompoundingDateGrpBlockT> cmpndgDt;
    @XmlElement(name = "StartDt")
    protected LegPaymentStreamCompoundingStartDateBlockT startDt;
    @XmlElement(name = "EndDt")
    protected LegPaymentStreamCompoundingEndDateBlockT endDt;
    @XmlAttribute(name = "BizDayCnvtn")
    protected BigInteger bizDayCnvtn;
    @XmlAttribute(name = "Reltv")
    protected BigInteger reltv;
    @XmlAttribute(name = "OfstPeriod")
    protected BigInteger ofstPeriod;
    @XmlAttribute(name = "OfstUnit")
    protected PaymentStreamPaymentDateOffsetUnitEnumT ofstUnit;
    @XmlAttribute(name = "OfstDayTyp")
    protected BigInteger ofstDayTyp;
    @XmlAttribute(name = "Skip")
    protected BigInteger skip;
    @XmlAttribute(name = "FreqPeriod")
    protected BigInteger freqPeriod;
    @XmlAttribute(name = "FreqUnit")
    protected CouponFrequencyUnitEnumT freqUnit;
    @XmlAttribute(name = "Roll")
    protected String roll;
    @XmlAttribute(name = "FirstDtUnadj")
    protected XMLGregorianCalendar firstDtUnadj;
    @XmlAttribute(name = "LastDtUnadj")
    protected XMLGregorianCalendar lastDtUnadj;

    /**
     * Gets the value of the bizCtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizCtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizCtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegPaymentStreamCompoundingDatesBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<LegPaymentStreamCompoundingDatesBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<LegPaymentStreamCompoundingDatesBusinessCenterGrpBlockT>();
        }
        return this.bizCtr;
    }

    /**
     * Gets the value of the cmpndgDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpndgDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpndgDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegPaymentStreamCompoundingDateGrpBlockT }
     * 
     * 
     */
    public List<LegPaymentStreamCompoundingDateGrpBlockT> getCmpndgDt() {
        if (cmpndgDt == null) {
            cmpndgDt = new ArrayList<LegPaymentStreamCompoundingDateGrpBlockT>();
        }
        return this.cmpndgDt;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link LegPaymentStreamCompoundingStartDateBlockT }
     *     
     */
    public LegPaymentStreamCompoundingStartDateBlockT getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPaymentStreamCompoundingStartDateBlockT }
     *     
     */
    public void setStartDt(LegPaymentStreamCompoundingStartDateBlockT value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link LegPaymentStreamCompoundingEndDateBlockT }
     *     
     */
    public LegPaymentStreamCompoundingEndDateBlockT getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPaymentStreamCompoundingEndDateBlockT }
     *     
     */
    public void setEndDt(LegPaymentStreamCompoundingEndDateBlockT value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the bizDayCnvtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBizDayCnvtn() {
        return bizDayCnvtn;
    }

    /**
     * Sets the value of the bizDayCnvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBizDayCnvtn(BigInteger value) {
        this.bizDayCnvtn = value;
    }

    /**
     * Gets the value of the reltv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReltv() {
        return reltv;
    }

    /**
     * Sets the value of the reltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReltv(BigInteger value) {
        this.reltv = value;
    }

    /**
     * Gets the value of the ofstPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfstPeriod() {
        return ofstPeriod;
    }

    /**
     * Sets the value of the ofstPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfstPeriod(BigInteger value) {
        this.ofstPeriod = value;
    }

    /**
     * Gets the value of the ofstUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStreamPaymentDateOffsetUnitEnumT }
     *     
     */
    public PaymentStreamPaymentDateOffsetUnitEnumT getOfstUnit() {
        return ofstUnit;
    }

    /**
     * Sets the value of the ofstUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStreamPaymentDateOffsetUnitEnumT }
     *     
     */
    public void setOfstUnit(PaymentStreamPaymentDateOffsetUnitEnumT value) {
        this.ofstUnit = value;
    }

    /**
     * Gets the value of the ofstDayTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfstDayTyp() {
        return ofstDayTyp;
    }

    /**
     * Sets the value of the ofstDayTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfstDayTyp(BigInteger value) {
        this.ofstDayTyp = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkip(BigInteger value) {
        this.skip = value;
    }

    /**
     * Gets the value of the freqPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreqPeriod() {
        return freqPeriod;
    }

    /**
     * Sets the value of the freqPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreqPeriod(BigInteger value) {
        this.freqPeriod = value;
    }

    /**
     * Gets the value of the freqUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CouponFrequencyUnitEnumT }
     *     
     */
    public CouponFrequencyUnitEnumT getFreqUnit() {
        return freqUnit;
    }

    /**
     * Sets the value of the freqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFrequencyUnitEnumT }
     *     
     */
    public void setFreqUnit(CouponFrequencyUnitEnumT value) {
        this.freqUnit = value;
    }

    /**
     * Gets the value of the roll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoll() {
        return roll;
    }

    /**
     * Sets the value of the roll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoll(String value) {
        this.roll = value;
    }

    /**
     * Gets the value of the firstDtUnadj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDtUnadj() {
        return firstDtUnadj;
    }

    /**
     * Sets the value of the firstDtUnadj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDtUnadj(XMLGregorianCalendar value) {
        this.firstDtUnadj = value;
    }

    /**
     * Gets the value of the lastDtUnadj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDtUnadj() {
        return lastDtUnadj;
    }

    /**
     * Sets the value of the lastDtUnadj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDtUnadj(XMLGregorianCalendar value) {
        this.lastDtUnadj = value;
    }

}

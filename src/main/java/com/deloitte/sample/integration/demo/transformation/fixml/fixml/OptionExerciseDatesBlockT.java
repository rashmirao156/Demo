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
 * <p>Java class for OptionExerciseDates_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExerciseDates_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OptionExerciseDatesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OptionExerciseDatesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExerciseDates_Block_t", propOrder = {
    "bizCtr",
    "dt"
})
public class OptionExerciseDatesBlockT {

    @XmlElement(name = "BizCtr")
    protected List<OptionExerciseBusinessCenterGrpBlockT> bizCtr;
    @XmlElement(name = "Dt")
    protected List<OptionExerciseDateGrpBlockT> dt;
    @XmlAttribute(name = "BizDayCnvtn")
    protected BigInteger bizDayCnvtn;
    @XmlAttribute(name = "ErlstOfstDayTyp")
    protected BigInteger erlstOfstDayTyp;
    @XmlAttribute(name = "ErlstOfstPeriod")
    protected BigInteger erlstOfstPeriod;
    @XmlAttribute(name = "ErlstOfstUnit")
    protected ProvisionOptionExerciseEarliestDateOffsetUnitEnumT erlstOfstUnit;
    @XmlAttribute(name = "FreqPeriod")
    protected BigInteger freqPeriod;
    @XmlAttribute(name = "FreqUnit")
    protected ProtectionTermEventUnitEnumT freqUnit;
    @XmlAttribute(name = "StartDtUnadj")
    protected XMLGregorianCalendar startDtUnadj;
    @XmlAttribute(name = "StartDtReltv")
    protected BigInteger startDtReltv;
    @XmlAttribute(name = "StartDtOfstPeriod")
    protected BigInteger startDtOfstPeriod;
    @XmlAttribute(name = "StartDtOfstUnit")
    protected PaymentStreamPaymentDateOffsetUnitEnumT startDtOfstUnit;
    @XmlAttribute(name = "StartDtOfstDayTyp")
    protected BigInteger startDtOfstDayTyp;
    @XmlAttribute(name = "StartDt")
    protected XMLGregorianCalendar startDt;
    @XmlAttribute(name = "Skip")
    protected BigInteger skip;
    @XmlAttribute(name = "NomntnDdln")
    protected XMLGregorianCalendar nomntnDdln;
    @XmlAttribute(name = "FirstDtUnadj")
    protected XMLGregorianCalendar firstDtUnadj;
    @XmlAttribute(name = "LastDtUnadj")
    protected XMLGregorianCalendar lastDtUnadj;
    @XmlAttribute(name = "ErlstTm")
    protected XMLGregorianCalendar erlstTm;
    @XmlAttribute(name = "LtstTm")
    protected XMLGregorianCalendar ltstTm;
    @XmlAttribute(name = "TmBizCtr")
    protected String tmBizCtr;

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
     * {@link OptionExerciseBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<OptionExerciseBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<OptionExerciseBusinessCenterGrpBlockT>();
        }
        return this.bizCtr;
    }

    /**
     * Gets the value of the dt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExerciseDateGrpBlockT }
     * 
     * 
     */
    public List<OptionExerciseDateGrpBlockT> getDt() {
        if (dt == null) {
            dt = new ArrayList<OptionExerciseDateGrpBlockT>();
        }
        return this.dt;
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
     * Gets the value of the erlstOfstDayTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErlstOfstDayTyp() {
        return erlstOfstDayTyp;
    }

    /**
     * Sets the value of the erlstOfstDayTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErlstOfstDayTyp(BigInteger value) {
        this.erlstOfstDayTyp = value;
    }

    /**
     * Gets the value of the erlstOfstPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErlstOfstPeriod() {
        return erlstOfstPeriod;
    }

    /**
     * Sets the value of the erlstOfstPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErlstOfstPeriod(BigInteger value) {
        this.erlstOfstPeriod = value;
    }

    /**
     * Gets the value of the erlstOfstUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionOptionExerciseEarliestDateOffsetUnitEnumT }
     *     
     */
    public ProvisionOptionExerciseEarliestDateOffsetUnitEnumT getErlstOfstUnit() {
        return erlstOfstUnit;
    }

    /**
     * Sets the value of the erlstOfstUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionOptionExerciseEarliestDateOffsetUnitEnumT }
     *     
     */
    public void setErlstOfstUnit(ProvisionOptionExerciseEarliestDateOffsetUnitEnumT value) {
        this.erlstOfstUnit = value;
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
     *     {@link ProtectionTermEventUnitEnumT }
     *     
     */
    public ProtectionTermEventUnitEnumT getFreqUnit() {
        return freqUnit;
    }

    /**
     * Sets the value of the freqUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionTermEventUnitEnumT }
     *     
     */
    public void setFreqUnit(ProtectionTermEventUnitEnumT value) {
        this.freqUnit = value;
    }

    /**
     * Gets the value of the startDtUnadj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDtUnadj() {
        return startDtUnadj;
    }

    /**
     * Sets the value of the startDtUnadj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDtUnadj(XMLGregorianCalendar value) {
        this.startDtUnadj = value;
    }

    /**
     * Gets the value of the startDtReltv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartDtReltv() {
        return startDtReltv;
    }

    /**
     * Sets the value of the startDtReltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartDtReltv(BigInteger value) {
        this.startDtReltv = value;
    }

    /**
     * Gets the value of the startDtOfstPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartDtOfstPeriod() {
        return startDtOfstPeriod;
    }

    /**
     * Sets the value of the startDtOfstPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartDtOfstPeriod(BigInteger value) {
        this.startDtOfstPeriod = value;
    }

    /**
     * Gets the value of the startDtOfstUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStreamPaymentDateOffsetUnitEnumT }
     *     
     */
    public PaymentStreamPaymentDateOffsetUnitEnumT getStartDtOfstUnit() {
        return startDtOfstUnit;
    }

    /**
     * Sets the value of the startDtOfstUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStreamPaymentDateOffsetUnitEnumT }
     *     
     */
    public void setStartDtOfstUnit(PaymentStreamPaymentDateOffsetUnitEnumT value) {
        this.startDtOfstUnit = value;
    }

    /**
     * Gets the value of the startDtOfstDayTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartDtOfstDayTyp() {
        return startDtOfstDayTyp;
    }

    /**
     * Sets the value of the startDtOfstDayTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartDtOfstDayTyp(BigInteger value) {
        this.startDtOfstDayTyp = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
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
     * Gets the value of the nomntnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNomntnDdln() {
        return nomntnDdln;
    }

    /**
     * Sets the value of the nomntnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNomntnDdln(XMLGregorianCalendar value) {
        this.nomntnDdln = value;
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

    /**
     * Gets the value of the erlstTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErlstTm() {
        return erlstTm;
    }

    /**
     * Sets the value of the erlstTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErlstTm(XMLGregorianCalendar value) {
        this.erlstTm = value;
    }

    /**
     * Gets the value of the ltstTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLtstTm() {
        return ltstTm;
    }

    /**
     * Sets the value of the ltstTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLtstTm(XMLGregorianCalendar value) {
        this.ltstTm = value;
    }

    /**
     * Gets the value of the tmBizCtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmBizCtr() {
        return tmBizCtr;
    }

    /**
     * Sets the value of the tmBizCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmBizCtr(String value) {
        this.tmBizCtr = value;
    }

}

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
 * <p>Java class for LegOptionExerciseExpiration_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegOptionExerciseExpiration_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegOptionExerciseExpirationElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegOptionExerciseExpirationAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegOptionExerciseExpiration_Block_t", propOrder = {
    "bizCtr",
    "dt"
})
public class LegOptionExerciseExpirationBlockT {

    @XmlElement(name = "BizCtr")
    protected List<LegOptionExerciseExpirationDateBusinessCenterGrpBlockT> bizCtr;
    @XmlElement(name = "Dt")
    protected List<LegOptionExerciseExpirationDateGrpBlockT> dt;
    @XmlAttribute(name = "BizDayCnvtn")
    protected BigInteger bizDayCnvtn;
    @XmlAttribute(name = "Reltv")
    protected BigInteger reltv;
    @XmlAttribute(name = "OfstPeriod")
    protected BigInteger ofstPeriod;
    @XmlAttribute(name = "OfstUnit")
    protected PaymentStreamPaymentDateOffsetUnitEnumT ofstUnit;
    @XmlAttribute(name = "FreqPeriod")
    protected BigInteger freqPeriod;
    @XmlAttribute(name = "FreqUnit")
    protected ProtectionTermEventUnitEnumT freqUnit;
    @XmlAttribute(name = "Roll")
    protected String roll;
    @XmlAttribute(name = "OfstDayTyp")
    protected BigInteger ofstDayTyp;
    @XmlAttribute(name = "Tm")
    protected XMLGregorianCalendar tm;
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
     * {@link LegOptionExerciseExpirationDateBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<LegOptionExerciseExpirationDateBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<LegOptionExerciseExpirationDateBusinessCenterGrpBlockT>();
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
     * {@link LegOptionExerciseExpirationDateGrpBlockT }
     * 
     * 
     */
    public List<LegOptionExerciseExpirationDateGrpBlockT> getDt() {
        if (dt == null) {
            dt = new ArrayList<LegOptionExerciseExpirationDateGrpBlockT>();
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
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
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

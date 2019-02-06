//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

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
 * <p>Java class for UnderlyingDividendAccrualPaymentDate_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingDividendAccrualPaymentDate_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendAccrualPaymentDateElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendAccrualPaymentDateAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingDividendAccrualPaymentDate_Block_t", propOrder = {
    "bizCtr"
})
public class UnderlyingDividendAccrualPaymentDateBlockT {

    @XmlElement(name = "BizCtr")
    protected List<UnderlyingDividendAccrualPaymentDateBusinessCenterGrpBlockT> bizCtr;
    @XmlAttribute(name = "Reltv")
    protected BigInteger reltv;
    @XmlAttribute(name = "OfstPeriod")
    protected BigInteger ofstPeriod;
    @XmlAttribute(name = "OfstUnit")
    protected PaymentStreamPaymentDateOffsetUnitEnumT ofstUnit;
    @XmlAttribute(name = "OfstDayTyp")
    protected BigInteger ofstDayTyp;
    @XmlAttribute(name = "DtUnadj")
    protected XMLGregorianCalendar dtUnadj;
    @XmlAttribute(name = "BizDayCnvtn")
    protected BigInteger bizDayCnvtn;
    @XmlAttribute(name = "Dt")
    protected XMLGregorianCalendar dt;

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
     * {@link UnderlyingDividendAccrualPaymentDateBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<UnderlyingDividendAccrualPaymentDateBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<UnderlyingDividendAccrualPaymentDateBusinessCenterGrpBlockT>();
        }
        return this.bizCtr;
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
     * Gets the value of the dtUnadj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtUnadj() {
        return dtUnadj;
    }

    /**
     * Sets the value of the dtUnadj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtUnadj(XMLGregorianCalendar value) {
        this.dtUnadj = value;
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
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

}

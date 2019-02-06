//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigDecimal;
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
 * <p>Java class for PaymentGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGrp_Block_t", propOrder = {
    "bizCtr",
    "pmtSettl"
})
public class PaymentGrpBlockT {

    @XmlElement(name = "BizCtr")
    protected List<PaymentBusinessCenterGrpBlockT> bizCtr;
    @XmlElement(name = "PmtSettl")
    protected List<PaymentSettlGrpBlockT> pmtSettl;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "SubTyp")
    protected BigInteger subTyp;
    @XmlAttribute(name = "PaySide")
    protected BigInteger paySide;
    @XmlAttribute(name = "RcvSide")
    protected BigInteger rcvSide;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    @XmlAttribute(name = "AmtReltv")
    protected BigInteger amtReltv;
    @XmlAttribute(name = "AmtDtrmnMeth")
    protected String amtDtrmnMeth;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "UOM")
    protected UnitOfMeasureEnumT uom;
    @XmlAttribute(name = "DtUnadj")
    protected XMLGregorianCalendar dtUnadj;
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
    @XmlAttribute(name = "Dt")
    protected XMLGregorianCalendar dt;
    @XmlAttribute(name = "FwdStartTyp")
    protected BigInteger fwdStartTyp;
    @XmlAttribute(name = "DiscFctr")
    protected BigDecimal discFctr;
    @XmlAttribute(name = "PVAmt")
    protected BigDecimal pvAmt;
    @XmlAttribute(name = "PVCcy")
    protected String pvCcy;
    @XmlAttribute(name = "SettlStyle")
    protected BigInteger settlStyle;
    @XmlAttribute(name = "PmtMethod")
    protected String pmtMethod;
    @XmlAttribute(name = "LegRefID")
    protected String legRefID;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected byte[] encTxt;

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
     * {@link PaymentBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<PaymentBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<PaymentBusinessCenterGrpBlockT>();
        }
        return this.bizCtr;
    }

    /**
     * Gets the value of the pmtSettl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtSettl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtSettl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSettlGrpBlockT }
     * 
     * 
     */
    public List<PaymentSettlGrpBlockT> getPmtSettl() {
        if (pmtSettl == null) {
            pmtSettl = new ArrayList<PaymentSettlGrpBlockT>();
        }
        return this.pmtSettl;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the subTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubTyp() {
        return subTyp;
    }

    /**
     * Sets the value of the subTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubTyp(BigInteger value) {
        this.subTyp = value;
    }

    /**
     * Gets the value of the paySide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaySide() {
        return paySide;
    }

    /**
     * Sets the value of the paySide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaySide(BigInteger value) {
        this.paySide = value;
    }

    /**
     * Gets the value of the rcvSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRcvSide() {
        return rcvSide;
    }

    /**
     * Sets the value of the rcvSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRcvSide(BigInteger value) {
        this.rcvSide = value;
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
     * Gets the value of the amtReltv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtReltv() {
        return amtReltv;
    }

    /**
     * Sets the value of the amtReltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtReltv(BigInteger value) {
        this.amtReltv = value;
    }

    /**
     * Gets the value of the amtDtrmnMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtDtrmnMeth() {
        return amtDtrmnMeth;
    }

    /**
     * Sets the value of the amtDtrmnMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtDtrmnMeth(String value) {
        this.amtDtrmnMeth = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the pxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTyp() {
        return pxTyp;
    }

    /**
     * Sets the value of the pxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTyp(BigInteger value) {
        this.pxTyp = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public UnitOfMeasureEnumT getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public void setUOM(UnitOfMeasureEnumT value) {
        this.uom = value;
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

    /**
     * Gets the value of the fwdStartTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFwdStartTyp() {
        return fwdStartTyp;
    }

    /**
     * Sets the value of the fwdStartTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFwdStartTyp(BigInteger value) {
        this.fwdStartTyp = value;
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
     * Gets the value of the pvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPVAmt() {
        return pvAmt;
    }

    /**
     * Sets the value of the pvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPVAmt(BigDecimal value) {
        this.pvAmt = value;
    }

    /**
     * Gets the value of the pvCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPVCcy() {
        return pvCcy;
    }

    /**
     * Sets the value of the pvCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPVCcy(String value) {
        this.pvCcy = value;
    }

    /**
     * Gets the value of the settlStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlStyle() {
        return settlStyle;
    }

    /**
     * Sets the value of the settlStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlStyle(BigInteger value) {
        this.settlStyle = value;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the legRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRefID() {
        return legRefID;
    }

    /**
     * Sets the value of the legRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegRefID(String value) {
        this.legRefID = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncTxt(byte[] value) {
        this.encTxt = value;
    }

}

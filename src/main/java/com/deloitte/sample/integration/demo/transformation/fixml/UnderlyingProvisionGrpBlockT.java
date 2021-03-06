//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

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
 * <p>Java class for UnderlyingProvisionGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingProvisionGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingProvisionGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingProvisionGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingProvisionGrp_Block_t", propOrder = {
    "bizCtr",
    "cashSettlValDts",
    "optExerDts",
    "optExpDt",
    "optRelvntUndlyDt",
    "cashSettlPmtDts",
    "cashSettlQteSrc",
    "pty"
})
public class UnderlyingProvisionGrpBlockT {

    @XmlElement(name = "BizCtr")
    protected List<UnderlyingProvisionDateBusinessCenterGrpBlockT> bizCtr;
    @XmlElement(name = "CashSettlValDts")
    protected UnderlyingProvisionCashSettlValueDatesBlockT cashSettlValDts;
    @XmlElement(name = "OptExerDts")
    protected UnderlyingProvisionOptionExerciseDatesBlockT optExerDts;
    @XmlElement(name = "OptExpDt")
    protected UnderlyingProvisionOptionExpirationDateBlockT optExpDt;
    @XmlElement(name = "OptRelvntUndlyDt")
    protected UnderlyingProvisionOptionRelevantUnderlyingDateBlockT optRelvntUndlyDt;
    @XmlElement(name = "CashSettlPmtDts")
    protected UnderlyingProvisionCashSettlPaymentDatesBlockT cashSettlPmtDts;
    @XmlElement(name = "CashSettlQteSrc")
    protected UnderlyingProvisionCashSettlQuoteSourceBlockT cashSettlQteSrc;
    @XmlElement(name = "Pty")
    protected List<UnderlyingProvisionPartiesBlockT> pty;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "DtUnadj")
    protected XMLGregorianCalendar dtUnadj;
    @XmlAttribute(name = "BizDayCnvtn")
    protected BigInteger bizDayCnvtn;
    @XmlAttribute(name = "Dt")
    protected XMLGregorianCalendar dt;
    @XmlAttribute(name = "TenorPeriod")
    protected BigInteger tenorPeriod;
    @XmlAttribute(name = "TenorUnit")
    protected ProvisionDateTenorUnitEnumT tenorUnit;
    @XmlAttribute(name = "BrkFeeElctn")
    protected BigInteger brkFeeElctn;
    @XmlAttribute(name = "BrkFeeRt")
    protected BigDecimal brkFeeRt;
    @XmlAttribute(name = "CalcAgent")
    protected BigInteger calcAgent;
    @XmlAttribute(name = "BuyerSide")
    protected BigInteger buyerSide;
    @XmlAttribute(name = "SellerSide")
    protected BigInteger sellerSide;
    @XmlAttribute(name = "ExerStyle")
    protected String exerStyle;
    @XmlAttribute(name = "MultplNotl")
    protected BigDecimal multplNotl;
    @XmlAttribute(name = "MinNotl")
    protected BigDecimal minNotl;
    @XmlAttribute(name = "MaxNotl")
    protected BigDecimal maxNotl;
    @XmlAttribute(name = "MinNum")
    protected BigInteger minNum;
    @XmlAttribute(name = "MaxNum")
    protected BigInteger maxNum;
    @XmlAttribute(name = "ExerCnfm")
    protected String exerCnfm;
    @XmlAttribute(name = "SettlMeth")
    protected BigInteger settlMeth;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "SettlCcy2")
    protected String settlCcy2;
    @XmlAttribute(name = "SettlQteTyp")
    protected BigInteger settlQteTyp;
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
     * {@link UnderlyingProvisionDateBusinessCenterGrpBlockT }
     * 
     * 
     */
    public List<UnderlyingProvisionDateBusinessCenterGrpBlockT> getBizCtr() {
        if (bizCtr == null) {
            bizCtr = new ArrayList<UnderlyingProvisionDateBusinessCenterGrpBlockT>();
        }
        return this.bizCtr;
    }

    /**
     * Gets the value of the cashSettlValDts property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionCashSettlValueDatesBlockT }
     *     
     */
    public UnderlyingProvisionCashSettlValueDatesBlockT getCashSettlValDts() {
        return cashSettlValDts;
    }

    /**
     * Sets the value of the cashSettlValDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionCashSettlValueDatesBlockT }
     *     
     */
    public void setCashSettlValDts(UnderlyingProvisionCashSettlValueDatesBlockT value) {
        this.cashSettlValDts = value;
    }

    /**
     * Gets the value of the optExerDts property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionOptionExerciseDatesBlockT }
     *     
     */
    public UnderlyingProvisionOptionExerciseDatesBlockT getOptExerDts() {
        return optExerDts;
    }

    /**
     * Sets the value of the optExerDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionOptionExerciseDatesBlockT }
     *     
     */
    public void setOptExerDts(UnderlyingProvisionOptionExerciseDatesBlockT value) {
        this.optExerDts = value;
    }

    /**
     * Gets the value of the optExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionOptionExpirationDateBlockT }
     *     
     */
    public UnderlyingProvisionOptionExpirationDateBlockT getOptExpDt() {
        return optExpDt;
    }

    /**
     * Sets the value of the optExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionOptionExpirationDateBlockT }
     *     
     */
    public void setOptExpDt(UnderlyingProvisionOptionExpirationDateBlockT value) {
        this.optExpDt = value;
    }

    /**
     * Gets the value of the optRelvntUndlyDt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionOptionRelevantUnderlyingDateBlockT }
     *     
     */
    public UnderlyingProvisionOptionRelevantUnderlyingDateBlockT getOptRelvntUndlyDt() {
        return optRelvntUndlyDt;
    }

    /**
     * Sets the value of the optRelvntUndlyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionOptionRelevantUnderlyingDateBlockT }
     *     
     */
    public void setOptRelvntUndlyDt(UnderlyingProvisionOptionRelevantUnderlyingDateBlockT value) {
        this.optRelvntUndlyDt = value;
    }

    /**
     * Gets the value of the cashSettlPmtDts property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionCashSettlPaymentDatesBlockT }
     *     
     */
    public UnderlyingProvisionCashSettlPaymentDatesBlockT getCashSettlPmtDts() {
        return cashSettlPmtDts;
    }

    /**
     * Sets the value of the cashSettlPmtDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionCashSettlPaymentDatesBlockT }
     *     
     */
    public void setCashSettlPmtDts(UnderlyingProvisionCashSettlPaymentDatesBlockT value) {
        this.cashSettlPmtDts = value;
    }

    /**
     * Gets the value of the cashSettlQteSrc property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProvisionCashSettlQuoteSourceBlockT }
     *     
     */
    public UnderlyingProvisionCashSettlQuoteSourceBlockT getCashSettlQteSrc() {
        return cashSettlQteSrc;
    }

    /**
     * Sets the value of the cashSettlQteSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProvisionCashSettlQuoteSourceBlockT }
     *     
     */
    public void setCashSettlQteSrc(UnderlyingProvisionCashSettlQuoteSourceBlockT value) {
        this.cashSettlQteSrc = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingProvisionPartiesBlockT }
     * 
     * 
     */
    public List<UnderlyingProvisionPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<UnderlyingProvisionPartiesBlockT>();
        }
        return this.pty;
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

    /**
     * Gets the value of the tenorPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTenorPeriod() {
        return tenorPeriod;
    }

    /**
     * Sets the value of the tenorPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTenorPeriod(BigInteger value) {
        this.tenorPeriod = value;
    }

    /**
     * Gets the value of the tenorUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionDateTenorUnitEnumT }
     *     
     */
    public ProvisionDateTenorUnitEnumT getTenorUnit() {
        return tenorUnit;
    }

    /**
     * Sets the value of the tenorUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionDateTenorUnitEnumT }
     *     
     */
    public void setTenorUnit(ProvisionDateTenorUnitEnumT value) {
        this.tenorUnit = value;
    }

    /**
     * Gets the value of the brkFeeElctn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrkFeeElctn() {
        return brkFeeElctn;
    }

    /**
     * Sets the value of the brkFeeElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrkFeeElctn(BigInteger value) {
        this.brkFeeElctn = value;
    }

    /**
     * Gets the value of the brkFeeRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrkFeeRt() {
        return brkFeeRt;
    }

    /**
     * Sets the value of the brkFeeRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrkFeeRt(BigDecimal value) {
        this.brkFeeRt = value;
    }

    /**
     * Gets the value of the calcAgent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalcAgent() {
        return calcAgent;
    }

    /**
     * Sets the value of the calcAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalcAgent(BigInteger value) {
        this.calcAgent = value;
    }

    /**
     * Gets the value of the buyerSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuyerSide() {
        return buyerSide;
    }

    /**
     * Sets the value of the buyerSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuyerSide(BigInteger value) {
        this.buyerSide = value;
    }

    /**
     * Gets the value of the sellerSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSellerSide() {
        return sellerSide;
    }

    /**
     * Sets the value of the sellerSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSellerSide(BigInteger value) {
        this.sellerSide = value;
    }

    /**
     * Gets the value of the exerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerStyle() {
        return exerStyle;
    }

    /**
     * Sets the value of the exerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerStyle(String value) {
        this.exerStyle = value;
    }

    /**
     * Gets the value of the multplNotl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultplNotl() {
        return multplNotl;
    }

    /**
     * Sets the value of the multplNotl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultplNotl(BigDecimal value) {
        this.multplNotl = value;
    }

    /**
     * Gets the value of the minNotl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinNotl() {
        return minNotl;
    }

    /**
     * Sets the value of the minNotl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinNotl(BigDecimal value) {
        this.minNotl = value;
    }

    /**
     * Gets the value of the maxNotl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNotl() {
        return maxNotl;
    }

    /**
     * Sets the value of the maxNotl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNotl(BigDecimal value) {
        this.maxNotl = value;
    }

    /**
     * Gets the value of the minNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNum() {
        return minNum;
    }

    /**
     * Sets the value of the minNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNum(BigInteger value) {
        this.minNum = value;
    }

    /**
     * Gets the value of the maxNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNum() {
        return maxNum;
    }

    /**
     * Sets the value of the maxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNum(BigInteger value) {
        this.maxNum = value;
    }

    /**
     * Gets the value of the exerCnfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerCnfm() {
        return exerCnfm;
    }

    /**
     * Sets the value of the exerCnfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerCnfm(String value) {
        this.exerCnfm = value;
    }

    /**
     * Gets the value of the settlMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlMeth() {
        return settlMeth;
    }

    /**
     * Sets the value of the settlMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlMeth(BigInteger value) {
        this.settlMeth = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the settlCcy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy2() {
        return settlCcy2;
    }

    /**
     * Sets the value of the settlCcy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy2(String value) {
        this.settlCcy2 = value;
    }

    /**
     * Gets the value of the settlQteTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlQteTyp() {
        return settlQteTyp;
    }

    /**
     * Sets the value of the settlQteTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlQteTyp(BigInteger value) {
        this.settlQteTyp = value;
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

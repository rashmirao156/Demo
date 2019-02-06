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


/**
 * <p>Java class for UnderlyingDividendConditions_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingDividendConditions_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendConditionsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingDividendConditionsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingDividendConditions_Block_t", propOrder = {
    "period",
    "fxTrgrDt",
    "acrlFloat",
    "acrlPmtDt"
})
public class UnderlyingDividendConditionsBlockT {

    @XmlElement(name = "Period")
    protected List<UnderlyingDividendPeriodGrpBlockT> period;
    @XmlElement(name = "FXTrgrDt")
    protected UnderlyingDividendFXTriggerDateBlockT fxTrgrDt;
    @XmlElement(name = "AcrlFloat")
    protected UnderlyingDividendAccrualFloatingRateBlockT acrlFloat;
    @XmlElement(name = "AcrlPmtDt")
    protected UnderlyingDividendAccrualPaymentDateBlockT acrlPmtDt;
    @XmlAttribute(name = "RnvstmntInd")
    protected String rnvstmntInd;
    @XmlAttribute(name = "EntlmntEvnt")
    protected BigInteger entlmntEvnt;
    @XmlAttribute(name = "AmtTyp")
    protected BigInteger amtTyp;
    @XmlAttribute(name = "UndlrRefID")
    protected String undlrRefID;
    @XmlAttribute(name = "ExtrordSide")
    protected BigInteger extrordSide;
    @XmlAttribute(name = "ExtrordAmtTyp")
    protected BigInteger extrordAmtTyp;
    @XmlAttribute(name = "ExtrordCcy")
    protected String extrordCcy;
    @XmlAttribute(name = "ExtrordDtrmnMeth")
    protected String extrordDtrmnMeth;
    @XmlAttribute(name = "AcrlFixedRt")
    protected BigDecimal acrlFixedRt;
    @XmlAttribute(name = "CmpndgMeth")
    protected BigInteger cmpndgMeth;
    @XmlAttribute(name = "NumNdxUnits")
    protected BigInteger numNdxUnits;
    @XmlAttribute(name = "CshPctage")
    protected BigDecimal cshPctage;
    @XmlAttribute(name = "CshEqvlntPctage")
    protected BigDecimal cshEqvlntPctage;
    @XmlAttribute(name = "NonCshTrtmt")
    protected BigInteger nonCshTrtmt;
    @XmlAttribute(name = "Cmpstn")
    protected BigInteger cmpstn;
    @XmlAttribute(name = "SpeclDividendInd")
    protected String speclDividendInd;
    @XmlAttribute(name = "MtrlDividendInd")
    protected String mtrlDividendInd;
    @XmlAttribute(name = "ExchDividendInd")
    protected String exchDividendInd;
    @XmlAttribute(name = "AddtnlDividendInd")
    protected String addtnlDividendInd;
    @XmlAttribute(name = "AllDividendInd")
    protected String allDividendInd;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingDividendPeriodGrpBlockT }
     * 
     * 
     */
    public List<UnderlyingDividendPeriodGrpBlockT> getPeriod() {
        if (period == null) {
            period = new ArrayList<UnderlyingDividendPeriodGrpBlockT>();
        }
        return this.period;
    }

    /**
     * Gets the value of the fxTrgrDt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingDividendFXTriggerDateBlockT }
     *     
     */
    public UnderlyingDividendFXTriggerDateBlockT getFXTrgrDt() {
        return fxTrgrDt;
    }

    /**
     * Sets the value of the fxTrgrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingDividendFXTriggerDateBlockT }
     *     
     */
    public void setFXTrgrDt(UnderlyingDividendFXTriggerDateBlockT value) {
        this.fxTrgrDt = value;
    }

    /**
     * Gets the value of the acrlFloat property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingDividendAccrualFloatingRateBlockT }
     *     
     */
    public UnderlyingDividendAccrualFloatingRateBlockT getAcrlFloat() {
        return acrlFloat;
    }

    /**
     * Sets the value of the acrlFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingDividendAccrualFloatingRateBlockT }
     *     
     */
    public void setAcrlFloat(UnderlyingDividendAccrualFloatingRateBlockT value) {
        this.acrlFloat = value;
    }

    /**
     * Gets the value of the acrlPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingDividendAccrualPaymentDateBlockT }
     *     
     */
    public UnderlyingDividendAccrualPaymentDateBlockT getAcrlPmtDt() {
        return acrlPmtDt;
    }

    /**
     * Sets the value of the acrlPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingDividendAccrualPaymentDateBlockT }
     *     
     */
    public void setAcrlPmtDt(UnderlyingDividendAccrualPaymentDateBlockT value) {
        this.acrlPmtDt = value;
    }

    /**
     * Gets the value of the rnvstmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnvstmntInd() {
        return rnvstmntInd;
    }

    /**
     * Sets the value of the rnvstmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnvstmntInd(String value) {
        this.rnvstmntInd = value;
    }

    /**
     * Gets the value of the entlmntEvnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntlmntEvnt() {
        return entlmntEvnt;
    }

    /**
     * Sets the value of the entlmntEvnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntlmntEvnt(BigInteger value) {
        this.entlmntEvnt = value;
    }

    /**
     * Gets the value of the amtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmtTyp() {
        return amtTyp;
    }

    /**
     * Sets the value of the amtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmtTyp(BigInteger value) {
        this.amtTyp = value;
    }

    /**
     * Gets the value of the undlrRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndlrRefID() {
        return undlrRefID;
    }

    /**
     * Sets the value of the undlrRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndlrRefID(String value) {
        this.undlrRefID = value;
    }

    /**
     * Gets the value of the extrordSide property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtrordSide() {
        return extrordSide;
    }

    /**
     * Sets the value of the extrordSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtrordSide(BigInteger value) {
        this.extrordSide = value;
    }

    /**
     * Gets the value of the extrordAmtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtrordAmtTyp() {
        return extrordAmtTyp;
    }

    /**
     * Sets the value of the extrordAmtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtrordAmtTyp(BigInteger value) {
        this.extrordAmtTyp = value;
    }

    /**
     * Gets the value of the extrordCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrordCcy() {
        return extrordCcy;
    }

    /**
     * Sets the value of the extrordCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrordCcy(String value) {
        this.extrordCcy = value;
    }

    /**
     * Gets the value of the extrordDtrmnMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrordDtrmnMeth() {
        return extrordDtrmnMeth;
    }

    /**
     * Sets the value of the extrordDtrmnMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrordDtrmnMeth(String value) {
        this.extrordDtrmnMeth = value;
    }

    /**
     * Gets the value of the acrlFixedRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrlFixedRt() {
        return acrlFixedRt;
    }

    /**
     * Sets the value of the acrlFixedRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrlFixedRt(BigDecimal value) {
        this.acrlFixedRt = value;
    }

    /**
     * Gets the value of the cmpndgMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmpndgMeth() {
        return cmpndgMeth;
    }

    /**
     * Sets the value of the cmpndgMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmpndgMeth(BigInteger value) {
        this.cmpndgMeth = value;
    }

    /**
     * Gets the value of the numNdxUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumNdxUnits() {
        return numNdxUnits;
    }

    /**
     * Sets the value of the numNdxUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumNdxUnits(BigInteger value) {
        this.numNdxUnits = value;
    }

    /**
     * Gets the value of the cshPctage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshPctage() {
        return cshPctage;
    }

    /**
     * Sets the value of the cshPctage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshPctage(BigDecimal value) {
        this.cshPctage = value;
    }

    /**
     * Gets the value of the cshEqvlntPctage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshEqvlntPctage() {
        return cshEqvlntPctage;
    }

    /**
     * Sets the value of the cshEqvlntPctage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshEqvlntPctage(BigDecimal value) {
        this.cshEqvlntPctage = value;
    }

    /**
     * Gets the value of the nonCshTrtmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonCshTrtmt() {
        return nonCshTrtmt;
    }

    /**
     * Sets the value of the nonCshTrtmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonCshTrtmt(BigInteger value) {
        this.nonCshTrtmt = value;
    }

    /**
     * Gets the value of the cmpstn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCmpstn() {
        return cmpstn;
    }

    /**
     * Sets the value of the cmpstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCmpstn(BigInteger value) {
        this.cmpstn = value;
    }

    /**
     * Gets the value of the speclDividendInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeclDividendInd() {
        return speclDividendInd;
    }

    /**
     * Sets the value of the speclDividendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeclDividendInd(String value) {
        this.speclDividendInd = value;
    }

    /**
     * Gets the value of the mtrlDividendInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtrlDividendInd() {
        return mtrlDividendInd;
    }

    /**
     * Sets the value of the mtrlDividendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtrlDividendInd(String value) {
        this.mtrlDividendInd = value;
    }

    /**
     * Gets the value of the exchDividendInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchDividendInd() {
        return exchDividendInd;
    }

    /**
     * Sets the value of the exchDividendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchDividendInd(String value) {
        this.exchDividendInd = value;
    }

    /**
     * Gets the value of the addtnlDividendInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtnlDividendInd() {
        return addtnlDividendInd;
    }

    /**
     * Sets the value of the addtnlDividendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtnlDividendInd(String value) {
        this.addtnlDividendInd = value;
    }

    /**
     * Gets the value of the allDividendInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllDividendInd() {
        return allDividendInd;
    }

    /**
     * Sets the value of the allDividendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllDividendInd(String value) {
        this.allDividendInd = value;
    }

}

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
 * <p>Java class for AllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocGrp_Block_t", propOrder = {
    "regTrdID",
    "pty",
    "comm",
    "commData",
    "miscFees",
    "clrInst",
    "setInstr",
    "amt"
})
public class AllocGrpBlockT {

    @XmlElement(name = "RegTrdID")
    protected List<AllocRegulatoryTradeIDGrpBlockT> regTrdID;
    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlElement(name = "CommData")
    protected List<AllocCommissionDataGrpBlockT> commData;
    @XmlElement(name = "MiscFees")
    protected List<MiscFeesGrpBlockT> miscFees;
    @XmlElement(name = "ClrInst")
    protected List<ClrInstGrpBlockT> clrInst;
    @XmlElement(name = "SetInstr")
    protected SettlInstructionsDataBlockT setInstr;
    @XmlElement(name = "Amt")
    protected List<TradeAllocAmtGrpBlockT> amt;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "CalcCcyQty")
    protected BigDecimal calcCcyQty;
    @XmlAttribute(name = "CstdlLotID")
    protected String cstdlLotID;
    @XmlAttribute(name = "VSPDt")
    protected XMLGregorianCalendar vspDt;
    @XmlAttribute(name = "VSPPx")
    protected BigDecimal vspPx;
    @XmlAttribute(name = "CurCostBasis")
    protected BigDecimal curCostBasis;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "FirmMnem")
    protected String firmMnem;
    @XmlAttribute(name = "ParentAllocID")
    protected String parentAllocID;
    @XmlAttribute(name = "LegRefID")
    protected String legRefID;
    @XmlAttribute(name = "ProcCode")
    protected String procCode;
    @XmlAttribute(name = "IndAllocID2")
    protected String indAllocID2;
    @XmlAttribute(name = "Meth")
    protected BigInteger meth;
    @XmlAttribute(name = "AllocRollupInst")
    protected BigInteger allocRollupInst;
    @XmlAttribute(name = "CustCpcty")
    protected String custCpcty;
    @XmlAttribute(name = "AllocPosEfct")
    protected AllocPositionEffectEnumT allocPosEfct;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "NotifyBrkrOfCredit")
    protected NotifyBrokerOfCreditEnumT notifyBrkrOfCredit;
    @XmlAttribute(name = "HandlInst")
    protected BigInteger handlInst;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncAllocTextLen")
    protected BigInteger encAllocTextLen;
    @XmlAttribute(name = "EncAllocText")
    protected byte[] encAllocText;
    @XmlAttribute(name = "FirmTxt")
    protected String firmTxt;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "NetMny")
    protected BigDecimal netMny;
    @XmlAttribute(name = "SettlCurrAmt")
    protected BigDecimal settlCurrAmt;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
    @XmlAttribute(name = "SettlCcyAmt")
    protected BigDecimal settlCcyAmt;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "AllocSettlCcy")
    protected String allocSettlCcy;
    @XmlAttribute(name = "SettlCurrFxRt")
    protected BigDecimal settlCurrFxRt;
    @XmlAttribute(name = "SettlCurrFxRtCalc")
    protected SettlCurrFxRateCalcEnumT settlCurrFxRtCalc;
    @XmlAttribute(name = "AcrdIntAmt")
    protected BigDecimal acrdIntAmt;
    @XmlAttribute(name = "IntAtMat")
    protected BigDecimal intAtMat;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
    @XmlAttribute(name = "SettlInstTyp")
    protected BigInteger settlInstTyp;
    @XmlAttribute(name = "RefRiskLmtChkID")
    protected String refRiskLmtChkID;
    @XmlAttribute(name = "RefRiskLmtChkIDTyp")
    protected BigInteger refRiskLmtChkIDTyp;
    @XmlAttribute(name = "RiskLmtChkStat")
    protected BigInteger riskLmtChkStat;
    @XmlAttribute(name = "GrpAmt")
    protected BigDecimal grpAmt;

    /**
     * Gets the value of the regTrdID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regTrdID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegTrdID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocRegulatoryTradeIDGrpBlockT }
     * 
     * 
     */
    public List<AllocRegulatoryTradeIDGrpBlockT> getRegTrdID() {
        if (regTrdID == null) {
            regTrdID = new ArrayList<AllocRegulatoryTradeIDGrpBlockT>();
        }
        return this.regTrdID;
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
     * {@link NestedPartiesBlockT }
     * 
     * 
     */
    public List<NestedPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the comm property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public CommissionDataBlockT getComm() {
        return comm;
    }

    /**
     * Sets the value of the comm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public void setComm(CommissionDataBlockT value) {
        this.comm = value;
    }

    /**
     * Gets the value of the commData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocCommissionDataGrpBlockT }
     * 
     * 
     */
    public List<AllocCommissionDataGrpBlockT> getCommData() {
        if (commData == null) {
            commData = new ArrayList<AllocCommissionDataGrpBlockT>();
        }
        return this.commData;
    }

    /**
     * Gets the value of the miscFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscFeesGrpBlockT }
     * 
     * 
     */
    public List<MiscFeesGrpBlockT> getMiscFees() {
        if (miscFees == null) {
            miscFees = new ArrayList<MiscFeesGrpBlockT>();
        }
        return this.miscFees;
    }

    /**
     * Gets the value of the clrInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClrInstGrpBlockT }
     * 
     * 
     */
    public List<ClrInstGrpBlockT> getClrInst() {
        if (clrInst == null) {
            clrInst = new ArrayList<ClrInstGrpBlockT>();
        }
        return this.clrInst;
    }

    /**
     * Gets the value of the setInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public SettlInstructionsDataBlockT getSetInstr() {
        return setInstr;
    }

    /**
     * Sets the value of the setInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public void setSetInstr(SettlInstructionsDataBlockT value) {
        this.setInstr = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeAllocAmtGrpBlockT }
     * 
     * 
     */
    public List<TradeAllocAmtGrpBlockT> getAmt() {
        if (amt == null) {
            amt = new ArrayList<TradeAllocAmtGrpBlockT>();
        }
        return this.amt;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the actIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActIDSrc() {
        return actIDSrc;
    }

    /**
     * Sets the value of the actIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActIDSrc(BigInteger value) {
        this.actIDSrc = value;
    }

    /**
     * Gets the value of the mtchStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchStat() {
        return mtchStat;
    }

    /**
     * Sets the value of the mtchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchStat(String value) {
        this.mtchStat = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the calcCcyQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcCcyQty() {
        return calcCcyQty;
    }

    /**
     * Sets the value of the calcCcyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcCcyQty(BigDecimal value) {
        this.calcCcyQty = value;
    }

    /**
     * Gets the value of the cstdlLotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstdlLotID() {
        return cstdlLotID;
    }

    /**
     * Sets the value of the cstdlLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstdlLotID(String value) {
        this.cstdlLotID = value;
    }

    /**
     * Gets the value of the vspDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVSPDt() {
        return vspDt;
    }

    /**
     * Sets the value of the vspDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVSPDt(XMLGregorianCalendar value) {
        this.vspDt = value;
    }

    /**
     * Gets the value of the vspPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVSPPx() {
        return vspPx;
    }

    /**
     * Sets the value of the vspPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVSPPx(BigDecimal value) {
        this.vspPx = value;
    }

    /**
     * Gets the value of the curCostBasis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurCostBasis() {
        return curCostBasis;
    }

    /**
     * Sets the value of the curCostBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurCostBasis(BigDecimal value) {
        this.curCostBasis = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
    }

    /**
     * Gets the value of the firmMnem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmMnem() {
        return firmMnem;
    }

    /**
     * Sets the value of the firmMnem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmMnem(String value) {
        this.firmMnem = value;
    }

    /**
     * Gets the value of the parentAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAllocID() {
        return parentAllocID;
    }

    /**
     * Sets the value of the parentAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAllocID(String value) {
        this.parentAllocID = value;
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
     * Gets the value of the procCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcCode() {
        return procCode;
    }

    /**
     * Sets the value of the procCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcCode(String value) {
        this.procCode = value;
    }

    /**
     * Gets the value of the indAllocID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID2() {
        return indAllocID2;
    }

    /**
     * Sets the value of the indAllocID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID2(String value) {
        this.indAllocID2 = value;
    }

    /**
     * Gets the value of the meth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeth() {
        return meth;
    }

    /**
     * Sets the value of the meth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeth(BigInteger value) {
        this.meth = value;
    }

    /**
     * Gets the value of the allocRollupInst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllocRollupInst() {
        return allocRollupInst;
    }

    /**
     * Sets the value of the allocRollupInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllocRollupInst(BigInteger value) {
        this.allocRollupInst = value;
    }

    /**
     * Gets the value of the custCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCpcty() {
        return custCpcty;
    }

    /**
     * Sets the value of the custCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCpcty(String value) {
        this.custCpcty = value;
    }

    /**
     * Gets the value of the allocPosEfct property.
     * 
     * @return
     *     possible object is
     *     {@link AllocPositionEffectEnumT }
     *     
     */
    public AllocPositionEffectEnumT getAllocPosEfct() {
        return allocPosEfct;
    }

    /**
     * Sets the value of the allocPosEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocPositionEffectEnumT }
     *     
     */
    public void setAllocPosEfct(AllocPositionEffectEnumT value) {
        this.allocPosEfct = value;
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
     * Gets the value of the notifyBrkrOfCredit property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyBrokerOfCreditEnumT }
     *     
     */
    public NotifyBrokerOfCreditEnumT getNotifyBrkrOfCredit() {
        return notifyBrkrOfCredit;
    }

    /**
     * Sets the value of the notifyBrkrOfCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyBrokerOfCreditEnumT }
     *     
     */
    public void setNotifyBrkrOfCredit(NotifyBrokerOfCreditEnumT value) {
        this.notifyBrkrOfCredit = value;
    }

    /**
     * Gets the value of the handlInst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHandlInst() {
        return handlInst;
    }

    /**
     * Sets the value of the handlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHandlInst(BigInteger value) {
        this.handlInst = value;
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
     * Gets the value of the encAllocTextLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncAllocTextLen() {
        return encAllocTextLen;
    }

    /**
     * Sets the value of the encAllocTextLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncAllocTextLen(BigInteger value) {
        this.encAllocTextLen = value;
    }

    /**
     * Gets the value of the encAllocText property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncAllocText() {
        return encAllocText;
    }

    /**
     * Sets the value of the encAllocText property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncAllocText(byte[] value) {
        this.encAllocText = value;
    }

    /**
     * Gets the value of the firmTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmTxt() {
        return firmTxt;
    }

    /**
     * Sets the value of the firmTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmTxt(String value) {
        this.firmTxt = value;
    }

    /**
     * Gets the value of the avgPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgPx() {
        return avgPx;
    }

    /**
     * Sets the value of the avgPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPx(BigDecimal value) {
        this.avgPx = value;
    }

    /**
     * Gets the value of the netMny property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetMny() {
        return netMny;
    }

    /**
     * Sets the value of the netMny property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetMny(BigDecimal value) {
        this.netMny = value;
    }

    /**
     * Gets the value of the settlCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrAmt() {
        return settlCurrAmt;
    }

    /**
     * Sets the value of the settlCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrAmt(BigDecimal value) {
        this.settlCurrAmt = value;
    }

    /**
     * Gets the value of the grossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTrdAmt() {
        return grossTrdAmt;
    }

    /**
     * Sets the value of the grossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTrdAmt(BigDecimal value) {
        this.grossTrdAmt = value;
    }

    /**
     * Gets the value of the settlCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCcyAmt() {
        return settlCcyAmt;
    }

    /**
     * Sets the value of the settlCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCcyAmt(BigDecimal value) {
        this.settlCcyAmt = value;
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
     * Gets the value of the allocSettlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocSettlCcy() {
        return allocSettlCcy;
    }

    /**
     * Sets the value of the allocSettlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocSettlCcy(String value) {
        this.allocSettlCcy = value;
    }

    /**
     * Gets the value of the settlCurrFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrFxRt() {
        return settlCurrFxRt;
    }

    /**
     * Sets the value of the settlCurrFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrFxRt(BigDecimal value) {
        this.settlCurrFxRt = value;
    }

    /**
     * Gets the value of the settlCurrFxRtCalc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public SettlCurrFxRateCalcEnumT getSettlCurrFxRtCalc() {
        return settlCurrFxRtCalc;
    }

    /**
     * Sets the value of the settlCurrFxRtCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public void setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT value) {
        this.settlCurrFxRtCalc = value;
    }

    /**
     * Gets the value of the acrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntAmt() {
        return acrdIntAmt;
    }

    /**
     * Sets the value of the acrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntAmt(BigDecimal value) {
        this.acrdIntAmt = value;
    }

    /**
     * Gets the value of the intAtMat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAtMat() {
        return intAtMat;
    }

    /**
     * Sets the value of the intAtMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAtMat(BigDecimal value) {
        this.intAtMat = value;
    }

    /**
     * Gets the value of the clrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrFeeInd() {
        return clrFeeInd;
    }

    /**
     * Sets the value of the clrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrFeeInd(String value) {
        this.clrFeeInd = value;
    }

    /**
     * Gets the value of the settlInstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlInstTyp() {
        return settlInstTyp;
    }

    /**
     * Sets the value of the settlInstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlInstTyp(BigInteger value) {
        this.settlInstTyp = value;
    }

    /**
     * Gets the value of the refRiskLmtChkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefRiskLmtChkID() {
        return refRiskLmtChkID;
    }

    /**
     * Sets the value of the refRiskLmtChkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefRiskLmtChkID(String value) {
        this.refRiskLmtChkID = value;
    }

    /**
     * Gets the value of the refRiskLmtChkIDTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefRiskLmtChkIDTyp() {
        return refRiskLmtChkIDTyp;
    }

    /**
     * Sets the value of the refRiskLmtChkIDTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefRiskLmtChkIDTyp(BigInteger value) {
        this.refRiskLmtChkIDTyp = value;
    }

    /**
     * Gets the value of the riskLmtChkStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRiskLmtChkStat() {
        return riskLmtChkStat;
    }

    /**
     * Sets the value of the riskLmtChkStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRiskLmtChkStat(BigInteger value) {
        this.riskLmtChkStat = value;
    }

    /**
     * Gets the value of the grpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrpAmt() {
        return grpAmt;
    }

    /**
     * Sets the value of the grpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrpAmt(BigDecimal value) {
        this.grpAmt = value;
    }

}
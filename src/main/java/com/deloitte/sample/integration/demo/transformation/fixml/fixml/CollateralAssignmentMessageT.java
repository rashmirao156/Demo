//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import com.deloitte.sample.integration.demo.transformation.fixml.StipulationsBlockT;
import com.deloitte.sample.integration.demo.transformation.fixml.TrdCollGrpBlockT;
import com.deloitte.sample.integration.demo.transformation.fixml.TrdRegTimestampsBlockT;

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
 * CollateralAssignment can be found in Volume 5 of the
 * 						specification
 * 
 * <p>Java class for CollateralAssignment_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralAssignment_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CollateralAssignmentElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CollateralAssignmentAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAssignment_message_t", propOrder = {
    "pty",
    "collExc",
    "trdColl",
    "instrmt",
    "finDetls",
    "leg",
    "undColl",
    "trdRegTS",
    "miscFees",
    "sprdBnchmkCurve",
    "stip",
    "setInstr"
})
public class CollateralAssignmentMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "CollExc")
    protected List<ExecCollGrpBlockT> collExc;
    @XmlElement(name = "TrdColl")
    protected List<TrdCollGrpBlockT> trdColl;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "UndColl")
    protected List<UndInstrmtCollGrpBlockT> undColl;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
    @XmlElement(name = "MiscFees")
    protected List<MiscFeesGrpBlockT> miscFees;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "SetInstr")
    protected SettlInstructionsDataBlockT setInstr;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "AsgnRsn", required = true)
    protected BigInteger asgnRsn;
    @XmlAttribute(name = "TransTyp", required = true)
    protected BigInteger transTyp;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "TxnTm", required = true)
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "MgnExcess")
    protected BigDecimal mgnExcess;
    @XmlAttribute(name = "TotNetValu")
    protected BigDecimal totNetValu;
    @XmlAttribute(name = "CshOutstanding")
    protected BigDecimal cshOutstanding;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "AcrdIntAmt")
    protected BigDecimal acrdIntAmt;
    @XmlAttribute(name = "EndAcrdIntAmt")
    protected BigDecimal endAcrdIntAmt;
    @XmlAttribute(name = "StartCsh")
    protected BigDecimal startCsh;
    @XmlAttribute(name = "EndCsh")
    protected BigDecimal endCsh;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "SetSesSub")
    protected String setSesSub;
    @XmlAttribute(name = "WreRef")
    protected String wreRef;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "TxnID")
    protected String txnID;
    @XmlAttribute(name = "FirmTxnID")
    protected String firmTxnID;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "CollReqLinkID")
    protected String collReqLinkID;
    @XmlAttribute(name = "TotNumCollReqs")
    protected BigInteger totNumCollReqs;
    @XmlAttribute(name = "CollReqNum")
    protected BigInteger collReqNum;
    @XmlAttribute(name = "CollReqInst")
    protected String collReqInst;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected byte[] encTxt;

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
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the collExc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collExc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollExc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecCollGrpBlockT }
     * 
     * 
     */
    public List<ExecCollGrpBlockT> getCollExc() {
        if (collExc == null) {
            collExc = new ArrayList<ExecCollGrpBlockT>();
        }
        return this.collExc;
    }

    /**
     * Gets the value of the trdColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdCollGrpBlockT }
     * 
     * 
     */
    public List<TrdCollGrpBlockT> getTrdColl() {
        if (trdColl == null) {
            trdColl = new ArrayList<TrdCollGrpBlockT>();
        }
        return this.trdColl;
    }

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the undColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtCollGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtCollGrpBlockT> getUndColl() {
        if (undColl == null) {
            undColl = new ArrayList<UndInstrmtCollGrpBlockT>();
        }
        return this.undColl;
    }

    /**
     * Gets the value of the trdRegTS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdRegTS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdRegTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdRegTimestampsBlockT }
     * 
     * 
     */
    public List<TrdRegTimestampsBlockT> getTrdRegTS() {
        if (trdRegTS == null) {
            trdRegTS = new ArrayList<TrdRegTimestampsBlockT>();
        }
        return this.trdRegTS;
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
     * Gets the value of the sprdBnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public SpreadOrBenchmarkCurveDataBlockT getSprdBnchmkCurve() {
        return sprdBnchmkCurve;
    }

    /**
     * Sets the value of the sprdBnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public void setSprdBnchmkCurve(SpreadOrBenchmarkCurveDataBlockT value) {
        this.sprdBnchmkCurve = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StipulationsBlockT }
     * 
     * 
     */
    public List<StipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<StipulationsBlockT>();
        }
        return this.stip;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the asgnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsgnRsn() {
        return asgnRsn;
    }

    /**
     * Sets the value of the asgnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsgnRsn(BigInteger value) {
        this.asgnRsn = value;
    }

    /**
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransTyp(BigInteger value) {
        this.transTyp = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
    }

    /**
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
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
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
    }

    /**
     * Gets the value of the clOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID() {
        return clOrdID;
    }

    /**
     * Sets the value of the clOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID(String value) {
        this.clOrdID = value;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
    }

    /**
     * Gets the value of the ordID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID2() {
        return ordID2;
    }

    /**
     * Sets the value of the ordID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID2(String value) {
        this.ordID2 = value;
    }

    /**
     * Gets the value of the clOrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID2() {
        return clOrdID2;
    }

    /**
     * Sets the value of the clOrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID2(String value) {
        this.clOrdID2 = value;
    }

    /**
     * Gets the value of the settlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt() {
        return settlDt;
    }

    /**
     * Sets the value of the settlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt(XMLGregorianCalendar value) {
        this.settlDt = value;
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
     * Gets the value of the qtyTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyTyp() {
        return qtyTyp;
    }

    /**
     * Sets the value of the qtyTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyTyp(BigInteger value) {
        this.qtyTyp = value;
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
     * Gets the value of the mgnExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMgnExcess() {
        return mgnExcess;
    }

    /**
     * Sets the value of the mgnExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMgnExcess(BigDecimal value) {
        this.mgnExcess = value;
    }

    /**
     * Gets the value of the totNetValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotNetValu() {
        return totNetValu;
    }

    /**
     * Sets the value of the totNetValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotNetValu(BigDecimal value) {
        this.totNetValu = value;
    }

    /**
     * Gets the value of the cshOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshOutstanding() {
        return cshOutstanding;
    }

    /**
     * Sets the value of the cshOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshOutstanding(BigDecimal value) {
        this.cshOutstanding = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
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
     * Gets the value of the endAcrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndAcrdIntAmt() {
        return endAcrdIntAmt;
    }

    /**
     * Sets the value of the endAcrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndAcrdIntAmt(BigDecimal value) {
        this.endAcrdIntAmt = value;
    }

    /**
     * Gets the value of the startCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartCsh() {
        return startCsh;
    }

    /**
     * Sets the value of the startCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartCsh(BigDecimal value) {
        this.startCsh = value;
    }

    /**
     * Gets the value of the endCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndCsh() {
        return endCsh;
    }

    /**
     * Sets the value of the endCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndCsh(BigDecimal value) {
        this.endCsh = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    /**
     * Gets the value of the setSesID property.
     * 
     * @return
     *     possible object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public SettlSessIDEnumT getSetSesID() {
        return setSesID;
    }

    /**
     * Sets the value of the setSesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public void setSetSesID(SettlSessIDEnumT value) {
        this.setSesID = value;
    }

    /**
     * Gets the value of the setSesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSesSub() {
        return setSesSub;
    }

    /**
     * Sets the value of the setSesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSesSub(String value) {
        this.setSesSub = value;
    }

    /**
     * Gets the value of the wreRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWreRef() {
        return wreRef;
    }

    /**
     * Sets the value of the wreRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWreRef(String value) {
        this.wreRef = value;
    }

    /**
     * Gets the value of the trdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrdDt() {
        return trdDt;
    }

    /**
     * Sets the value of the trdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrdDt(XMLGregorianCalendar value) {
        this.trdDt = value;
    }

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnID(String value) {
        this.txnID = value;
    }

    /**
     * Gets the value of the firmTxnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmTxnID() {
        return firmTxnID;
    }

    /**
     * Sets the value of the firmTxnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmTxnID(String value) {
        this.firmTxnID = value;
    }

    /**
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the collReqLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollReqLinkID() {
        return collReqLinkID;
    }

    /**
     * Sets the value of the collReqLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollReqLinkID(String value) {
        this.collReqLinkID = value;
    }

    /**
     * Gets the value of the totNumCollReqs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumCollReqs() {
        return totNumCollReqs;
    }

    /**
     * Sets the value of the totNumCollReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumCollReqs(BigInteger value) {
        this.totNumCollReqs = value;
    }

    /**
     * Gets the value of the collReqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollReqNum() {
        return collReqNum;
    }

    /**
     * Sets the value of the collReqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollReqNum(BigInteger value) {
        this.collReqNum = value;
    }

    /**
     * Gets the value of the collReqInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollReqInst() {
        return collReqInst;
    }

    /**
     * Sets the value of the collReqInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollReqInst(String value) {
        this.collReqInst = value;
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

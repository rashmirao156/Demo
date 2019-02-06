//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import com.deloitte.sampleintegration.Demo.transformation.fixml.*;

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
 * <p>Java class for TrdInstrmtLegGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdInstrmtLegGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdInstrmtLegGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdInstrmtLegGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdInstrmtLegGrp_Block_t", propOrder = {
    "leg",
    "finDetls",
    "amt",
    "stip",
    "pty",
    "tradeCapLegUndlyGrp"
})
public class TrdInstrmtLegGrpBlockT {

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "FinDetls")
    protected LegFinancingDetailsBlockT finDetls;
    @XmlElement(name = "Amt")
    protected List<LegPositionAmountDataBlockT> amt;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlElement(name = "TradeCapLegUndlyGrp")
    protected List<TradeCapLegUnderlyingsGrpBlockT> tradeCapLegUndlyGrp;
    @XmlAttribute(name = "OrdQty")
    protected BigDecimal ordQty;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "MidPx")
    protected BigDecimal midPx;
    @XmlAttribute(name = "SwapTyp")
    protected BigInteger swapTyp;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "LegNo")
    protected BigInteger legNo;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ClrAcctTyp")
    protected BigInteger clrAcctTyp;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Cover")
    protected BigInteger cover;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "LegLastFwdPnts")
    protected BigDecimal legLastFwdPnts;
    @XmlAttribute(name = "LegCalcCcyLastQty")
    protected BigDecimal legCalcCcyLastQty;
    @XmlAttribute(name = "LegGrossTrdAmt")
    protected BigDecimal legGrossTrdAmt;
    @XmlAttribute(name = "ShrtSaleExmptnRsn")
    protected BigInteger shrtSaleExmptnRsn;
    @XmlAttribute(name = "LegVolatility")
    protected BigDecimal legVolatility;
    @XmlAttribute(name = "LegDividendYield")
    protected BigDecimal legDividendYield;
    @XmlAttribute(name = "LegCurrencyRatio")
    protected BigDecimal legCurrencyRatio;
    @XmlAttribute(name = "LegExecInst")
    protected String legExecInst;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "LastMultdQty")
    protected BigDecimal lastMultdQty;
    @XmlAttribute(name = "TotTrdQty")
    protected BigDecimal totTrdQty;
    @XmlAttribute(name = "TotTrdMultdQty")
    protected BigDecimal totTrdMultdQty;
    @XmlAttribute(name = "TotGrossTrdAmt")
    protected BigDecimal totGrossTrdAmt;
    @XmlAttribute(name = "DiffPx")
    protected BigDecimal diffPx;

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public InstrumentLegBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public void setLeg(InstrumentLegBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link LegFinancingDetailsBlockT }
     *     
     */
    public LegFinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegFinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(LegFinancingDetailsBlockT value) {
        this.finDetls = value;
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
     * {@link LegPositionAmountDataBlockT }
     * 
     * 
     */
    public List<LegPositionAmountDataBlockT> getAmt() {
        if (amt == null) {
            amt = new ArrayList<LegPositionAmountDataBlockT>();
        }
        return this.amt;
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
     * {@link LegStipulationsBlockT }
     * 
     * 
     */
    public List<LegStipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<LegStipulationsBlockT>();
        }
        return this.stip;
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
     * Gets the value of the tradeCapLegUndlyGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeCapLegUndlyGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeCapLegUndlyGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCapLegUnderlyingsGrpBlockT }
     * 
     * 
     */
    public List<TradeCapLegUnderlyingsGrpBlockT> getTradeCapLegUndlyGrp() {
        if (tradeCapLegUndlyGrp == null) {
            tradeCapLegUndlyGrp = new ArrayList<TradeCapLegUnderlyingsGrpBlockT>();
        }
        return this.tradeCapLegUndlyGrp;
    }

    /**
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdQty(BigDecimal value) {
        this.ordQty = value;
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
     * Gets the value of the midPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidPx() {
        return midPx;
    }

    /**
     * Sets the value of the midPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidPx(BigDecimal value) {
        this.midPx = value;
    }

    /**
     * Gets the value of the swapTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwapTyp() {
        return swapTyp;
    }

    /**
     * Sets the value of the swapTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwapTyp(BigInteger value) {
        this.swapTyp = value;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID(String value) {
        this.rptID = value;
    }

    /**
     * Gets the value of the legNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegNo() {
        return legNo;
    }

    /**
     * Sets the value of the legNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegNo(BigInteger value) {
        this.legNo = value;
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
     * Gets the value of the clrAcctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClrAcctTyp() {
        return clrAcctTyp;
    }

    /**
     * Sets the value of the clrAcctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClrAcctTyp(BigInteger value) {
        this.clrAcctTyp = value;
    }

    /**
     * Gets the value of the posEfct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public PositionEffectEnumT getPosEfct() {
        return posEfct;
    }

    /**
     * Sets the value of the posEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public void setPosEfct(PositionEffectEnumT value) {
        this.posEfct = value;
    }

    /**
     * Gets the value of the cover property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCover() {
        return cover;
    }

    /**
     * Sets the value of the cover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCover(BigInteger value) {
        this.cover = value;
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
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
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
     * Gets the value of the lastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPx() {
        return lastPx;
    }

    /**
     * Sets the value of the lastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPx(BigDecimal value) {
        this.lastPx = value;
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
     * Gets the value of the legLastFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegLastFwdPnts() {
        return legLastFwdPnts;
    }

    /**
     * Sets the value of the legLastFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegLastFwdPnts(BigDecimal value) {
        this.legLastFwdPnts = value;
    }

    /**
     * Gets the value of the legCalcCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCalcCcyLastQty() {
        return legCalcCcyLastQty;
    }

    /**
     * Sets the value of the legCalcCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCalcCcyLastQty(BigDecimal value) {
        this.legCalcCcyLastQty = value;
    }

    /**
     * Gets the value of the legGrossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegGrossTrdAmt() {
        return legGrossTrdAmt;
    }

    /**
     * Sets the value of the legGrossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegGrossTrdAmt(BigDecimal value) {
        this.legGrossTrdAmt = value;
    }

    /**
     * Gets the value of the shrtSaleExmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShrtSaleExmptnRsn() {
        return shrtSaleExmptnRsn;
    }

    /**
     * Sets the value of the shrtSaleExmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShrtSaleExmptnRsn(BigInteger value) {
        this.shrtSaleExmptnRsn = value;
    }

    /**
     * Gets the value of the legVolatility property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegVolatility() {
        return legVolatility;
    }

    /**
     * Sets the value of the legVolatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegVolatility(BigDecimal value) {
        this.legVolatility = value;
    }

    /**
     * Gets the value of the legDividendYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegDividendYield() {
        return legDividendYield;
    }

    /**
     * Sets the value of the legDividendYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegDividendYield(BigDecimal value) {
        this.legDividendYield = value;
    }

    /**
     * Gets the value of the legCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCurrencyRatio() {
        return legCurrencyRatio;
    }

    /**
     * Sets the value of the legCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCurrencyRatio(BigDecimal value) {
        this.legCurrencyRatio = value;
    }

    /**
     * Gets the value of the legExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExecInst() {
        return legExecInst;
    }

    /**
     * Sets the value of the legExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegExecInst(String value) {
        this.legExecInst = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastQty(BigDecimal value) {
        this.lastQty = value;
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
     * Gets the value of the lastMultdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastMultdQty() {
        return lastMultdQty;
    }

    /**
     * Sets the value of the lastMultdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastMultdQty(BigDecimal value) {
        this.lastMultdQty = value;
    }

    /**
     * Gets the value of the totTrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotTrdQty() {
        return totTrdQty;
    }

    /**
     * Sets the value of the totTrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotTrdQty(BigDecimal value) {
        this.totTrdQty = value;
    }

    /**
     * Gets the value of the totTrdMultdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotTrdMultdQty() {
        return totTrdMultdQty;
    }

    /**
     * Sets the value of the totTrdMultdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotTrdMultdQty(BigDecimal value) {
        this.totTrdMultdQty = value;
    }

    /**
     * Gets the value of the totGrossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotGrossTrdAmt() {
        return totGrossTrdAmt;
    }

    /**
     * Sets the value of the totGrossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotGrossTrdAmt(BigDecimal value) {
        this.totGrossTrdAmt = value;
    }

    /**
     * Gets the value of the diffPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiffPx() {
        return diffPx;
    }

    /**
     * Sets the value of the diffPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiffPx(BigDecimal value) {
        this.diffPx = value;
    }

}

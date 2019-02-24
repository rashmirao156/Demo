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
 * <p>Java class for TrdInstrmtLegExecGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdInstrmtLegExecGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdInstrmtLegExecGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdInstrmtLegExecGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdInstrmtLegExecGrp_Block_t", propOrder = {
    "pty"
})
public class TrdInstrmtLegExecGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedParties3BlockT> pty;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecRefID")
    protected String execRefID;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "OrdQty")
    protected BigDecimal ordQty;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Cover")
    protected BigInteger cover;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "ShrtSaleExmptnRsn")
    protected BigInteger shrtSaleExmptnRsn;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;

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
     * {@link NestedParties3BlockT }
     * 
     * 
     */
    public List<NestedParties3BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties3BlockT>();
        }
        return this.pty;
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
     * Gets the value of the execID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID() {
        return execID;
    }

    /**
     * Sets the value of the execID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID(String value) {
        this.execID = value;
    }

    /**
     * Gets the value of the execRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecRefID() {
        return execRefID;
    }

    /**
     * Sets the value of the execRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecRefID(String value) {
        this.execRefID = value;
    }

    /**
     * Gets the value of the trdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdID() {
        return trdID;
    }

    /**
     * Sets the value of the trdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdID(String value) {
        this.trdID = value;
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

}
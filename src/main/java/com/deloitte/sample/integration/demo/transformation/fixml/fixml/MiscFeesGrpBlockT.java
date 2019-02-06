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


/**
 * <p>Java class for MiscFeesGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscFeesGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MiscFeesGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MiscFeesGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscFeesGrp_Block_t", propOrder = {
    "miscFeesSub"
})
public class MiscFeesGrpBlockT {

    @XmlElement(name = "MiscFeesSub")
    protected List<MiscFeesSubGrpBlockT> miscFeesSub;
    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    @XmlAttribute(name = "Curr")
    protected String curr;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "Qual")
    protected BigInteger qual;
    @XmlAttribute(name = "Basis")
    protected BigInteger basis;
    @XmlAttribute(name = "Rt")
    protected BigDecimal rt;
    @XmlAttribute(name = "AmtDue")
    protected BigDecimal amtDue;
    @XmlAttribute(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the miscFeesSub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscFeesSub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscFeesSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscFeesSubGrpBlockT }
     * 
     * 
     */
    public List<MiscFeesSubGrpBlockT> getMiscFeesSub() {
        if (miscFeesSub == null) {
            miscFeesSub = new ArrayList<MiscFeesSubGrpBlockT>();
        }
        return this.miscFeesSub;
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
     * Gets the value of the curr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurr() {
        return curr;
    }

    /**
     * Sets the value of the curr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurr(String value) {
        this.curr = value;
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
     * Gets the value of the qual property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQual() {
        return qual;
    }

    /**
     * Sets the value of the qual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQual(BigInteger value) {
        this.qual = value;
    }

    /**
     * Gets the value of the basis property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBasis(BigInteger value) {
        this.basis = value;
    }

    /**
     * Gets the value of the rt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRt() {
        return rt;
    }

    /**
     * Sets the value of the rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRt(BigDecimal value) {
        this.rt = value;
    }

    /**
     * Gets the value of the amtDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtDue() {
        return amtDue;
    }

    /**
     * Sets the value of the amtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtDue(BigDecimal value) {
        this.amtDue = value;
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

}

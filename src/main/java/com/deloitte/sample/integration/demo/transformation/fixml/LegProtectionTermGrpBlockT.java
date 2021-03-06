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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LegProtectionTermGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegProtectionTermGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegProtectionTermGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegProtectionTermGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegProtectionTermGrp_Block_t", propOrder = {
    "newsSrc",
    "evnt",
    "oblig"
})
public class LegProtectionTermGrpBlockT {

    @XmlElement(name = "NewsSrc")
    protected List<LegProtectionTermEventNewsSourceGrpBlockT> newsSrc;
    @XmlElement(name = "Evnt")
    protected List<LegProtectionTermEventGrpBlockT> evnt;
    @XmlElement(name = "Oblig")
    protected List<LegProtectionTermObligationGrpBlockT> oblig;
    @XmlAttribute(name = "Notl")
    protected BigDecimal notl;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Seller")
    protected String seller;
    @XmlAttribute(name = "Buyer")
    protected String buyer;
    @XmlAttribute(name = "BizCtr")
    protected String bizCtr;
    @XmlAttribute(name = "StdSrcs")
    protected String stdSrcs;
    @XmlAttribute(name = "MinSrcs")
    protected BigInteger minSrcs;
    @XmlAttribute(name = "XID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String xid;

    /**
     * Gets the value of the newsSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegProtectionTermEventNewsSourceGrpBlockT }
     * 
     * 
     */
    public List<LegProtectionTermEventNewsSourceGrpBlockT> getNewsSrc() {
        if (newsSrc == null) {
            newsSrc = new ArrayList<LegProtectionTermEventNewsSourceGrpBlockT>();
        }
        return this.newsSrc;
    }

    /**
     * Gets the value of the evnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegProtectionTermEventGrpBlockT }
     * 
     * 
     */
    public List<LegProtectionTermEventGrpBlockT> getEvnt() {
        if (evnt == null) {
            evnt = new ArrayList<LegProtectionTermEventGrpBlockT>();
        }
        return this.evnt;
    }

    /**
     * Gets the value of the oblig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oblig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOblig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegProtectionTermObligationGrpBlockT }
     * 
     * 
     */
    public List<LegProtectionTermObligationGrpBlockT> getOblig() {
        if (oblig == null) {
            oblig = new ArrayList<LegProtectionTermObligationGrpBlockT>();
        }
        return this.oblig;
    }

    /**
     * Gets the value of the notl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNotl() {
        return notl;
    }

    /**
     * Sets the value of the notl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNotl(BigDecimal value) {
        this.notl = value;
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
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeller(String value) {
        this.seller = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyer(String value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the bizCtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizCtr() {
        return bizCtr;
    }

    /**
     * Sets the value of the bizCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizCtr(String value) {
        this.bizCtr = value;
    }

    /**
     * Gets the value of the stdSrcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSrcs() {
        return stdSrcs;
    }

    /**
     * Sets the value of the stdSrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdSrcs(String value) {
        this.stdSrcs = value;
    }

    /**
     * Gets the value of the minSrcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinSrcs() {
        return minSrcs;
    }

    /**
     * Sets the value of the minSrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinSrcs(BigInteger value) {
        this.minSrcs = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXID(String value) {
        this.xid = value;
    }

}

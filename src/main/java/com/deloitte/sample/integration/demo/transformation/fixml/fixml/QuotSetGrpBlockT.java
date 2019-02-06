//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import com.deloitte.sample.integration.demo.transformation.fixml.UnderlyingInstrumentBlockT;

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
 * <p>Java class for QuotSetGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotSetGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotSetGrp_Block_t", propOrder = {
    "undly",
    "quotEntry"
})
public class QuotSetGrpBlockT {

    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "QuotEntry", required = true)
    protected List<QuotEntryGrpBlockT> quotEntry;
    @XmlAttribute(name = "SetID", required = true)
    protected String setID;
    @XmlAttribute(name = "ValidTil")
    protected XMLGregorianCalendar validTil;
    @XmlAttribute(name = "TotNoQuotEntries", required = true)
    protected BigInteger totNoQuotEntries;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

    /**
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public UnderlyingInstrumentBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public void setUndly(UnderlyingInstrumentBlockT value) {
        this.undly = value;
    }

    /**
     * Gets the value of the quotEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotEntryGrpBlockT }
     * 
     * 
     */
    public List<QuotEntryGrpBlockT> getQuotEntry() {
        if (quotEntry == null) {
            quotEntry = new ArrayList<QuotEntryGrpBlockT>();
        }
        return this.quotEntry;
    }

    /**
     * Gets the value of the setID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetID() {
        return setID;
    }

    /**
     * Sets the value of the setID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetID(String value) {
        this.setID = value;
    }

    /**
     * Gets the value of the validTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTil() {
        return validTil;
    }

    /**
     * Sets the value of the validTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTil(XMLGregorianCalendar value) {
        this.validTil = value;
    }

    /**
     * Gets the value of the totNoQuotEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoQuotEntries() {
        return totNoQuotEntries;
    }

    /**
     * Sets the value of the totNoQuotEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoQuotEntries(BigInteger value) {
        this.totNoQuotEntries = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

}

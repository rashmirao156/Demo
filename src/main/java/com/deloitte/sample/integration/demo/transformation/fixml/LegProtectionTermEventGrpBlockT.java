//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegProtectionTermEventGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegProtectionTermEventGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegProtectionTermEventGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegProtectionTermEventGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegProtectionTermEventGrp_Block_t", propOrder = {
    "qual"
})
public class LegProtectionTermEventGrpBlockT {

    @XmlElement(name = "Qual")
    protected List<LegProtectionTermEventQualifierGrpBlockT> qual;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "Val")
    protected String val;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Period")
    protected BigInteger period;
    @XmlAttribute(name = "Unit")
    protected ProtectionTermEventUnitEnumT unit;
    @XmlAttribute(name = "DayTyp")
    protected BigInteger dayTyp;
    @XmlAttribute(name = "RtSrc")
    protected String rtSrc;

    /**
     * Gets the value of the qual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegProtectionTermEventQualifierGrpBlockT }
     * 
     * 
     */
    public List<LegProtectionTermEventQualifierGrpBlockT> getQual() {
        if (qual == null) {
            qual = new ArrayList<LegProtectionTermEventQualifierGrpBlockT>();
        }
        return this.qual;
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
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriod(BigInteger value) {
        this.period = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionTermEventUnitEnumT }
     *     
     */
    public ProtectionTermEventUnitEnumT getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionTermEventUnitEnumT }
     *     
     */
    public void setUnit(ProtectionTermEventUnitEnumT value) {
        this.unit = value;
    }

    /**
     * Gets the value of the dayTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayTyp() {
        return dayTyp;
    }

    /**
     * Sets the value of the dayTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayTyp(BigInteger value) {
        this.dayTyp = value;
    }

    /**
     * Gets the value of the rtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtSrc() {
        return rtSrc;
    }

    /**
     * Sets the value of the rtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtSrc(String value) {
        this.rtSrc = value;
    }

}

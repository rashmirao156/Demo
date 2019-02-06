//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegDeliveryScheduleSettlDayGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegDeliveryScheduleSettlDayGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegDeliveryScheduleSettlDayGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegDeliveryScheduleSettlDayGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegDeliveryScheduleSettlDayGrp_Block_t", propOrder = {
    "tm"
})
public class LegDeliveryScheduleSettlDayGrpBlockT {

    @XmlElement(name = "Tm")
    protected List<LegDeliveryScheduleSettlTimeGrpBlockT> tm;
    @XmlAttribute(name = "Day")
    protected BigInteger day;
    @XmlAttribute(name = "TotHrs")
    protected BigInteger totHrs;

    /**
     * Gets the value of the tm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegDeliveryScheduleSettlTimeGrpBlockT }
     * 
     * 
     */
    public List<LegDeliveryScheduleSettlTimeGrpBlockT> getTm() {
        if (tm == null) {
            tm = new ArrayList<LegDeliveryScheduleSettlTimeGrpBlockT>();
        }
        return this.tm;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDay(BigInteger value) {
        this.day = value;
    }

    /**
     * Gets the value of the totHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotHrs() {
        return totHrs;
    }

    /**
     * Sets the value of the totHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotHrs(BigInteger value) {
        this.totHrs = value;
    }

}

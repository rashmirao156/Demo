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
 * <p>Java class for PartyEntitlementGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyEntitlementGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyEntitlementGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyEntitlementGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyEntitlementGrp_Block_t", propOrder = {
    "ptyDetl",
    "entlmnt"
})
public class PartyEntitlementGrpBlockT {

    @XmlElement(name = "PtyDetl")
    protected List<PartyDetailGrpBlockT> ptyDetl;
    @XmlElement(name = "Entlmnt")
    protected List<EntitlementGrpBlockT> entlmnt;
    @XmlAttribute(name = "Stat")
    protected BigInteger stat;

    /**
     * Gets the value of the ptyDetl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptyDetl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyDetl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDetailGrpBlockT }
     * 
     * 
     */
    public List<PartyDetailGrpBlockT> getPtyDetl() {
        if (ptyDetl == null) {
            ptyDetl = new ArrayList<PartyDetailGrpBlockT>();
        }
        return this.ptyDetl;
    }

    /**
     * Gets the value of the entlmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entlmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntlmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementGrpBlockT }
     * 
     * 
     */
    public List<EntitlementGrpBlockT> getEntlmnt() {
        if (entlmnt == null) {
            entlmnt = new ArrayList<EntitlementGrpBlockT>();
        }
        return this.entlmnt;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStat(BigInteger value) {
        this.stat = value;
    }

}

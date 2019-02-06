//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegAdditionalTermGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegAdditionalTermGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegAdditionalTermGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegAdditionalTermGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAdditionalTermGrp_Block_t", propOrder = {
    "bondRef"
})
public class LegAdditionalTermGrpBlockT {

    @XmlElement(name = "BondRef")
    protected List<LegAdditionalTermBondRefGrpBlockT> bondRef;
    @XmlAttribute(name = "PrcdntInd")
    protected String prcdntInd;
    @XmlAttribute(name = "DscrpncyInd")
    protected String dscrpncyInd;

    /**
     * Gets the value of the bondRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bondRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBondRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegAdditionalTermBondRefGrpBlockT }
     * 
     * 
     */
    public List<LegAdditionalTermBondRefGrpBlockT> getBondRef() {
        if (bondRef == null) {
            bondRef = new ArrayList<LegAdditionalTermBondRefGrpBlockT>();
        }
        return this.bondRef;
    }

    /**
     * Gets the value of the prcdntInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcdntInd() {
        return prcdntInd;
    }

    /**
     * Sets the value of the prcdntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcdntInd(String value) {
        this.prcdntInd = value;
    }

    /**
     * Gets the value of the dscrpncyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscrpncyInd() {
        return dscrpncyInd;
    }

    /**
     * Sets the value of the dscrpncyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscrpncyInd(String value) {
        this.dscrpncyInd = value;
    }

}

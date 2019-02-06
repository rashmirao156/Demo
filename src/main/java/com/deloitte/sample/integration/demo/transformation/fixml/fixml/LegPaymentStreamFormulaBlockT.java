//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegPaymentStreamFormula_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegPaymentStreamFormula_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamFormulaElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPaymentStreamFormulaAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegPaymentStreamFormula_Block_t", propOrder = {
    "math",
    "img"
})
public class LegPaymentStreamFormulaBlockT {

    @XmlElement(name = "Math")
    protected LegPaymentStreamFormulaMathGrpBlockT math;
    @XmlElement(name = "Img")
    protected LegPaymentStreamFormulaImageBlockT img;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "CcyDtrmnMeth")
    protected String ccyDtrmnMeth;
    @XmlAttribute(name = "RefAmt")
    protected BigInteger refAmt;

    /**
     * Gets the value of the math property.
     * 
     * @return
     *     possible object is
     *     {@link LegPaymentStreamFormulaMathGrpBlockT }
     *     
     */
    public LegPaymentStreamFormulaMathGrpBlockT getMath() {
        return math;
    }

    /**
     * Sets the value of the math property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPaymentStreamFormulaMathGrpBlockT }
     *     
     */
    public void setMath(LegPaymentStreamFormulaMathGrpBlockT value) {
        this.math = value;
    }

    /**
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     {@link LegPaymentStreamFormulaImageBlockT }
     *     
     */
    public LegPaymentStreamFormulaImageBlockT getImg() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegPaymentStreamFormulaImageBlockT }
     *     
     */
    public void setImg(LegPaymentStreamFormulaImageBlockT value) {
        this.img = value;
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
     * Gets the value of the ccyDtrmnMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyDtrmnMeth() {
        return ccyDtrmnMeth;
    }

    /**
     * Sets the value of the ccyDtrmnMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyDtrmnMeth(String value) {
        this.ccyDtrmnMeth = value;
    }

    /**
     * Gets the value of the refAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefAmt() {
        return refAmt;
    }

    /**
     * Sets the value of the refAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefAmt(BigInteger value) {
        this.refAmt = value;
    }

}

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
 * SecurityTypes can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityTypes_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityTypes_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityTypesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityTypesAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityTypes_message_t", propOrder = {
    "applSeqCtrl",
    "secT"
})
public class SecurityTypesMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "SecT")
    protected List<SecTypesGrpBlockT> secT;
    @XmlAttribute(name = "ReqID", required = true)
    protected String reqID;
    @XmlAttribute(name = "RspID", required = true)
    protected String rspID;
    @XmlAttribute(name = "RspTyp", required = true)
    protected BigInteger rspTyp;
    @XmlAttribute(name = "TotNoSecTyps")
    protected BigInteger totNoSecTyps;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected byte[] encTxt;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;

    /**
     * Gets the value of the applSeqCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public ApplicationSequenceControlBlockT getApplSeqCtrl() {
        return applSeqCtrl;
    }

    /**
     * Sets the value of the applSeqCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
        this.applSeqCtrl = value;
    }

    /**
     * Gets the value of the secT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecTypesGrpBlockT }
     * 
     * 
     */
    public List<SecTypesGrpBlockT> getSecT() {
        if (secT == null) {
            secT = new ArrayList<SecTypesGrpBlockT>();
        }
        return this.secT;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the rspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspID() {
        return rspID;
    }

    /**
     * Sets the value of the rspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspID(String value) {
        this.rspID = value;
    }

    /**
     * Gets the value of the rspTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspTyp() {
        return rspTyp;
    }

    /**
     * Sets the value of the rspTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspTyp(BigInteger value) {
        this.rspTyp = value;
    }

    /**
     * Gets the value of the totNoSecTyps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoSecTyps() {
        return totNoSecTyps;
    }

    /**
     * Sets the value of the totNoSecTyps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoSecTyps(BigInteger value) {
        this.totNoSecTyps = value;
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

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncTxt(byte[] value) {
        this.encTxt = value;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    /**
     * Gets the value of the subReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReqTyp() {
        return subReqTyp;
    }

    /**
     * Sets the value of the subReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReqTyp(String value) {
        this.subReqTyp = value;
    }

}
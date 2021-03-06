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
 * QuoteAck can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for QuoteAck_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteAck_message_t", propOrder = {
    "pty",
    "qteAttrib"
})
public class QuoteAckMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "QteAttrib")
    protected List<QuoteAttributeGrpBlockT> qteAttrib;
    @XmlAttribute(name = "QID")
    protected String qid;
    @XmlAttribute(name = "QtMsgID")
    protected String qtMsgID;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "CxlTyp")
    protected String cxlTyp;
    @XmlAttribute(name = "QID2")
    protected String qid2;
    @XmlAttribute(name = "QtAckStat", required = true)
    protected BigInteger qtAckStat;
    @XmlAttribute(name = "RejRsn")
    protected String rejRsn;
    @XmlAttribute(name = "RejTxt")
    protected String rejTxt;
    @XmlAttribute(name = "EncRejTxtLen")
    protected BigInteger encRejTxtLen;
    @XmlAttribute(name = "EncRejTxt")
    protected byte[] encRejTxt;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected byte[] encTxt;

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
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the qteAttrib property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qteAttrib property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQteAttrib().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteAttributeGrpBlockT }
     * 
     * 
     */
    public List<QuoteAttributeGrpBlockT> getQteAttrib() {
        if (qteAttrib == null) {
            qteAttrib = new ArrayList<QuoteAttributeGrpBlockT>();
        }
        return this.qteAttrib;
    }

    /**
     * Gets the value of the qid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQID() {
        return qid;
    }

    /**
     * Sets the value of the qid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQID(String value) {
        this.qid = value;
    }

    /**
     * Gets the value of the qtMsgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtMsgID() {
        return qtMsgID;
    }

    /**
     * Sets the value of the qtMsgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtMsgID(String value) {
        this.qtMsgID = value;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the cxlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlTyp() {
        return cxlTyp;
    }

    /**
     * Sets the value of the cxlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlTyp(String value) {
        this.cxlTyp = value;
    }

    /**
     * Gets the value of the qid2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQID2() {
        return qid2;
    }

    /**
     * Sets the value of the qid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQID2(String value) {
        this.qid2 = value;
    }

    /**
     * Gets the value of the qtAckStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtAckStat() {
        return qtAckStat;
    }

    /**
     * Sets the value of the qtAckStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtAckStat(BigInteger value) {
        this.qtAckStat = value;
    }

    /**
     * Gets the value of the rejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejRsn() {
        return rejRsn;
    }

    /**
     * Sets the value of the rejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejRsn(String value) {
        this.rejRsn = value;
    }

    /**
     * Gets the value of the rejTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejTxt() {
        return rejTxt;
    }

    /**
     * Sets the value of the rejTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejTxt(String value) {
        this.rejTxt = value;
    }

    /**
     * Gets the value of the encRejTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncRejTxtLen() {
        return encRejTxtLen;
    }

    /**
     * Sets the value of the encRejTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncRejTxtLen(BigInteger value) {
        this.encRejTxtLen = value;
    }

    /**
     * Gets the value of the encRejTxt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncRejTxt() {
        return encRejTxt;
    }

    /**
     * Sets the value of the encRejTxt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncRejTxt(byte[] value) {
        this.encRejTxt = value;
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

}

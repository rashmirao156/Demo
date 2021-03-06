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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LegFinancingDetails_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegFinancingDetails_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegFinancingDetailsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegFinancingDetailsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegFinancingDetails_Block_t", propOrder = {
    "ctrctlDef",
    "trmSupplmnt",
    "ctrctlMtrx"
})
public class LegFinancingDetailsBlockT {

    @XmlElement(name = "CtrctlDef")
    protected List<LegFinancingContractualDefinitionsGrpBlockT> ctrctlDef;
    @XmlElement(name = "TrmSupplmnt")
    protected List<LegFinancingTermSupplementGrpBlockT> trmSupplmnt;
    @XmlElement(name = "CtrctlMtrx")
    protected List<LegFinancingContractualMatrixGrpBlockT> ctrctlMtrx;
    @XmlAttribute(name = "AgmtDesc")
    protected String agmtDesc;
    @XmlAttribute(name = "AgmtID")
    protected String agmtID;
    @XmlAttribute(name = "AgmtVer")
    protected String agmtVer;
    @XmlAttribute(name = "AgmtDt")
    protected XMLGregorianCalendar agmtDt;
    @XmlAttribute(name = "AgmtCcy")
    protected String agmtCcy;
    @XmlAttribute(name = "CnfmDesc")
    protected String cnfmDesc;
    @XmlAttribute(name = "CnfmDt")
    protected XMLGregorianCalendar cnfmDt;
    @XmlAttribute(name = "CnfmAnxDesc")
    protected String cnfmAnxDesc;
    @XmlAttribute(name = "CnfmAnxDt")
    protected XMLGregorianCalendar cnfmAnxDt;
    @XmlAttribute(name = "BrkrCnfmDesc")
    protected String brkrCnfmDesc;
    @XmlAttribute(name = "CrdSuprtDesc")
    protected String crdSuprtDesc;
    @XmlAttribute(name = "CrdSuprtDt")
    protected XMLGregorianCalendar crdSuprtDt;
    @XmlAttribute(name = "CrdSuprtID")
    protected String crdSuprtID;
    @XmlAttribute(name = "Law")
    protected String law;
    @XmlAttribute(name = "DcmntnTxt")
    protected String dcmntnTxt;
    @XmlAttribute(name = "EncDcmntnTxtLen")
    protected BigInteger encDcmntnTxtLen;
    @XmlAttribute(name = "EncDcmntnTxt")
    protected byte[] encDcmntnTxt;
    @XmlAttribute(name = "TrmTyp")
    protected BigInteger trmTyp;
    @XmlAttribute(name = "StartDt")
    protected XMLGregorianCalendar startDt;
    @XmlAttribute(name = "EndDt")
    protected XMLGregorianCalendar endDt;
    @XmlAttribute(name = "DlvryTyp")
    protected BigInteger dlvryTyp;
    @XmlAttribute(name = "MgnRatio")
    protected BigDecimal mgnRatio;

    /**
     * Gets the value of the ctrctlDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctlDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctlDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegFinancingContractualDefinitionsGrpBlockT }
     * 
     * 
     */
    public List<LegFinancingContractualDefinitionsGrpBlockT> getCtrctlDef() {
        if (ctrctlDef == null) {
            ctrctlDef = new ArrayList<LegFinancingContractualDefinitionsGrpBlockT>();
        }
        return this.ctrctlDef;
    }

    /**
     * Gets the value of the trmSupplmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trmSupplmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrmSupplmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegFinancingTermSupplementGrpBlockT }
     * 
     * 
     */
    public List<LegFinancingTermSupplementGrpBlockT> getTrmSupplmnt() {
        if (trmSupplmnt == null) {
            trmSupplmnt = new ArrayList<LegFinancingTermSupplementGrpBlockT>();
        }
        return this.trmSupplmnt;
    }

    /**
     * Gets the value of the ctrctlMtrx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctlMtrx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctlMtrx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegFinancingContractualMatrixGrpBlockT }
     * 
     * 
     */
    public List<LegFinancingContractualMatrixGrpBlockT> getCtrctlMtrx() {
        if (ctrctlMtrx == null) {
            ctrctlMtrx = new ArrayList<LegFinancingContractualMatrixGrpBlockT>();
        }
        return this.ctrctlMtrx;
    }

    /**
     * Gets the value of the agmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtDesc() {
        return agmtDesc;
    }

    /**
     * Sets the value of the agmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtDesc(String value) {
        this.agmtDesc = value;
    }

    /**
     * Gets the value of the agmtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtID() {
        return agmtID;
    }

    /**
     * Sets the value of the agmtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtID(String value) {
        this.agmtID = value;
    }

    /**
     * Gets the value of the agmtVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtVer() {
        return agmtVer;
    }

    /**
     * Sets the value of the agmtVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtVer(String value) {
        this.agmtVer = value;
    }

    /**
     * Gets the value of the agmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgmtDt() {
        return agmtDt;
    }

    /**
     * Sets the value of the agmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgmtDt(XMLGregorianCalendar value) {
        this.agmtDt = value;
    }

    /**
     * Gets the value of the agmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgmtCcy() {
        return agmtCcy;
    }

    /**
     * Sets the value of the agmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgmtCcy(String value) {
        this.agmtCcy = value;
    }

    /**
     * Gets the value of the cnfmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmDesc() {
        return cnfmDesc;
    }

    /**
     * Sets the value of the cnfmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmDesc(String value) {
        this.cnfmDesc = value;
    }

    /**
     * Gets the value of the cnfmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCnfmDt() {
        return cnfmDt;
    }

    /**
     * Sets the value of the cnfmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCnfmDt(XMLGregorianCalendar value) {
        this.cnfmDt = value;
    }

    /**
     * Gets the value of the cnfmAnxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmAnxDesc() {
        return cnfmAnxDesc;
    }

    /**
     * Sets the value of the cnfmAnxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmAnxDesc(String value) {
        this.cnfmAnxDesc = value;
    }

    /**
     * Gets the value of the cnfmAnxDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCnfmAnxDt() {
        return cnfmAnxDt;
    }

    /**
     * Sets the value of the cnfmAnxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCnfmAnxDt(XMLGregorianCalendar value) {
        this.cnfmAnxDt = value;
    }

    /**
     * Gets the value of the brkrCnfmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrkrCnfmDesc() {
        return brkrCnfmDesc;
    }

    /**
     * Sets the value of the brkrCnfmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrkrCnfmDesc(String value) {
        this.brkrCnfmDesc = value;
    }

    /**
     * Gets the value of the crdSuprtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdSuprtDesc() {
        return crdSuprtDesc;
    }

    /**
     * Sets the value of the crdSuprtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdSuprtDesc(String value) {
        this.crdSuprtDesc = value;
    }

    /**
     * Gets the value of the crdSuprtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrdSuprtDt() {
        return crdSuprtDt;
    }

    /**
     * Sets the value of the crdSuprtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrdSuprtDt(XMLGregorianCalendar value) {
        this.crdSuprtDt = value;
    }

    /**
     * Gets the value of the crdSuprtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdSuprtID() {
        return crdSuprtID;
    }

    /**
     * Sets the value of the crdSuprtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdSuprtID(String value) {
        this.crdSuprtID = value;
    }

    /**
     * Gets the value of the law property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaw() {
        return law;
    }

    /**
     * Sets the value of the law property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaw(String value) {
        this.law = value;
    }

    /**
     * Gets the value of the dcmntnTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcmntnTxt() {
        return dcmntnTxt;
    }

    /**
     * Sets the value of the dcmntnTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcmntnTxt(String value) {
        this.dcmntnTxt = value;
    }

    /**
     * Gets the value of the encDcmntnTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncDcmntnTxtLen() {
        return encDcmntnTxtLen;
    }

    /**
     * Sets the value of the encDcmntnTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncDcmntnTxtLen(BigInteger value) {
        this.encDcmntnTxtLen = value;
    }

    /**
     * Gets the value of the encDcmntnTxt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncDcmntnTxt() {
        return encDcmntnTxt;
    }

    /**
     * Sets the value of the encDcmntnTxt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncDcmntnTxt(byte[] value) {
        this.encDcmntnTxt = value;
    }

    /**
     * Gets the value of the trmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrmTyp() {
        return trmTyp;
    }

    /**
     * Sets the value of the trmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrmTyp(BigInteger value) {
        this.trmTyp = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the dlvryTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDlvryTyp() {
        return dlvryTyp;
    }

    /**
     * Sets the value of the dlvryTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDlvryTyp(BigInteger value) {
        this.dlvryTyp = value;
    }

    /**
     * Gets the value of the mgnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMgnRatio() {
        return mgnRatio;
    }

    /**
     * Sets the value of the mgnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMgnRatio(BigDecimal value) {
        this.mgnRatio = value;
    }

}

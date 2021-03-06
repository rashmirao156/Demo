//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegPaymentStreamFixedAmountUnitOfMeasure_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegPaymentStreamFixedAmountUnitOfMeasure_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bcf"/>
 *     &lt;enumeration value="Alw"/>
 *     &lt;enumeration value="Bbl"/>
 *     &lt;enumeration value="CBM"/>
 *     &lt;enumeration value="BDFT"/>
 *     &lt;enumeration value="GJ"/>
 *     &lt;enumeration value="Bu"/>
 *     &lt;enumeration value="kWh"/>
 *     &lt;enumeration value="MMBtu"/>
 *     &lt;enumeration value="Ccy"/>
 *     &lt;enumeration value="MWh"/>
 *     &lt;enumeration value="CDD"/>
 *     &lt;enumeration value="CER"/>
 *     &lt;enumeration value="thm"/>
 *     &lt;enumeration value="CPD"/>
 *     &lt;enumeration value="CRT"/>
 *     &lt;enumeration value="cwt"/>
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="dt"/>
 *     &lt;enumeration value="EnvAllwnc"/>
 *     &lt;enumeration value="EnvCrd"/>
 *     &lt;enumeration value="EnvOfst"/>
 *     &lt;enumeration value="g"/>
 *     &lt;enumeration value="Gal"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="HDD"/>
 *     &lt;enumeration value="IPNT"/>
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="kL"/>
 *     &lt;enumeration value="kW-a"/>
 *     &lt;enumeration value="kW-d"/>
 *     &lt;enumeration value="kW-h"/>
 *     &lt;enumeration value="kW-M"/>
 *     &lt;enumeration value="kW-min "/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="lbs"/>
 *     &lt;enumeration value="MW-a"/>
 *     &lt;enumeration value="MW-d"/>
 *     &lt;enumeration value="MW-h"/>
 *     &lt;enumeration value="MW-M"/>
 *     &lt;enumeration value="MW-min"/>
 *     &lt;enumeration value="oz_tr"/>
 *     &lt;enumeration value="PRINC"/>
 *     &lt;enumeration value="t"/>
 *     &lt;enumeration value="tn"/>
 *     &lt;enumeration value="MMbbl"/>
 *     &lt;enumeration value="USD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegPaymentStreamFixedAmountUnitOfMeasure_enum_t")
@XmlEnum
public enum LegPaymentStreamFixedAmountUnitOfMeasureEnumT {

    @XmlEnumValue("Bcf")
    BCF("Bcf"),
    @XmlEnumValue("Alw")
    ALW("Alw"),
    @XmlEnumValue("Bbl")
    BBL("Bbl"),
    CBM("CBM"),
    BDFT("BDFT"),
    GJ("GJ"),
    @XmlEnumValue("Bu")
    BU("Bu"),
    @XmlEnumValue("kWh")
    K_WH("kWh"),
    @XmlEnumValue("MMBtu")
    MM_BTU("MMBtu"),
    @XmlEnumValue("Ccy")
    CCY("Ccy"),
    @XmlEnumValue("MWh")
    M_WH("MWh"),
    CDD("CDD"),
    CER("CER"),
    @XmlEnumValue("thm")
    THM("thm"),
    CPD("CPD"),
    CRT("CRT"),
    @XmlEnumValue("cwt")
    CWT("cwt"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("dt")
    DT("dt"),
    @XmlEnumValue("EnvAllwnc")
    ENV_ALLWNC("EnvAllwnc"),
    @XmlEnumValue("EnvCrd")
    ENV_CRD("EnvCrd"),
    @XmlEnumValue("EnvOfst")
    ENV_OFST("EnvOfst"),
    @XmlEnumValue("g")
    G("g"),
    @XmlEnumValue("Gal")
    GAL("Gal"),
    GT("GT"),
    HDD("HDD"),
    IPNT("IPNT"),
    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("kL")
    K_L("kL"),
    @XmlEnumValue("kW-a")
    K_W_A("kW-a"),
    @XmlEnumValue("kW-d")
    K_W_D("kW-d"),
    @XmlEnumValue("kW-h")
    K_W_H("kW-h"),
    @XmlEnumValue("kW-M")
    K_W_M("kW-M"),
    @XmlEnumValue("kW-min ")
    K_W_MIN("kW-min "),
    L("L"),
    @XmlEnumValue("lbs")
    LBS("lbs"),
    @XmlEnumValue("MW-a")
    MW_A("MW-a"),
    @XmlEnumValue("MW-d")
    MW_D("MW-d"),
    @XmlEnumValue("MW-h")
    MW_H("MW-h"),
    @XmlEnumValue("MW-M")
    MW_M("MW-M"),
    @XmlEnumValue("MW-min")
    MW_MIN("MW-min"),
    @XmlEnumValue("oz_tr")
    OZ_TR("oz_tr"),
    PRINC("PRINC"),
    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("MMbbl")
    M_MBBL("MMbbl"),
    USD("USD");
    private final String value;

    LegPaymentStreamFixedAmountUnitOfMeasureEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegPaymentStreamFixedAmountUnitOfMeasureEnumT fromValue(String v) {
        for (LegPaymentStreamFixedAmountUnitOfMeasureEnumT c: LegPaymentStreamFixedAmountUnitOfMeasureEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

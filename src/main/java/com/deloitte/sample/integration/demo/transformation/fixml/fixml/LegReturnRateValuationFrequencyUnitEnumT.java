//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml.fixml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegReturnRateValuationFrequencyUnit_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegReturnRateValuationFrequencyUnit_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="Wk"/>
 *     &lt;enumeration value="Mo"/>
 *     &lt;enumeration value="Yr"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="Min"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegReturnRateValuationFrequencyUnit_enum_t")
@XmlEnum
public enum LegReturnRateValuationFrequencyUnitEnumT {

    D("D"),
    @XmlEnumValue("Wk")
    WK("Wk"),
    @XmlEnumValue("Mo")
    MO("Mo"),
    @XmlEnumValue("Yr")
    YR("Yr"),
    H("H"),
    @XmlEnumValue("Min")
    MIN("Min"),
    S("S"),
    T("T");
    private final String value;

    LegReturnRateValuationFrequencyUnitEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegReturnRateValuationFrequencyUnitEnumT fromValue(String v) {
        for (LegReturnRateValuationFrequencyUnitEnumT c: LegReturnRateValuationFrequencyUnitEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

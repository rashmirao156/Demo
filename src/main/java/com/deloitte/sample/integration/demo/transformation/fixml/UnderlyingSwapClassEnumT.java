//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingSwapClass_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingSwapClass_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="IX"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="SK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingSwapClass_enum_t")
@XmlEnum
public enum UnderlyingSwapClassEnumT {

    BS,
    IX,
    BB,
    SK;

    public String value() {
        return name();
    }

    public static UnderlyingSwapClassEnumT fromValue(String v) {
        return valueOf(v);
    }

}
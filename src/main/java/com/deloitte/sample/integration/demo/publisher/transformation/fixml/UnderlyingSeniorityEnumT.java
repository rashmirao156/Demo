//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for UnderlyingSeniority_enum_t.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="UnderlyingSeniority_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="JR"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="SN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "UnderlyingSeniority_enum_t")
@XmlEnum
public enum UnderlyingSeniorityEnumT {
  SD,
  SR,
  SB,
  JR,
  MZ,
  SN;

  public String value() {
    return name();
  }

  public static UnderlyingSeniorityEnumT fromValue(String v) {
    return valueOf(v);
  }
}

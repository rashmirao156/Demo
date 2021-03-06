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
 * <p>Java class for UnderlyingStipType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingStipType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMT"/>
 *     &lt;enumeration value="ABS"/>
 *     &lt;enumeration value="INCURRCVY"/>
 *     &lt;enumeration value="AUTOREINV"/>
 *     &lt;enumeration value="CPP"/>
 *     &lt;enumeration value="ADDTRM"/>
 *     &lt;enumeration value="BANKQUAL"/>
 *     &lt;enumeration value="CPR"/>
 *     &lt;enumeration value="MODEQTYDLVY"/>
 *     &lt;enumeration value="BGNCON"/>
 *     &lt;enumeration value="CPY"/>
 *     &lt;enumeration value="NOREFOBLIG"/>
 *     &lt;enumeration value="COUPON"/>
 *     &lt;enumeration value="HEP"/>
 *     &lt;enumeration value="UNKREFOBLIG"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="MHP"/>
 *     &lt;enumeration value="ALLGUARANTEES"/>
 *     &lt;enumeration value="CUSTOMDATE"/>
 *     &lt;enumeration value="MPR"/>
 *     &lt;enumeration value="REFPX"/>
 *     &lt;enumeration value="GEOG"/>
 *     &lt;enumeration value="PPC"/>
 *     &lt;enumeration value="REFPOLICY"/>
 *     &lt;enumeration value="HAIRCUT"/>
 *     &lt;enumeration value="PSA"/>
 *     &lt;enumeration value="SECRDLIST"/>
 *     &lt;enumeration value="INSURED"/>
 *     &lt;enumeration value="SMM"/>
 *     &lt;enumeration value="ISSUE"/>
 *     &lt;enumeration value="ISSUER"/>
 *     &lt;enumeration value="ISSUESIZE"/>
 *     &lt;enumeration value="LOOKBACK"/>
 *     &lt;enumeration value="LOT"/>
 *     &lt;enumeration value="LOTVAR"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="MATURITY"/>
 *     &lt;enumeration value="MAXSUBS"/>
 *     &lt;enumeration value="MINDNOM"/>
 *     &lt;enumeration value="MININCR"/>
 *     &lt;enumeration value="MINQTY"/>
 *     &lt;enumeration value="PAYFREQ"/>
 *     &lt;enumeration value="PIECES"/>
 *     &lt;enumeration value="PMAX"/>
 *     &lt;enumeration value="PPL"/>
 *     &lt;enumeration value="PPM"/>
 *     &lt;enumeration value="PPT"/>
 *     &lt;enumeration value="PRICE"/>
 *     &lt;enumeration value="PRICEFREQ"/>
 *     &lt;enumeration value="PROD"/>
 *     &lt;enumeration value="PROTECT"/>
 *     &lt;enumeration value="PURPOSE"/>
 *     &lt;enumeration value="PXSOURCE"/>
 *     &lt;enumeration value="RATING"/>
 *     &lt;enumeration value="REDEMPTION"/>
 *     &lt;enumeration value="RESTRICTED"/>
 *     &lt;enumeration value="SECTOR"/>
 *     &lt;enumeration value="SECTYPE"/>
 *     &lt;enumeration value="STRUCT"/>
 *     &lt;enumeration value="SUBSFREQ"/>
 *     &lt;enumeration value="SUBSLEFT"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="TRDVAR"/>
 *     &lt;enumeration value="WAC"/>
 *     &lt;enumeration value="WAL"/>
 *     &lt;enumeration value="WALA"/>
 *     &lt;enumeration value="WAM"/>
 *     &lt;enumeration value="WHOLE"/>
 *     &lt;enumeration value="YIELD"/>
 *     &lt;enumeration value="AVFICO"/>
 *     &lt;enumeration value="ORIGAMT"/>
 *     &lt;enumeration value="AVSIZE"/>
 *     &lt;enumeration value="POOLEFFDT"/>
 *     &lt;enumeration value="MAXBAL"/>
 *     &lt;enumeration value="POOLINITFCTR"/>
 *     &lt;enumeration value="POOL"/>
 *     &lt;enumeration value="TRANCHE"/>
 *     &lt;enumeration value="ROLLTYPE"/>
 *     &lt;enumeration value="SUBSTITUTION"/>
 *     &lt;enumeration value="REFTRADE"/>
 *     &lt;enumeration value="MULTEXCHFLLBCK"/>
 *     &lt;enumeration value="REFPRIN"/>
 *     &lt;enumeration value="COMPSECFLLBCK"/>
 *     &lt;enumeration value="REFINT"/>
 *     &lt;enumeration value="LOCLJRSDCTN"/>
 *     &lt;enumeration value="AVAILQTY"/>
 *     &lt;enumeration value="RELVJRSDCTN"/>
 *     &lt;enumeration value="BROKERCREDIT"/>
 *     &lt;enumeration value="INTERNALPX"/>
 *     &lt;enumeration value="INTERNALQTY"/>
 *     &lt;enumeration value="LEAVEQTY"/>
 *     &lt;enumeration value="MAXORDQTY"/>
 *     &lt;enumeration value="ORDRINCR"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="SALESCREDITOVR"/>
 *     &lt;enumeration value="TRADERCREDIT"/>
 *     &lt;enumeration value="DISCOUNT"/>
 *     &lt;enumeration value="YTM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingStipType_enum_t")
@XmlEnum
public enum UnderlyingStipTypeEnumT {

    AMT,
    ABS,
    INCURRCVY,
    AUTOREINV,
    CPP,
    ADDTRM,
    BANKQUAL,
    CPR,
    MODEQTYDLVY,
    BGNCON,
    CPY,
    NOREFOBLIG,
    COUPON,
    HEP,
    UNKREFOBLIG,
    CURRENCY,
    MHP,
    ALLGUARANTEES,
    CUSTOMDATE,
    MPR,
    REFPX,
    GEOG,
    PPC,
    REFPOLICY,
    HAIRCUT,
    PSA,
    SECRDLIST,
    INSURED,
    SMM,
    ISSUE,
    ISSUER,
    ISSUESIZE,
    LOOKBACK,
    LOT,
    LOTVAR,
    MAT,
    MATURITY,
    MAXSUBS,
    MINDNOM,
    MININCR,
    MINQTY,
    PAYFREQ,
    PIECES,
    PMAX,
    PPL,
    PPM,
    PPT,
    PRICE,
    PRICEFREQ,
    PROD,
    PROTECT,
    PURPOSE,
    PXSOURCE,
    RATING,
    REDEMPTION,
    RESTRICTED,
    SECTOR,
    SECTYPE,
    STRUCT,
    SUBSFREQ,
    SUBSLEFT,
    TEXT,
    TRDVAR,
    WAC,
    WAL,
    WALA,
    WAM,
    WHOLE,
    YIELD,
    AVFICO,
    ORIGAMT,
    AVSIZE,
    POOLEFFDT,
    MAXBAL,
    POOLINITFCTR,
    POOL,
    TRANCHE,
    ROLLTYPE,
    SUBSTITUTION,
    REFTRADE,
    MULTEXCHFLLBCK,
    REFPRIN,
    COMPSECFLLBCK,
    REFINT,
    LOCLJRSDCTN,
    AVAILQTY,
    RELVJRSDCTN,
    BROKERCREDIT,
    INTERNALPX,
    INTERNALQTY,
    LEAVEQTY,
    MAXORDQTY,
    ORDRINCR,
    PRIMARY,
    SALESCREDITOVR,
    TRADERCREDIT,
    DISCOUNT,
    YTM;

    public String value() {
        return name();
    }

    public static UnderlyingStipTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

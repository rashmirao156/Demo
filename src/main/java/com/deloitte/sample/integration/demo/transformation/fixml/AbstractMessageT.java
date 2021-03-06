//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 04:33:21 PM IST 
//


package com.deloitte.sample.integration.demo.transformation.fixml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Abstract_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Abstract_message_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hdr" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}MessageHeader_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abstract_message_t", propOrder = {
    "hdr"
})
@XmlSeeAlso({
    ApplicationMessageReportMessageT.class,
    TradingSessionListUpdateReportMessageT.class,
    SettlementInstructionsMessageT.class,
    PartyRiskLimitsDefinitionRequestMessageT.class,
    QuoteMessageT.class,
    OrderMassCancelReportMessageT.class,
    PartyRiskLimitsUpdateReportMessageT.class,
    ExecutionReportMessageT.class,
    UserResponseMessageT.class,
    BidRequestMessageT.class,
    MarketDataSnapshotFullRefreshMessageT.class,
    PartyDetailsListReportMessageT.class,
    OrderCancelReplaceRequestMessageT.class,
    AllocationInstructionMessageT.class,
    RequestForPositionsMessageT.class,
    NewOrderMultilegMessageT.class,
    PartyDetailsDefinitionRequestAckMessageT.class,
    PartyEntitlementsUpdateReportMessageT.class,
    TradingSessionStatusRequestMessageT.class,
    PartyRiskLimitsReportAckMessageT.class,
    RFQRequestMessageT.class,
    PartyRiskLimitsReportMessageT.class,
    PartyActionRequestMessageT.class,
    SecurityStatusRequestMessageT.class,
    SecurityDefinitionRequestMessageT.class,
    MarketDefinitionUpdateReportMessageT.class,
    TradeMatchReportAckMessageT.class,
    NetworkCounterpartySystemStatusResponseMessageT.class,
    NewOrderListMessageT.class,
    MarketDataStatisticsReportMessageT.class,
    CollateralRequestMessageT.class,
    ListStatusMessageT.class,
    OrderMassStatusRequestMessageT.class,
    DerivativeSecurityListMessageT.class,
    AllocationReportMessageT.class,
    MarginRequirementInquiryMessageT.class,
    ListExecuteMessageT.class,
    SecurityDefinitionMessageT.class,
    PositionMaintenanceReportMessageT.class,
    DerivativeSecurityListRequestMessageT.class,
    ConfirmationAckMessageT.class,
    MassQuoteAckMessageT.class,
    SecurityListRequestMessageT.class,
    QuoteStatusReportMessageT.class,
    MarketDataReportMessageT.class,
    PartyDetailsListRequestMessageT.class,
    QuoteRequestMessageT.class,
    NetworkCounterpartySystemStatusRequestMessageT.class,
    ConfirmationRequestMessageT.class,
    CollateralResponseMessageT.class,
    OrderMassActionRequestMessageT.class,
    TradeCaptureReportRequestAckMessageT.class,
    TradingSessionListMessageT.class,
    TradingSessionListRequestMessageT.class,
    AdjustedPositionReportMessageT.class,
    QuoteAckMessageT.class,
    PositionTransferInstructionMessageT.class,
    AccountSummaryReportMessageT.class,
    UserNotificationMessageT.class,
    StreamAssignmentRequestMessageT.class,
    QuoteCancelMessageT.class,
    SecurityTypesMessageT.class,
    MarketDataStatisticsRequestMessageT.class,
    RegistrationInstructionsMessageT.class,
    EmailMessageT.class,
    MultilegOrderCancelReplaceMessageT.class,
    QuoteStatusRequestMessageT.class,
    CollateralReportMessageT.class,
    MassOrderMessageT.class,
    AllocationInstructionAckMessageT.class,
    PartyRiskLimitsRequestMessageT.class,
    QuoteRequestRejectMessageT.class,
    ExecutionAckMessageT.class,
    MarketDataIncrementalRefreshMessageT.class,
    BusinessMessageRejectMessageT.class,
    CollateralReportAckMessageT.class,
    PartyEntitlementsDefinitionRequestMessageT.class,
    CollateralInquiryMessageT.class,
    DontKnowTradeMessageT.class,
    PartyRiskLimitCheckRequestAckMessageT.class,
    RequestForPositionsAckMessageT.class,
    AdvertisementMessageT.class,
    MassQuoteMessageT.class,
    PartyRiskLimitsDefinitionRequestAckMessageT.class,
    OrderStatusRequestMessageT.class,
    ListCancelRequestMessageT.class,
    NewOrderSingleMessageT.class,
    MarketDefinitionRequestMessageT.class,
    CrossOrderCancelReplaceRequestMessageT.class,
    BidResponseMessageT.class,
    OrderMassCancelRequestMessageT.class,
    PartyEntitlementsRequestMessageT.class,
    SecurityDefinitionUpdateReportMessageT.class,
    MassOrderAckMessageT.class,
    ConfirmationMessageT.class,
    NewOrderCrossMessageT.class,
    StreamAssignmentReportACKMessageT.class,
    PartyEntitlementsDefinitionRequestAckMessageT.class,
    OrderMassActionReportMessageT.class,
    ApplicationMessageRequestAckMessageT.class,
    QuoteResponseMessageT.class,
    ContraryIntentionReportMessageT.class,
    MarginRequirementInquiryAckMessageT.class,
    MarginRequirementReportMessageT.class,
    PositionTransferReportMessageT.class,
    CrossRequestMessageT.class,
    SecurityStatusMessageT.class,
    UserRequestMessageT.class,
    DerivativeSecurityListUpdateReportMessageT.class,
    MarketDataRequestMessageT.class,
    MarketDataRequestRejectMessageT.class,
    TradeCaptureReportRequestMessageT.class,
    AllocationReportAckMessageT.class,
    CrossOrderCancelRequestMessageT.class,
    SecurityListUpdateReportMessageT.class,
    SettlementObligationReportMessageT.class,
    SettlementInstructionRequestMessageT.class,
    RegistrationInstructionsResponseMessageT.class,
    MarketDefinitionMessageT.class,
    OrderCancelRejectMessageT.class,
    StreamAssignmentReportMessageT.class,
    SecurityMassStatusRequestMessageT.class,
    NewsMessageT.class,
    CollateralAssignmentMessageT.class,
    PartyDetailsDefinitionRequestMessageT.class,
    OrderCancelRequestMessageT.class,
    PositionTransferInstructionAckMessageT.class,
    TradeCaptureReportMessageT.class,
    TradeCaptureReportAckMessageT.class,
    AllocationInstructionAlertMessageT.class,
    IOIMessageT.class,
    ListStatusRequestMessageT.class,
    PositionMaintenanceRequestMessageT.class,
    SecurityTypeRequestMessageT.class,
    PartyActionReportMessageT.class,
    ApplicationMessageRequestMessageT.class,
    CrossRequestAckMessageT.class,
    AssignmentReportMessageT.class,
    PartyDetailsListUpdateReportMessageT.class,
    AllocationInstructionAlertRequestMessageT.class,
    CollateralInquiryAckMessageT.class,
    ListStrikePriceMessageT.class,
    PartyEntitlementsReportMessageT.class,
    PositionReportMessageT.class,
    TradeMatchReportMessageT.class,
    TradingSessionStatusMessageT.class,
    SecurityListMessageT.class,
    PartyRiskLimitCheckRequestMessageT.class,
    SecurityMassStatusMessageT.class
})
public class AbstractMessageT {

    @XmlElement(name = "Hdr")
    protected MessageHeaderT hdr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderT }
     *     
     */
    public MessageHeaderT getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderT }
     *     
     */
    public void setHdr(MessageHeaderT value) {
        this.hdr = value;
    }

}

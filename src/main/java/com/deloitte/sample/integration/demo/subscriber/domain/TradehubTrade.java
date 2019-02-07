package com.deloitte.sample.integration.demo.subscriber.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradehubTrade {

    //Direct Mapping from FIXML
    private LocalDate createdt;
    private String updateBy;
    private String blockId;
    private String brokerCode;
    private String inputId;
    private  String comments;
    private UUID trackingID;
    private String exchRateMultiDivInd;
    private BigDecimal accruedIntDays;
    private BigDecimal accruedInt;

}

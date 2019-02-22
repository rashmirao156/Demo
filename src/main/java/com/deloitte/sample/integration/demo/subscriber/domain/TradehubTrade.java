package com.deloitte.sample.integration.demo.subscriber.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradehubTrade {

  // Direct Mapping from FIXML
  private BigInteger trdNum;
  private String trdVer;
  private String settlCcy;
  private String txnTm;
  private String lastUpdateTm;
  private BigDecimal lastPx;
  private BigDecimal grossTrdAmt;
  private BigInteger transTyp;
  private String trdDt;
}

package com.deloitte.sample.integration.demo.subscriber.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Security {
    private String accuralDt;
    private String agency;
    private String cusip;

}

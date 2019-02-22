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
public class IssueDetails {
    private String accuralDt;
    private String agency;
}

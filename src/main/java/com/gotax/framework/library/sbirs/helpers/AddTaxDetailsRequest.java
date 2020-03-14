package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AddTaxDetailsRequest {
    private String jtbTin;
    private String oldTin;
    private String tccNumber;
    private String taxPeriod;
    private String turnover;
    private String assessableProfit;
    private String totalProfit;
    private String taxPayable;
    private String taxPaid;
    private String paymentDate;
    private String taxType;
    private String taxAuthority;
    private String taxOffice;
}

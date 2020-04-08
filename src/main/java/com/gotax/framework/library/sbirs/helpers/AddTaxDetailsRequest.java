package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class AddTaxDetailsRequest {
    @JsonProperty("jtb_tin")
    private String jtb_tin;
    @JsonProperty("old_tin")
    private String old_tin;
    @JsonProperty("tcc_number")
    private String tcc_number;
    @JsonProperty("tax_period")
    private String tax_period;
    @JsonProperty("turnover")
    private String turnover;
    @JsonProperty("assessable_profit")
    private String assessable_profit;
    @JsonProperty("total_profit")
    private String total_profit;
    @JsonProperty("tax_payable")
    private String tax_payable;
    @JsonProperty("tax_paid")
    private String tax_paid;
    @JsonProperty("payment_date")
    private String payment_date;
    @JsonProperty("tax_type")
    private String tax_type;
    @JsonProperty("tax_authority")
    private String tax_authority;
    @JsonProperty("tax_office")
    private String tax_office;
}

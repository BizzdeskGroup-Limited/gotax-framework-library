package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class GetNonIndividualTaxPayersPagedResponse {
    @JsonProperty("TaxpayerList")
    private List<NonIndividualTaxPayerPagedInformation> TaxpayerList;
    @JsonProperty("ResponseCode")
    private String ResponseCode;
    @JsonProperty("ResponseDescription")
    private String ResponseDescription;
    @JsonProperty("TotalRecords")
    private int TotalRecords;
    @JsonProperty("Page")
    private int Page;
    @JsonProperty("TotalPages")
    private int TotalPages;
    @JsonProperty("RecordPerPage")
    private int RecordPerPage;
}

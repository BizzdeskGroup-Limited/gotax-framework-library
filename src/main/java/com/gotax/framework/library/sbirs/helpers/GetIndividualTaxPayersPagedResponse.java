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
public class GetIndividualTaxPayersPagedResponse {
    @JsonProperty("TaxpayerList")
    private List<IndividualTaxPayerPagedInformation> TaxpayerList;
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

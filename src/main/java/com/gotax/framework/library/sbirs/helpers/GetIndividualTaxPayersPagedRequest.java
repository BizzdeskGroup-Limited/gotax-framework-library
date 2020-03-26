package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetIndividualTaxPayersPagedRequest {
    private String fromdate;
    private String todate;
    @JsonProperty("page_number")
    private String page_number;
}

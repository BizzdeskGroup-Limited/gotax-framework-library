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
public class GetNonIndividualTaxPayersPagedRequest {
    private String fromdate;
    private String todate;
    @JsonProperty("page_number")
    private String page_number;
}

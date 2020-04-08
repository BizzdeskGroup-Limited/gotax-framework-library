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
public class AddTaxDetailsResponse {
    @JsonProperty("ResponseCode")
    private String ResponseCode;
    @JsonProperty("ResponseDescription")
    private String ResponseDescription;
}

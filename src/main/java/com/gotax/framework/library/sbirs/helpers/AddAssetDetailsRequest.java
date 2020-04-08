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
public class AddAssetDetailsRequest {

    private String tin;
    private String location;
    @JsonProperty("asset_type")
    private String asset_type;
    @JsonProperty("asset_value")
    private String asset_value;
    @JsonProperty("date_acquired")
    private String date_acquired;
    private String description;
}

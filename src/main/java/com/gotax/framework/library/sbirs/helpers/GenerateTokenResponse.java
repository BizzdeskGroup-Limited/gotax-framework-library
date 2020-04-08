package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateTokenResponse {
    private boolean success;
    private String sessionId;
    private String tokenId;
    private String errorMsg;
}

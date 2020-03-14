package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateTokenResponse {
    private boolean success;
    private String sessionId;
    private String tokenId;
}

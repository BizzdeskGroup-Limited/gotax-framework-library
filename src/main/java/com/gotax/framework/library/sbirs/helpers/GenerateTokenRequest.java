package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GenerateTokenRequest {
    private String email;
    private String password;
    private String clientname;
    private String errorMsg;
}

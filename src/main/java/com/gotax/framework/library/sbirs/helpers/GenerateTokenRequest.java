package com.gotax.framework.library.sbirs.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@ToString
public class GenerateTokenRequest {
    @NotEmpty(message = "Email Must Not Be Empty")
    private String email;

    @NotEmpty(message = "Password Must Not Be Empty")
    private String password;

    @NotEmpty(message = "Client Name Must Not Be Empty")
    private String clientname;
}

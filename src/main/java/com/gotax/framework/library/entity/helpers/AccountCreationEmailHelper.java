package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class AccountCreationEmailHelper {

    private String userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Long verificationCode;
}

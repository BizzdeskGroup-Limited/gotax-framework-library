package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class UserHelper {

    private String emailAddress;
    private String firstName;
    private String lastName;
    private String middleName;
    private String mobileNumber;
    private String password;
    private String roleId;

}

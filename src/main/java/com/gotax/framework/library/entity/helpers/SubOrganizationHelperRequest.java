package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class SubOrganizationHelperRequest {

    private Long organizationId;
    private String subOrganizationName;
    private String subOrganizationCode;
    private String physicalAddress;
    private String contactEmail;
    private String contactPhoneNumber;
}

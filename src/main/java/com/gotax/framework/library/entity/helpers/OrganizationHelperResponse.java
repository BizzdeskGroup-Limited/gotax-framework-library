package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class OrganizationHelperResponse {

    private Long organizationId;
    private String organizationName;
    private String organizationCode;
    private String organizationTypeId;
    private String physicalAddress;
    private String contactEmail;
    private String contactPhoneNumber;
    private boolean retention;
    private BigDecimal percentageRetention;
}

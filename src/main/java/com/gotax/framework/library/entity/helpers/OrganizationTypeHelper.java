package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class OrganizationTypeHelper {

    private String organizationTypeId;
    private String organizationTypeDescription;
}

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
public class ServiceHelperResponse {

    private Long serviceId;
    private BigDecimal amount;
    private ServiceCategoryHelper serviceCategoryHelper;
    private String serviceName;
    private Boolean retaining;
    private BigDecimal percentageOfRetention;
    private OrganizationHelperResponse organisationId;
}

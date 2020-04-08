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
public class ServiceHelperRequest {

    private BigDecimal amount;
    private String serviceCategoryCode;
    private String serviceName;
    private Boolean retaining;
    private BigDecimal percentageOfRetention;
    private Long organisationId;
}

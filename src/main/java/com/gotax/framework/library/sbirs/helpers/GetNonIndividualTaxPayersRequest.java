package com.gotax.framework.library.sbirs.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class GetNonIndividualTaxPayersRequest {
    private String fromdate;
    private String todate;
}

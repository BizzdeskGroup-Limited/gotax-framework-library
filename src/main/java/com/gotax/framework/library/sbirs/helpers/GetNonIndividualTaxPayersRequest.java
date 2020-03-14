package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetNonIndividualTaxPayersRequest {
    private String fromdate;
    private String todate;
}

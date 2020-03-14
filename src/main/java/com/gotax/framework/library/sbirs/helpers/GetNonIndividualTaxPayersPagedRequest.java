package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetNonIndividualTaxPayersPagedRequest {
    private String fromdate;
    private String todate;
    private String page_number;
}

package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetNonIndividualTaxPayersResponse {
    private List<NonIndividualTaxPayerInformation> taxpayerList;
    private String responseCode;
    private String responseDescription;
}

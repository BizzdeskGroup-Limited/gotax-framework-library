package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetIndividualTaxPayersResponse {
    private List<IndividualTaxPayerInformation> taxpayerList;
    private String responseCode;
    private String responseDescription;
}

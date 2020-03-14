package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GetNonIndividualTaxPayersPagedResponse {
    private List<NonIndividualTaxPayerPagedInformation> taxpayerList;
    private String responseCode;
    private String responseDescription;
    private Integer totalRecords;
    private Integer page;
    private Integer totalPages;
    private Integer recordPerPage;
}

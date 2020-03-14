package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class NonIndividualTaxPayerInformation {
    private String tin;
    private String registeredName;
    private String mainTradeName;
    private String orgName;
    private String registrationNumber;
    private String phoneNo1;
    private String phoneNo2;
    private String emailAddress;
    private String lineOfBusinessCode;
    private String lobName;
    private String dateOfRegistration;
    private Object commencementDate;
    private String dateOfIncorporation;
    private String houseNumber;
    private String streetName;
    private String city;
    private String lGAName;
    private String stateName;
    private String countryName;
    private String finYrBegin;
    private String finYrEnd;
    private String directorName;
    private String directorPhone;
    private String directorEmail;
    private String taxAuthorityCode;
    private String taxAuthorityName;
    private String taxpayerStatus;
    private String orgTypeName;
}

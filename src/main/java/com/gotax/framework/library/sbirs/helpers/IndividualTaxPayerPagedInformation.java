package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class IndividualTaxPayerPagedInformation {
    private String tin;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String genderName;
    private String stateOfOrigin;
    private String dateOfBirth;
    private Object maritalStatus;
    private String occupation;
    private String nationalityName;
    private String phoneNo1;
    private String phoneNo2;
    private String taxpayerPhoto;
    private String emailAddress;
    private String dateOfRegistration;
    private String houseNumber;
    private String streetName;
    private String city;
    private String lGAName;
    private String stateName;
    private String countryName;
    private String taxAuthorityCode;
    private String taxAuthorityName;
    private Double userId;
    private String taxpayerStatus;
}

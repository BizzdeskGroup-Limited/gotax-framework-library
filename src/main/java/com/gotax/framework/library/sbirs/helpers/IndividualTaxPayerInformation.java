package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class IndividualTaxPayerInformation {
    private String tin;
    private String bvn;
    private String nin;
    private String title;
    private String sBIRtName;
    private String middleName;
    private String lastName;
    private String genderName;
    private String stateOfOrigin;
    private String dateOfBirth;
    private Object maritalStatus;
    private Object occupation;
    private String nationalityName;
    private String phoneNo1;
    private String phoneNo2;
    private Object taxpayerPhoto;
    private Object emailAddress;
    private String dateOfRegistration;
    private String houseNumber;
    private String streetName;
    private Object city;
    private String lGAName;
    private String stateName;
    private String countryName;
    private String taxAuthorityCode;
    private String taxAuthorityName;
    private String taxpayerStatus;
}

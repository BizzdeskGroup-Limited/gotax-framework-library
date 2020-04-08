package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class IndividualTaxPayerPagedInformation {

    private String tin;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("middle_name")
    private String middle_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("GenderName")
    private String GenderName;
    @JsonProperty("StateOfOrigin")
    private String StateOfOrigin;
    @JsonProperty("date_of_birth")
    private String date_of_birth;
    @JsonProperty("MaritalStatus")
    private String MaritalStatus;
    @JsonProperty("Occupation")
    private String Occupation;
    @JsonProperty("nationality_name")
    private String nationality_name;
    @JsonProperty("phone_no_1")
    private String phone_no_1;
    @JsonProperty("phone_no_2")
    private String phone_no_2;
    @JsonProperty("taxpayer_photo")
    private String taxpayer_photo;
    @JsonProperty("email_address")
    private String email_address;
    @JsonProperty("date_of_registration")
    private String date_of_registration;
    @JsonProperty("house_number")
    private String house_number;
    @JsonProperty("street_name")
    private String street_name;
    private String city;
    @JsonProperty("LGAName")
    private String LGAName;
    @JsonProperty("StateName")
    private String StateName;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("TaxAuthorityCode")
    private String TaxAuthorityCode;
    @JsonProperty("TaxAuthorityName")
    private String TaxAuthorityName;
    @JsonProperty("user_id")
    private int user_id;
    @JsonProperty("TaxpayerStatus")
    private String TaxpayerStatus;

}

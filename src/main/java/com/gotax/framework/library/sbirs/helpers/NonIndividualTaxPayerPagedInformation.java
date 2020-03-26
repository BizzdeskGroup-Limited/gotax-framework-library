package com.gotax.framework.library.sbirs.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class NonIndividualTaxPayerPagedInformation {
    private String tin;
    @JsonProperty("registered_name")
    private String registered_name;
    @JsonProperty("main_trade_name")
    private String main_trade_name;
    @JsonProperty("org_type_name")
    private String org_type_name;
    @JsonProperty("registration_number")
    private String registration_number;
    @JsonProperty("phone_no_1")
    private String phone_no_1;
    @JsonProperty("phone_no_2")
    private String phone_no_2;
    @JsonProperty("email_address")
    private String email_address;
    @JsonProperty("line_of_business_code")
    private String line_of_business_code;
    @JsonProperty("lob_name")
    private String lob_name;
    @JsonProperty("date_of_registration")
    private String date_of_registration;
    @JsonProperty("commencement_date")
    private String commencement_date;
    @JsonProperty("date_of_incorporation")
    private String date_of_incorporation;
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
    @JsonProperty("FinYrBegin")
    private String FinYrBegin;
    @JsonProperty("FinYrEnd")
    private String FinYrEnd;
    @JsonProperty("director_name")
    private String director_name;
    @JsonProperty("director_phone")
    private String director_phone;
    @JsonProperty("director_email")
    private String director_email;
    @JsonProperty("TaxAuthorityCode")
    private String TaxAuthorityCode;
    @JsonProperty("TaxAuthorityName")
    private String TaxAuthorityName;
    @JsonProperty("TaxpayerStatus")
    private String TaxpayerStatus;
}

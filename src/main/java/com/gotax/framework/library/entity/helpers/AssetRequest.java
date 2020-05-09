package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class AssetRequest {

    @NotBlank
    private String tin;
    private Long locationId;
    @Digits(integer = 11, fraction = 2)
    private String assetValue;
    private Long assetTypeId;
    @Pattern(regexp = "^(1[0-2]|0[1-9])-(3[01]"
            + "|[12][0-9]|0[1-9])-[0-9]{4}$", message = "Date Format must be DD-MM-YYYY")
    private Date dateOfPurchase;
    private String description;
}

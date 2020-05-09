package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class AssetResponse {

    private Long id;
    private String tin;
    private LocationResponse locationResponse;
    private String assetValue;
    private AssetTypeResponse assetTypeResponse;
    private Date dateOfPurchase;
    private String description;
    private String jtbResponse;
    private String jtbResponseDescription;
}

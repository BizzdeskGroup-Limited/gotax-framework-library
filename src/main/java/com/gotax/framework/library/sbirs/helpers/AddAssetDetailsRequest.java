package com.gotax.framework.library.sbirs.helpers;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AddAssetDetailsRequest {
    private String tin;
    private String location;
    private String assetType;
    private String assetValue;
    private String dateAcquired;
    private String description;
}

package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class LocationRequest {

    @NotBlank
    private String location;
}

package com.gotax.framework.library.entity.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class ServiceCategoryHelper {

    private String serviceCategoryCode;
    private String categoryName;
    private String categoryDescription;
    private String urlSlug;
}

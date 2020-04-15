package com.gotax.framework.library.sbirs.helpers;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@ToString
public class DateRangeGenerator {
    private String fromdate;
    private String todate;
}

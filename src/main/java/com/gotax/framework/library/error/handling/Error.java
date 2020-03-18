package com.gotax.framework.library.error.handling;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@ToString
public class Error {

    private String errorCode;
    private String errorDescription;
}

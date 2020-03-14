package com.gotax.framework.library.helpers;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GoTaxLogHelper {

    String method;
    String path;
    Date requestDate;
    String remoteAddress;
    String httpStatusCode;
    String urlParameters;
    String fullRequestPath;
    String requestHeaders;
    String requestPayload;
    String responsePayload;
}

package com.gotax.framework.library.helpers;

import com.gotax.framework.library.kafka.GoTaxLogChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class GoTaxLogHandler {

    private GoTaxLogChannel goTaxLogChannel;

    @Autowired
    public GoTaxLogHandler(GoTaxLogChannel goTaxLogChannel) {
        this.goTaxLogChannel = goTaxLogChannel;
    }

    private GoTaxLogHelper generateGoTaxLogsPerRequest(String requestHeaders, String requestBody, String responsePayLoad, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return new GoTaxLogHelper()
                .setFullRequestPath(httpServletRequest.getServletPath())
                .setHttpStatusCode(String.valueOf(httpServletResponse.getStatus()))
                .setMethod(httpServletRequest.getMethod())
                .setPath(httpServletRequest.getContextPath())
                .setRemoteAddress(httpServletRequest.getRemoteAddr())
                .setRequestDate(new Date())
                .setRequestHeaders(requestHeaders)
                .setRequestPayload(requestBody)
                .setResponsePayload(responsePayLoad)
                .setUrlParameters(httpServletRequest.getQueryString());

    }

    public void createLog(String requestHeaders, String requestBody, String responsePayLoad, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        GoTaxLogHelper goTaxLogHelper = generateGoTaxLogsPerRequest(requestHeaders, requestBody, responsePayLoad, httpServletRequest, httpServletResponse);
        goTaxLogChannel.output().send(MessageBuilder.withPayload(goTaxLogHelper).build());
    }
}

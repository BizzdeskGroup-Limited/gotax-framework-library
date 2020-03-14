package com.gotax.framework.library.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gotax.framework.library.helpers.GoTaxLogHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Component
public class LogFilter implements Filter {

    private GoTaxLogHandler goTaxLogHandler;

    public LogFilter(GoTaxLogHandler goTaxLogHandler) {
        this.goTaxLogHandler = goTaxLogHandler;

    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper((HttpServletRequest) servletRequest);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper((HttpServletResponse) servletResponse);

        filterChain.doFilter(requestWrapper, responseWrapper);
        String requestData = getRequestData(requestWrapper);
        String responseData = getResponseData(responseWrapper);
        Map<String, String> requestHeadersMap = getHeadersFromHttpServletRequest(requestWrapper);
        String requestHeaders = new ObjectMapper().writeValueAsString(requestHeadersMap);
        goTaxLogHandler.createLog(requestHeaders, requestData, responseData, requestWrapper, responseWrapper);
        responseWrapper.copyBodyToResponse();
    }

    private static String getRequestData(final HttpServletRequest httpServletRequest) throws UnsupportedEncodingException {
        String payload = "";
        ContentCachingRequestWrapper contentCachingRequestWrapper = WebUtils.getNativeRequest(httpServletRequest, ContentCachingRequestWrapper.class);
        if (contentCachingRequestWrapper != null) {
            byte[] contentByte = contentCachingRequestWrapper.getContentAsByteArray();
            if (contentByte.length > 0) {
                payload = new String(contentByte, 0, contentByte.length, contentCachingRequestWrapper.getCharacterEncoding());
            }
        }
        return payload;
    }

    private static String getResponseData(final HttpServletResponse httpServletResponse) throws IOException {
        String payload = "";
        ContentCachingResponseWrapper contentCachingResponseWrapper = WebUtils.getNativeResponse(httpServletResponse, ContentCachingResponseWrapper.class);
        if (contentCachingResponseWrapper != null) {
            byte[] contentByte = contentCachingResponseWrapper.getContentAsByteArray();
            if (contentByte.length > 0) {
                payload = new String(contentByte, 0, contentByte.length, contentCachingResponseWrapper.getCharacterEncoding());
                contentCachingResponseWrapper.copyBodyToResponse();
            }
        }
        return payload;
    }

    public static Map<String, String> getHeadersFromHttpServletRequest(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
}

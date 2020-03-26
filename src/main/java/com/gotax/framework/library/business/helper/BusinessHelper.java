package com.gotax.framework.library.business.helper;

import org.apache.commons.lang3.RandomStringUtils;

public class BusinessHelper {

    public static Long generateSixDigitNumber(int numberOfDigits) {
        return Long.valueOf(RandomStringUtils.randomNumeric(numberOfDigits));
    }
}

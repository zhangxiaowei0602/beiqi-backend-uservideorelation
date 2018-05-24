package com.yelixian.beiqi.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BeiqiUtils {
    private static final Logger logger = LoggerFactory.getLogger(BeiqiUtils.class);

    public static int getCurrentTimestamp() {
        long current = System.currentTimeMillis();
        int ts = (int)(current / 1000);
        logger.info("current timestamp: " + ts);
        return ts;
    }

    public static int getFixedTimestamp() {
        return 1537525537; // 2018-09-21 10:25:37
    }

    public static int get1DayLaterTimestamp() {
        long current = System.currentTimeMillis();
        int ts = (int)(current / 1000) + 24 * 60 * 60;
        logger.info("token expiry timestamp: " + ts);
        return ts;
    }

    public static String getMaskedPhoneNumber(String original) {
        return original.substring(0, 3) + "XXXX" + original.substring(7, 11);
    }

    public static void main(String[] args) {
        logger.warn(getMaskedPhoneNumber("13621611672"));
    }
}

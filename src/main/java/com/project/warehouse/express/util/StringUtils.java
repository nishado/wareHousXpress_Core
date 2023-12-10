package com.project.warehouse.express.util;

public class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("Util class initialized.");
    }

    public static String getStringValue(String str) {
        if (str == null || str.isEmpty()){
            return "";
        }
        return str;
    }


}

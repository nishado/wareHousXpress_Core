package com.project.warehouse.express.util;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {

    @Getter
    public enum DateFormatPattern {
        YEAR_MONTH_DAY("yyyy-MM-dd"),
        MONTH_DAY_YEAR("MM/dd/yyyy"),
        DAY_MONTH_YEAR("dd/MM/yyyy");
        private final String pattern;
        DateFormatPattern(String pattern) { this.pattern = pattern; }
    }

    public static String getDateStringInFormat(Date date, DateFormatPattern formatPattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern.pattern);
        return dateFormat.format(date);
    }
}

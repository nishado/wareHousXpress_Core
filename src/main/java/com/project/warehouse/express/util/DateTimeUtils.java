package com.project.warehouse.express.util;

import lombok.Getter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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

    public static Date getDateFromString(String dateString, DateFormatPattern formatPattern) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern.pattern);
        return dateFormat.parse(dateString);
    }

    public static Date getDateFromDateTimeString(String dateTimeString) throws ParseException {
        String dateString = Arrays.stream(dateTimeString.split("T")).findFirst().orElse("");
        return getDateFromString(dateString,DateFormatPattern.YEAR_MONTH_DAY);
    }

}

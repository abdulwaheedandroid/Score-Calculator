package com.abdulwaheed.scorecalculator.modals.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtility {

    public static final String getCurrentDateTime() {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        return format.format(today);
    }

    public static final String getCurrentDate() {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(today);
    }

    public static final String getCurrentDate(String dateFormat) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        return format.format(today);
    }
}

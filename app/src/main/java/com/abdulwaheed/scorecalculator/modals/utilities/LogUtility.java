package com.abdulwaheed.scorecalculator.modals.utilities;

import android.util.Log;

/*
* This class contains Log related methods
* */

public class LogUtility {

    private static final boolean shouldShowLog = true;

    /*
    * this method prints out the LOG INFO MESSAGES
    * */

    public static final void logInfo(String tag, String message) {
        if (shouldShowLog)
            Log.d(tag, message);
    }

    /*
     * this method prints out the LOG INFO MESSAGES along with exception
     * */

    public static final void logInfo(String tag, String message, Exception exception) {
        if (shouldShowLog)
            Log.d(tag, message + "Exception is " + exception.getMessage());
    }

    /*
     * this method prints out the ERROR INFO MESSAGES
     * */

    public static final void logError(String tag, String message) {
        if (shouldShowLog)
            Log.e(tag, message);
    }

    /*
     * this method prints out the ERROR INFO MESSAGES along with exception
     * */

    public static final void logError(String tag, String message, Exception exception) {
        if (shouldShowLog)
            Log.e(tag, message + "Exception is " + exception.getMessage());
    }
}

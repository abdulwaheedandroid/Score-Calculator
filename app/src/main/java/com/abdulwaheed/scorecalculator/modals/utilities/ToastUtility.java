package com.abdulwaheed.scorecalculator.modals.utilities;

import android.content.Context;
import android.widget.Toast;

public class ToastUtility {

    public static final void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}

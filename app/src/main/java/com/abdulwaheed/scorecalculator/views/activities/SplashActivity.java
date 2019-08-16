package com.abdulwaheed.scorecalculator.views.activities;

import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.abdulwaheed.scorecalculator.views.R;

public class SplashActivity extends BaseActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2_000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> navigate(TeamEntryActivity.class), SPLASH_DISPLAY_LENGTH);
    }
}

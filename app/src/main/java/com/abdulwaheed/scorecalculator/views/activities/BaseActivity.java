package com.abdulwaheed.scorecalculator.views.activities;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    protected void navigate(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }

    protected void navigate(Class<?> activity, final int flag) {
        Intent intent = new Intent(this, activity);
        intent.addFlags(flag);
        startActivity(intent);
    }
}

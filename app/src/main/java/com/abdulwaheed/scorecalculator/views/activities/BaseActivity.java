package com.abdulwaheed.scorecalculator.views.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

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

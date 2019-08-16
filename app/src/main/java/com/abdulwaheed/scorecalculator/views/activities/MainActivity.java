package com.abdulwaheed.scorecalculator.views.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.abdulwaheed.scorecalculator.views.R;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_start_match)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

    }

    @OnClick(R.id.btn_start_match)
    public void clickMe() {
        Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show();
        button.setTextColor(getResources().getColor(R.color.colorPrimary));
        button.setText("Hello man!");

    }
}

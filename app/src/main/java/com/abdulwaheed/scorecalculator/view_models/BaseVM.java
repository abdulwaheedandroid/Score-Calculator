package com.abdulwaheed.scorecalculator.view_models;

import android.widget.EditText;

import java.util.List;

public abstract class BaseVM {

    protected boolean checkIfListIsValid(List<EditText> listOfEditText) {
        if (listOfEditText != null && listOfEditText.size() > 0)
            return true;
        return false;
    }

}

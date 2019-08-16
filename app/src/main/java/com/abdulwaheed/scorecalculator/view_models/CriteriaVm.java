package com.abdulwaheed.scorecalculator.view_models;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;

import com.abdulwaheed.scorecalculator.modals.utilities.AppSession;
import com.abdulwaheed.scorecalculator.modals.utilities.LogUtility;
import com.abdulwaheed.scorecalculator.views.R;

import java.util.List;

public class CriteriaVm extends BaseVM {

    private static final String TAG = CriteriaVm.class.getSimpleName();
    private Context mContext;

    public CriteriaVm(Context context) {
        mContext = context;
    }

    public String validateCriteriaFields(List<EditText> listOfEditText) {
        if (checkIfListIsValid(listOfEditText)) {
            if (TextUtils.isEmpty(listOfEditText.get(EditTextIndexing.OVERS_IN_A_MATCH).getText()))
                return mContext.getString(R.string.error_empty_overs_in_a_match);
            if (TextUtils.isEmpty(listOfEditText.get(EditTextIndexing.OVERS_ALLOWED_TO_A_BOWLER).getText()))
                return mContext.getString(R.string.error_empty_overs_allowed_a_bowler);

            return null;
        } else {
            LogUtility.logError(TAG, "Empty list or Not initialized properly!");
        }
        return "";
    }

    public void setAppCriteria(AppSession.GameCriteria gameCriteria) {
        AppSession.getInstance().setGameCriteria(gameCriteria);
    }

    public static final class EditTextIndexing {
        public static final int OVERS_IN_A_MATCH = 0;
        public static final int OVERS_ALLOWED_TO_A_BOWLER = 1;
    }

}

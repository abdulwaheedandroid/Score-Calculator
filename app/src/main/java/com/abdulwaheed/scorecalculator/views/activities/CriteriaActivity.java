package com.abdulwaheed.scorecalculator.views.activities;

import android.os.Bundle;
import android.widget.EditText;

import com.abdulwaheed.scorecalculator.modals.utilities.AppSession;
import com.abdulwaheed.scorecalculator.modals.utilities.ToastUtility;
import com.abdulwaheed.scorecalculator.view_models.CriteriaVm;
import com.abdulwaheed.scorecalculator.views.R;

import java.util.List;

import butterknife.BindViews;
import butterknife.OnClick;

public class CriteriaActivity extends BaseActivity {

    @BindViews({R.id.etMaxOvers, R.id.etMaxOverBowler})
    List<EditText> listOfEditText;

    private CriteriaVm mCriteriaVm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_criteria);
        super.onCreate(savedInstanceState);

        //Injecting dependencies here
        mCriteriaVm = new CriteriaVm(this);
    }

    @OnClick()
    public void doneCreationCriteria() {
        String validationError = mCriteriaVm.validateCriteriaFields(listOfEditText);
        if (validationError == null) {
            setAppCriteria();
            navigate(MainActivity.class);
        } else
            ToastUtility.showToast(this, validationError);
    }

    private void setAppCriteria() {
        AppSession.GameCriteria gameCriteria = AppSession.getInstance().new GameCriteria();
        int oversInAMatch = Integer.parseInt(listOfEditText.get(CriteriaVm.EditTextIndexing.OVERS_IN_A_MATCH).getText().toString());
        int oversAllowedToABowler = Integer.parseInt(listOfEditText.get(CriteriaVm.EditTextIndexing.OVERS_ALLOWED_TO_A_BOWLER).getText().toString());

        gameCriteria.setOversInAMatch(oversInAMatch);
        gameCriteria.setOversAllowedToABowler(oversAllowedToABowler);
        mCriteriaVm.setAppCriteria(gameCriteria);
    }
}

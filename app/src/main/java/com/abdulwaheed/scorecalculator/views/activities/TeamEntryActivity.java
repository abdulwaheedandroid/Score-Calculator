package com.abdulwaheed.scorecalculator.views.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.abdulwaheed.scorecalculator.modals.utilities.ToastUtility;
import com.abdulwaheed.scorecalculator.view_models.TeamEntryVM;
import com.abdulwaheed.scorecalculator.views.R;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;

public class TeamEntryActivity extends BaseActivity {

    @BindViews({R.id.tv_main_heading, R.id.tv_date_time})
    List<TextView> listOfTextViews;

    @BindViews({R.id.et_event_name, R.id.et_first_team, R.id.et_second_team})
    List<EditText> listOfEditText;

    @BindView(R.id.btn_start_match)
    Button btnStartMatch;

    private TeamEntryVM mTeamEntryVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_team_entry);
        super.onCreate(savedInstanceState);

        //Injecting dependencies here
        mTeamEntryVM = new TeamEntryVM(this);

        setCurrentDate();
    }

    private void setCurrentDate() {
        TextView tvDate = listOfTextViews.get(TeamEntryVM.TextViewIndexing.DATE_TIME);
        tvDate.setText(mTeamEntryVM.getCurrentDate());
    }

    @OnClick(R.id.btn_start_match)
    public void startMatch() {
        String validationError = mTeamEntryVM.validateFields(listOfEditText);
        if (validationError == null) {
            saveEventNameInAppSession();
            saveTeams();
            navigate(CriteriaActivity.class);
        } else
            ToastUtility.showToast(this, validationError);
    }

    private void saveTeams() {
        String firstTeam = listOfEditText.get(TeamEntryVM.EditTextIndexing.FIRST_TEAM).getText().toString();
        String secondTeam = listOfEditText.get(TeamEntryVM.EditTextIndexing.SECOND_TEAM).getText().toString();
        // params ==> firstTeam and secondParam cannot be null because these are already validated.
        mTeamEntryVM.saveTeams(firstTeam, secondTeam);
    }

    private void saveEventNameInAppSession() {
        mTeamEntryVM.saveEventNameInSession(listOfEditText.
                get(TeamEntryVM.EditTextIndexing.EVENT_NAME).getText().toString());
    }


}

package com.abdulwaheed.scorecalculator.view_models;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;

import com.abdulwaheed.scorecalculator.modals.utilities.AppSession;
import com.abdulwaheed.scorecalculator.modals.utilities.DateTimeUtility;
import com.abdulwaheed.scorecalculator.modals.utilities.LogUtility;
import com.abdulwaheed.scorecalculator.views.R;

import java.util.List;

import butterknife.BindViews;

public class TeamEntryVM extends BaseVM {

    private final String TAG = TeamEntryVM.class.getSimpleName();
    
    private Context mContext;
    
    public TeamEntryVM(Context context) {
        mContext = context;
    }
    
    public final String getCurrentDate() {
        return DateTimeUtility.getCurrentDate();
    }
    
    public String validateFields(List<EditText> listOfEditText) {
        if (checkIfListIsValid(listOfEditText)) {
            if (TextUtils.isEmpty(listOfEditText.get(EditTextIndexing.EVENT_NAME).getText()))
                return mContext.getString(R.string.error_empty_event_name);
            if (TextUtils.isEmpty(listOfEditText.get(EditTextIndexing.FIRST_TEAM).getText()))
                return mContext.getString(R.string.error_empty_first_team);
            if (TextUtils.isEmpty(listOfEditText.get(EditTextIndexing.SECOND_TEAM).getText()))
                return mContext.getString(R.string.error_empty_second_team);
            return null;
        } else {
            LogUtility.logError(TAG, "Empty list or Not initialized properly!");
        }
        return "";
    }

    public void saveEventNameInSession(final String eventName) {
        AppSession.getInstance().setEventName(eventName);
    }

    public boolean saveTeams (String ... teams) {
        if (teams != null && teams.length > 0 && teams.length < 3) {
            String [] teamsArray = AppSession.getInstance().getTeamNames();
            for (int a =0; a < teams.length; a++)
                teamsArray[a] = teams[a];

            return true;
        } else
            LogUtility.logError(TAG, "Teams are not initialized properly or Number of teams are illegal!");
        return false;
    }

    public static final class EditTextIndexing {
        public static final int EVENT_NAME = 0;
        public static final int FIRST_TEAM = 1;
        public static final int SECOND_TEAM = 2;
    }
    
    public static final class TextViewIndexing {
        public static final int MAIN_HEADING = 0;
        public static final int DATE_TIME = 1;
    }
}

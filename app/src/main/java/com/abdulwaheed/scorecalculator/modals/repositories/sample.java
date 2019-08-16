package com.abdulwaheed.scorecalculator.modals.repositories;

import android.content.Context;

import androidx.room.Room;

public class sample {

    public void getDBInstance(Context context) {
        com.abdulwaheed.scorecalculator.modals.db.ScoreCalculatorDB db = Room.databaseBuilder(context,
                com.abdulwaheed.scorecalculator.modals.db.ScoreCalculatorDB.class, "database-name").build();
    }


}

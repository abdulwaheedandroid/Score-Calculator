package com.abdulwaheed.scorecalculator.modals.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.abdulwaheed.scorecalculator.modals.db.daos.TeamDao;
import com.abdulwaheed.scorecalculator.modals.db.entities.TeamsEntity;

@Database(entities =  {TeamsEntity.class}, version = 1)
public abstract class ScoreCalculatorDB extends RoomDatabase {

    public abstract TeamDao teamDao();

}

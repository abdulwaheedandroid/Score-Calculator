package com.abdulwaheed.scorecalculator.modals.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "teams")
public class TeamsEntity {

    @PrimaryKey
    @ColumnInfo(name = "team_id")
    public int teamID;

    @ColumnInfo(name = "team_name")
    public String teamName;

}

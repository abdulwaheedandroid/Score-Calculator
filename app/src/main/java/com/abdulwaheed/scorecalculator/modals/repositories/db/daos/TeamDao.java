package com.abdulwaheed.scorecalculator.modals.db.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.abdulwaheed.scorecalculator.modals.db.entities.TeamsEntity;

import java.util.List;

/*
* DAO class will have all CRUD operations for Team Entity/Table
* */

@Dao
public interface TeamDao {

    @Query("SELECT * FROM teams")
    List<TeamsEntity> getAllTeams();

    @Query("SELECT * FROM teams WHERE team_name LIKE :teamName")
    TeamsEntity getTeamByName(String teamName);

    @Insert
    void insertAll(TeamsEntity... teamsEntities);

    @Delete
    void deleteTeam(TeamsEntity currentTeam);

}

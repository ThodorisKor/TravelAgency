package com.example.travelagency.AboutDatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface mydao {
    @Insert
    public void addAgency(Agency agency);
    @Insert
    public void addTrip(Trip trip);
    @Insert
    public void addPackage(Package packag);

    @Query("select * from Agency")
    public List<Agency> getAgency();
    @Query("select * from Trip")
    public List<Trip> getTrip();
    @Query("select * from Package")
    public List<Package> getPackage();

    @Delete
    public void deleteAgency(Agency agency);
    @Delete
    public void deleteTrip(Trip trip);
    @Delete
    public void deletePackage(Package packag);

    @Update
    public void updateAgency(Agency agency);
    @Update
    public void updateTrip(Trip trip);
    @Update
    public void updatePackage(Package packag);

}

package com.erkanterzioglu.mapsjava.roomdb;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Delete;
import androidx.room.Query;


import com.erkanterzioglu.mapsjava.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Completable;

@Dao
public interface PlaceDao {

    @Query("SELECT * FROM Place")
    Flowable <List<Place>> getAll();

    @Insert
    Completable insert(Place place);


    @Delete
    Completable delete(Place place);



}

package com.example.projectsharedpref

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface MyDAO {

    @Insert
    fun saveData(entity: MyEntity)

    @Query("select * from MyEntity")
    fun showData() : List<MyEntity>
}
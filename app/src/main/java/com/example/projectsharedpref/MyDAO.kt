package com.example.projectsharedpref

import androidx.room.Insert
import androidx.room.Query

interface MyDAO {

    @Insert
    fun saveData(entity: MyEntity)

    @Query("select * from MyEntity")
    fun showData() : List<MyEntity>
}
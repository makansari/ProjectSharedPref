package com.example.projectsharedpref

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class MyEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_tb")  // if I have to have a differnt name for my column
    var myid: Int = 0

    @ColumnInfo(name = "name_tb")
    var myname : String = ""

    @ColumnInfo(name = "email")
    var myemail : String = ""

    @ColumnInfo(name="phone")
    var myphone : Int = 0

}
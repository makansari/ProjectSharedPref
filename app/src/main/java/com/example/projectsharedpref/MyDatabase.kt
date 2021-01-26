package com.example.projectsharedpref

import androidx.room.Database


@Database (entities = [MyEntity::class],version = 1 )
 abstract class MyDatabase {

     abstract fun mydaofunction() : MyDAO
}
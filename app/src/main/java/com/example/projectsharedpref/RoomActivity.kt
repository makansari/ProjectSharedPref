package com.example.projectsharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.android.synthetic.main.activity_room.*

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        var db = Room.databaseBuilder(this,MyDatabase::class.java,"user_database")
                .build()

        buttonSave.setOnClickListener {
            var name = editTextName.text.toString()
            var email = editTextEmail.text.toString()
            var phone = Integer.parseInt(editTextPhoneNumber.text.toString())

            Thread{

                var users = MyEntity()

                users.myname = name
                users.myemail = email
                users.myphone = phone

                db.mydaofunction().saveData(users)

                runOnUiThread {

                    editTextName.setText("")
                    editTextEmail.setText("")
                    editTextPhoneNumber.setText("")
                }
            }.start()


        }
        buttonShow.setOnClickListener {


            Thread{
                db.mydaofunction().showData().forEach {
                    runOnUiThread {
                        var result = " Email is ${it.myemail} , name is ${it.myname} and phone number is : ${it.myphone}"
                        Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
                    }
                }
            }.start()
        }
    }
}
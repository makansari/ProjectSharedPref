package com.example.projectsharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_room.*

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        buttonSave.setOnClickListener {
            var myname = editTextName.text.toString()
            var myemail = editTextEmail.text.toString()
            var myphone = editTextPhoneNumber.text.toString()


        }
        buttonShow.setOnClickListener {

        }
    }
}
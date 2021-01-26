package com.example.projectsharedpref

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mycheckbox : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycheckbox = findViewById(R.id.checkBox)
        var sharedPref = getSharedPreferences("myfilename5", Context.MODE_PRIVATE)
        editTextUsername.setText(sharedPref.getString("keyusername",""))


        buttonLogin.setOnClickListener {
            var username = editTextUsername.text.toString()
            var editor : SharedPreferences.Editor = sharedPref.edit()

            if(mycheckbox.isChecked){
                editor.putString("keyusername",username)
                editor.commit()
            }
            else
            {
                editor.remove("keyusername").commit()
            }


            textViewResult.setText(username)

            editTextUsername.setText("")

        }
    }
}
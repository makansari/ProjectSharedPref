package com.example.projectsharedpref

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedPref = getSharedPreferences("myfilename", Context.MODE_PRIVATE)
      editTextUsername.setText(sharedPref.getString("keyusername",""))


        buttonLogin.setOnClickListener {
               var username = editTextUsername.text.toString()
                var editor : SharedPreferences.Editor = sharedPref.edit()
                editor.putString("keyusername",username)
                editor.commit()
            }
    }
}
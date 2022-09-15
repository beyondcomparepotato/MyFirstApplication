package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        Log.d("MyLogMAct", "onCreated")
    }

    fun onClickTest(view: View) {
        val text = findViewById<TextView>(R.id.textView)
        text.text = "Android Developer :)\n" +
                "- Kotlin\n" +
                "- Git & Github\n" +
                "- Firebase\n" +
                "- OOP\n" +
                "- Agile\n"
    }
}
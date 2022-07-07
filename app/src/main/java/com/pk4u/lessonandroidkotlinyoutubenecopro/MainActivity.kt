package com.pk4u.lessonandroidkotlinyoutubenecopro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(view: View) {
        val ptMessage = findViewById<EditText>(R.id.ptMessage)
        val intent = Intent (this,SecondActivity::class.java).apply {
            putExtra("privet",ptMessage.text)
        }
        startActivity(intent)
    }
}
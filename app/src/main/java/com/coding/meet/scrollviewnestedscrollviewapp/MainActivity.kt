package com.coding.meet.scrollviewnestedscrollviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val verticalScrollBtn = findViewById<Button>(R.id.verticalScrollBtn)
        verticalScrollBtn.setOnClickListener {
            startActivity(Intent(this,VerticalScrollViewActivity::class.java))
        }

        val horizontalScrollBtn = findViewById<Button>(R.id.horizontalScrollBtn)
        horizontalScrollBtn.setOnClickListener {
            startActivity(Intent(this,HorizontalScrollViewActivity::class.java))
        }
    }
}
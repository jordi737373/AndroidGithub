package com.rams.jordi.androidgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var text:TextView
    private lateinit var btn:Button
    private lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text=findViewById(R.id.textView)
        image=findViewById(R.id.imageView)
        btn=findViewById(R.id.button)

    }
}
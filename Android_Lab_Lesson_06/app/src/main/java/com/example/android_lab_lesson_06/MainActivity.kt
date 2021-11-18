package com.example.android_lab_lesson_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// This application designs a layout and uses themes and styles
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // When the courses tab is clicked the text is displayed
    fun display(view: View){
        info.text="Android Application Development ,Android Security Essentials and Monetize Android Applications"
    }
}
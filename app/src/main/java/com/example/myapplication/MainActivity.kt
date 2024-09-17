package com.example.myapplication;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFrameAnimation = findViewById<Button>(R.id.button_frame_animation)
        buttonFrameAnimation.setOnClickListener { v: View? ->
            val intent =
                Intent(
                    this@MainActivity,
                    SecondActivity::class.java
                )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val buttonTweenAnimation = findViewById<Button>(R.id.button_tween_animation)
        buttonTweenAnimation.setOnClickListener { v: View? ->
            val intent =
                Intent(
                    this@MainActivity,
                    ThirdActivity::class.java
                )
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}
package com.childgame.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ActivityTask8 : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task8)

        val taskView : ImageView = findViewById(R.id.task_view)

        val winButton : ImageButton = findViewById(R.id.button_4)


        winButton.setOnClickListener {

            winButton.setImageResource(R.drawable.salut)

            taskView.setImageResource(R.drawable.strawberry)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

            winButton.setBackgroundColor(R.color.green)


        }

        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask88 = Intent(this, ActivityTask1::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask88)

        }

        val prevButton : ImageButton = findViewById(R.id.start_button)

        val intentTask8 = Intent(this, ActivityTask7::class.java)

        prevButton.setOnClickListener {

            startActivity(intentTask8)

        }

        val falseButton1 : ImageButton = findViewById(R.id.button_1)

        falseButton1.setOnClickListener {

            falseButton1.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.strawberry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val falseButton2 : ImageButton = findViewById(R.id.button_2)

        falseButton2.setOnClickListener {

            falseButton2.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.strawberry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val falseButton3 : ImageButton = findViewById(R.id.button_3)

        falseButton3.setOnClickListener {

            falseButton3.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.strawberry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

    }
}
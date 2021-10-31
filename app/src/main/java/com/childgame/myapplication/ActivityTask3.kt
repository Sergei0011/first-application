package com.childgame.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ActivityTask3 : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        val taskView : ImageView = findViewById(R.id.task_view)

        val winButton : ImageButton = findViewById(R.id.button_1)


        winButton.setOnClickListener {

            winButton.setImageResource(R.drawable.salut)

            taskView.setImageResource(R.drawable.cherry)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask33 = Intent(this, ActivityTask4::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask33)

        }

        val prevButton : ImageButton = findViewById(R.id.start_button)

        val intentTask3 = Intent(this, ActivityTask2::class.java)

        prevButton.setOnClickListener {

            startActivity(intentTask3)

        }

        val falseButton1 : ImageButton = findViewById(R.id.button_2)

        falseButton1.setOnClickListener {

            falseButton1.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.cherry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val falseButton2 : ImageButton = findViewById(R.id.button_4)

        falseButton2.setOnClickListener {

            falseButton2.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.cherry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

        val falseButton3 : ImageButton = findViewById(R.id.button_3)

        falseButton3.setOnClickListener {

            falseButton3.setImageResource(R.drawable.sad_smile)

            taskView.setImageResource(R.drawable.cherry_black)

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

        }

    }
}
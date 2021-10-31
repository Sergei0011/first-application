package com.childgame.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.ImageView
import com.childgame.myapplication.R.color

class ActivityTask1 : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)

        val taskView : ImageView = findViewById(R.id.task_view)

        val winButton : ImageButton = findViewById(R.id.button_4)


        winButton.setOnClickListener {

            taskView.animate().apply {
                duration = 1000
                rotationYBy(360f)
                start()
            }

            winButton.setBackgroundColor(color.green)


        }


        val nextButton: ImageButton = findViewById(R.id.end_button)

        val intentTask1 = Intent(this, ActivityTask2::class.java)

        nextButton.setOnClickListener {

            startActivity(intentTask1)

        }

        val falseButton1 : ImageButton = findViewById(R.id.button_1)

        falseButton1.setOnClickListener {

            falseButton1.setBackgroundColor(color.red)

        }

        val falseButton2 : ImageButton = findViewById(R.id.button_2)

        falseButton2.setOnClickListener {

            falseButton2.setBackgroundColor(color.red)

        }

        val falseButton3 : ImageButton = findViewById(R.id.button_3)

        falseButton3.setOnClickListener {

            falseButton3.setBackgroundColor(color.red)

        }


    }
}


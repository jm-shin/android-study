package com.android.study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // click event
        val image1 = findViewById<ImageView>(R.id.dog_image1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dog1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.dog_image2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dog2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.dog_image3)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dog3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.dog_image4)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Dog4Activity::class.java)
            startActivity(intent)
        }
    }
}
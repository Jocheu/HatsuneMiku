package com.example.hatsunemiku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addLikeBtn = findViewById<Button>(R.id.Like)
        val unAddLikebTN = findViewById<Button>(R.id.Delete)
        val likeCounter = findViewById<TextView>(R.id.counter)
        var likes = 0

        addLikeBtn.setOnClickListener {
            likes++
            likeCounter.text = likes.toString() + " polubień"
        }
        unAddLikebTN.setOnClickListener {
            if(likes>0) {
                likes--
                likeCounter.text = likes.toString() + " polubień"
            }
        }
    }
}
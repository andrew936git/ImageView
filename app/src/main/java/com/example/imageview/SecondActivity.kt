package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {


    private var imageViewIV: ImageView? = null

    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        init()
    }

    private fun init(){
        imageViewIV = findViewById(R.id.imageViewIV)
        imageViewIV!!.setImageResource(R.drawable.kotiki1)
        val list: List<Int> = listOf(R.drawable.kotiki2, R.drawable.kotiki3,
            R.drawable.kotiki4, R.drawable.kotiki5)
        var count = 0
        nextButton = findViewById(R.id.nextButton)
        nextButton.setOnClickListener{
           if (count < list.size){
                imageViewIV!!.setImageResource(list[count])
                count++
            }
            else {
               val intent = Intent(this, ThirdActivity::class.java)
               startActivity(intent)
           }
        }
    }
}
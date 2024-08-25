package com.example.imageview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ThirdActivity : AppCompatActivity() {

    private lateinit var toolbarThird: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        init()
    }

    private fun init(){
        toolbarThird =  findViewById(R.id.toolbarThird)
        setSupportActionBar(toolbarThird)
        title = "Альбом фотографий"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.third_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.third_menu_exit -> {
                finishAffinity()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
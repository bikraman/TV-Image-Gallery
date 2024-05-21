package com.beniezsche.tvimagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.adapter.ImageAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val galleryGrid = findViewById<RecyclerView>(R.id.galleryGrid).apply {
            this.layoutManager = GridLayoutManager(this@MainActivity, 3)
            this.adapter = ImageAdapter()
        }


    }
}
package com.beniezsche.tvimagegallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.adapter.ImageAdapter


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[ImageViewModel::class.java]

        val imageAdapter = ImageAdapter()

        val galleryGrid = findViewById<RecyclerView>(R.id.galleryGrid).apply {
            this.layoutManager = GridLayoutManager(this@MainActivity, 3)
            this.adapter = imageAdapter
        }

        viewModel.getImages().observe(this, Observer {

        })


    }
}
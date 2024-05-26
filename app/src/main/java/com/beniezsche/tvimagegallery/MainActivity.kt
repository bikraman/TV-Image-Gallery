package com.beniezsche.tvimagegallery

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.adapters.ImageAdapter
import com.beniezsche.tvimagegallery.viewmodels.ImageViewModel
import com.rubensousa.dpadrecyclerview.DpadRecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[ImageViewModel::class.java]

        val imageAdapter = ImageAdapter()

        val galleryGrid = findViewById<DpadRecyclerView>(R.id.galleryGrid)
        galleryGrid.setSpanCount(5)

        galleryGrid.adapter = imageAdapter

        viewModel.getImages().observe(this, Observer {
            imageAdapter.imageList.clear()
            imageAdapter.imageList.addAll(it)
            imageAdapter.notifyDataSetChanged()
        })

    }
}
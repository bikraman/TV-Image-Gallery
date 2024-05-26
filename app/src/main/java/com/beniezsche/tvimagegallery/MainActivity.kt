package com.beniezsche.tvimagegallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.adapters.ImageAdapter
import com.beniezsche.tvimagegallery.viewmodels.ImageViewModel
import com.rubensousa.dpadrecyclerview.DpadRecyclerView


class MainActivity : AppCompatActivity() {


    lateinit var galleryGrid: DpadRecyclerView
    private var lastPositionOfClick = RecyclerView.NO_POSITION
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewModel = ViewModelProvider(this)[ImageViewModel::class.java]

        val imageAdapter = ImageAdapter()

        galleryGrid = findViewById(R.id.galleryGrid)
        galleryGrid.setSpanCount(5)

        galleryGrid.adapter = imageAdapter

        imageViewModel.getImages().observe(this, Observer {
            imageAdapter.imageList.clear()
            imageAdapter.imageList.addAll(it)
            imageAdapter.notifyDataSetChanged()
        })

        imageAdapter.onItemClickListener = object : ImageAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                lastPositionOfClick = position
            }
        }

    }

    override fun onResume() {
        super.onResume()
        galleryGrid.scrollToPosition(lastPositionOfClick)
        lastPositionOfClick = RecyclerView.NO_POSITION
    }
}
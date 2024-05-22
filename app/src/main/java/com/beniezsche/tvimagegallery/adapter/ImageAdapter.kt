package com.beniezsche.tvimagegallery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.R
import com.beniezsche.tvimagegallery.models.Image

class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    val imageList = ArrayList<Image>()

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        val image = itemView.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 2;
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {


    }
}
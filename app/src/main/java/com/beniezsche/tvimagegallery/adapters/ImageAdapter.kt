package com.beniezsche.tvimagegallery.adapters

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.R
import com.beniezsche.tvimagegallery.SingleImageActivity
import com.beniezsche.tvimagegallery.models.Image
import com.bumptech.glide.Glide


class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    val imageList = ArrayList<Image>()
    var lastPosition = RecyclerView.NO_POSITION;

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.image)

        init {
            itemView.rootView.setOnClickListener {
                val intent = Intent(it.context, SingleImageActivity::class.java)
                intent.putExtra("url", imageList[bindingAdapterPosition].src)
                lastPosition = bindingAdapterPosition
                it.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size;
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {

        Glide.with(holder.itemView.context).load(imageList[position].src).placeholder(R.drawable.placeholder).into(holder.imageView)

        if (position == lastPosition) {
            holder.itemView.requestFocus()
        }
    }
}
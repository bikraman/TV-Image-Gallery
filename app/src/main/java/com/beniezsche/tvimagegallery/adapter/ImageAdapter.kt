package com.beniezsche.tvimagegallery.adapter

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.Nullable
import androidx.recyclerview.widget.RecyclerView
import com.beniezsche.tvimagegallery.R
import com.beniezsche.tvimagegallery.models.Image
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition


class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    var imageList = ArrayList<Image>()

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size;
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        //Glide.with(holder.itemView.context).load(imageList[position].src).into(holder.imageView)

        Glide.with(holder.itemView.context)
            .asBitmap()
            .load(imageList[position].src)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(object : CustomTarget<Bitmap?>() {
                override fun onResourceReady(
                    resource: Bitmap,
                    @Nullable transition: Transition<in Bitmap?>?
                ) {
                    holder.imageView.setImageBitmap(resource)
                    holder.imageView.buildDrawingCache()
                }

                override fun onLoadCleared(@Nullable placeholder: Drawable?) {}
            })
    }
}
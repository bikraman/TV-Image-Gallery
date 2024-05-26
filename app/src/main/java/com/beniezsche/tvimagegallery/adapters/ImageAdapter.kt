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

    var imageList = ArrayList<Image>()

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.image)

        init {

            itemView.rootView.setOnClickListener {
                val intent = Intent(it.context, SingleImageActivity::class.java)
                intent.putExtra("url", imageList[adapterPosition].src)
                it.context.startActivity(intent)
            }

            itemView.rootView.setOnFocusChangeListener { v, hasFocus ->
                if (hasFocus) {
//                    Log.d("TV", hasFocus.toString())
                    imageList[adapterPosition].hasFocus = true
                }
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

        if (imageList[position].hasFocus) {
            holder.itemView.requestFocus()
        }
//        Glide.with(holder.itemView.context)
//            .asBitmap()
//            .load(imageList[position].src)
//            .diskCacheStrategy(DiskCacheStrategy.ALL)
//            .into(object : CustomTarget<Bitmap?>() {
//                override fun onResourceReady(
//                    resource: Bitmap,
//                    @Nullable transition: Transition<in Bitmap?>?
//                ) {
//                    holder.imageView.setImageBitmap(resource)
//                    holder.imageView.buildDrawingCache()
//                }
//
//                override fun onLoadCleared(@Nullable placeholder: Drawable?) {}
//            })
    }
}
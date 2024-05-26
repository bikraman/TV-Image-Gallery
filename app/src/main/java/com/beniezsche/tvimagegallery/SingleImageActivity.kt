package com.beniezsche.tvimagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class SingleImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_image)

        val url = intent.getStringExtra("url")

        Glide.with(this).load(url).placeholder(R.drawable.placeholder).into(findViewById(R.id.image))
    }
}
package com.beniezsche.tvimagegallery.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.beniezsche.tvimagegallery.data.ImageData
import com.beniezsche.tvimagegallery.models.Image


/**
 * This is the image viewmodel class which fetches the list of images to be shown and exposes
 * it to a view after doing necessary processing
 **/
class ImageViewModel : ViewModel() {

    fun getImages(): LiveData<List<Image>> {

        val data = MutableLiveData<List<Image>>()

        data.value = ImageData.getImages().map {
            Image(it.removeRange(4,5))
        }

        return data
    }
}
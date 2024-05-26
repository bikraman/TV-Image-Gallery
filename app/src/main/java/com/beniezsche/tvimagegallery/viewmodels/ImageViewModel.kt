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

        data.value = ImageData.getImages().map { url ->
            Image(url.removeRange(4,5)) //This is done to remove the s from https because there's some issue with using the https version of the url
        }

        return data
    }
}
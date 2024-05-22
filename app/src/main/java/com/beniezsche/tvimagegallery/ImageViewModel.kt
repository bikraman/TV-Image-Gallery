package com.beniezsche.tvimagegallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.beniezsche.tvimagegallery.models.Image

class ImageViewModel : ViewModel() {

    fun getImages(): LiveData<List<Image>> {

        val data = MutableLiveData<List<Image>>()

        data.value =

        return data

    }
}
package com.remych04.dtf.base.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CustomLiveData<T> {
    val mutableLiveData: MutableLiveData<T> = MutableLiveData()
    val liveData: LiveData<T> = mutableLiveData
}
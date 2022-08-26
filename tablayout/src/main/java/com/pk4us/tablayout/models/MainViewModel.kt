package com.pk4us.tablayout.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val plant = MutableLiveData<PlantModel>()

}
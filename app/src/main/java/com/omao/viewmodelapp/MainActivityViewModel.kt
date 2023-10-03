package com.omao.viewmodelapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNumber: Int): ViewModel() {

    private var counter = 0

    init {
        counter = startingNumber
    }

    fun getCurrentCount(): Int {
        return  counter
    }

    fun getUpdatedCount(): Int {
        return ++counter
    }

}
package com.example.viewmodelexample

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var num=0
    fun addNo(){
        num++
    }
}
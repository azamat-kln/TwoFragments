package com.example.twofragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    val number: LiveData<Int>
        get() = _number

    private val _number = MutableLiveData<Int>()

    init {
        _number.value = 15
    }

    fun increment() {
        _number.value = number.value?.plus(1)
    }
}
package com.kaveri.livedatawithviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.Int as Int

class ActivityMainViewModel : ViewModel() {

    private var count = MutableLiveData<Int>()
    val countData : LiveData<Int>
        get() = count

    init {
        count.value = 0
    }

    fun updateCount() {
        count.value = count.value?.plus(1)
    }
}
package com.example.carfaxtechnicalassignment.viewmodels

import android.app.Application
import androidx.lifecycle.*
import com.example.carfaxtechnicalassignment.model.ListingsItem
import com.example.carfaxtechnicalassignment.repository.CarRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class RecyclerCarViewModel(app: Application): AndroidViewModel(app), CoroutineScope {
    private val _itemSelected = MutableLiveData<ListingsItem?>()
    var itemDataSelected: ListingsItem? = null

    private val _listState = MutableLiveData<MutableList<ListingsItem>>()
    var listState: LiveData<MutableList<ListingsItem>> = _listState

    private val _progressState = MutableLiveData<Boolean>()
    var progressState: LiveData<Boolean> = _progressState

    private val repository = CarRepository()
    lateinit var observerOnCategorySelected: Observer<ListingsItem>

    private val viewModelJob = Job()
    override val coroutineContext: CoroutineContext
        get() = viewModelJob + Dispatchers.Default

    init{
        initObserver()
    }

    private fun initObserver() {
        observerOnCategorySelected = Observer { value ->
            value.let {
                _itemSelected.value = it

            }
        }
    }
    fun clearSelection(){
        _itemSelected.value = null
    }
    fun setItemSelection(item: ListingsItem){
        itemDataSelected = item

    }

    fun fetchCarData(){
        _progressState.value = true
        viewModelScope.launch {
            val response = repository.getCar()
            response?.body()?.listings.let { list ->
                _listState.value = list

            }
        }
    }

    // clean memory leak
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}
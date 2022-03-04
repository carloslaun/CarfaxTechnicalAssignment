package com.example.carfaxtechnicalassignment.repository

import com.example.carfaxtechnicalassignment.services.RetrofitClient
import com.example.carfaxtechnicalassignment.services.WebService

class CarRepository{
    private var apiService: WebService? = null

    init{
        apiService = RetrofitClient.getClient?.create(WebService::class.java)
    }


    suspend fun getCar() = apiService?.getCars()

}
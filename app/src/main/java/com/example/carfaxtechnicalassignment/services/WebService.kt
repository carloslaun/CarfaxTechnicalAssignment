package com.example.carfaxtechnicalassignment.services

import com.example.carfaxtechnicalassignment.model.CarResponse
import retrofit2.Response
import retrofit2.http.GET

interface WebService {
    @GET("assignment.json")

    suspend fun getCars(): Response<CarResponse>

}
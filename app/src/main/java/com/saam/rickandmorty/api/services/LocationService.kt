package com.saam.rickandmorty.api.services

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LocationService {
    @GET("location/")
    fun getLocations(@Query("page") pageNum: Int?)

    @GET("location/{id}")
    fun getLocation(@Path("id") characterId: Int)
}
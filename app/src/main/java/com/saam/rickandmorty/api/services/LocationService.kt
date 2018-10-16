package com.saam.rickandmorty.api.services

import com.saam.rickandmorty.api.models.Location
import com.saam.rickandmorty.api.models.LocationList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LocationService {
    @GET("location/")
    fun getLocations(@Query("page") pageNum: Int?): LocationList

    @GET("location/{id}")
    fun getLocation(@Path("id") characterId: Int): Location
}
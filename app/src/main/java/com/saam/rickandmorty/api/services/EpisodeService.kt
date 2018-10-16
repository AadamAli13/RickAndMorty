package com.saam.rickandmorty.api.services

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EpisodeService {
    @GET("episode/")
    fun getEpisodes(@Query("page") pageNum: Int?)

    @GET("episode/{id}")
    fun getEpisode(@Path("id") characterId: Int)
}
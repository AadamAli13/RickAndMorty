package com.saam.rickandmorty.api.services

import com.saam.rickandmorty.api.models.Episode
import com.saam.rickandmorty.api.models.EpisodeList
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EpisodeService {
    @GET("episode/")
    fun getEpisodes(@Query("page") pageNum: Int?): Single<EpisodeList>

    @GET("episode/{id}")
    fun getEpisode(@Path("id") characterId: Int): Single<Episode>
}
package com.saam.rickandmorty.api.services

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersService {
    @GET("character/")
    fun getCharacters(@Query("page") pageNum: Int?)

    @GET("character/{id}")
    fun getCharacter(@Path("id") characterId: Int)
}
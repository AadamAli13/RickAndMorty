package com.saam.rickandmorty.api.services

import com.saam.rickandmorty.api.models.Character
import com.saam.rickandmorty.api.models.CharacterList
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersService {
    @GET("character/")
    fun getCharacters(@Query("page") pageNum: Int?): Single<CharacterList>

    @GET("character/{id}")
    fun getCharacter(@Path("id") characterId: Int): Single<Character>
}
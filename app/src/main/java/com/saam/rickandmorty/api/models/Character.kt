package com.saam.rickandmorty.api.models

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class Character(
    val id: Int,
    val name: Int,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: BasicLocation,
    val image: String,
    val episodes: List<String>,
    val url: String,
    val created: String
)
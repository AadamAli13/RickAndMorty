package com.saam.rickandmorty.api.models

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class EpisodeListList(
        val info: Info,
        val results: List<Episode>
)
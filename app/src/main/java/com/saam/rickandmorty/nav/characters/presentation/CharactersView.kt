package com.saam.rickandmorty.nav.characters.presentation

import com.saam.rickandmorty.util.views.MessageView
import com.saam.rickandmorty.util.views.LoadingView

interface CharactersView: LoadingView, MessageView {
    fun getCharacters()
}
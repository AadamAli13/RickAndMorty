package com.saam.rickandmorty.nav.characters.presentation

import com.saam.rickandmorty.api.services.CharactersService
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.launch
import javax.inject.Inject

class CharactersPresenter @Inject constructor(
    private val view: CharactersView,
    private val charactersService: CharactersService
) {
    fun loginWithPassword(username: String, password: String) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                view.showLoading()
            } catch (ex: Exception) {
                ex.message.let {
                    if (it != null)
                        view.showMessage(it)
                    else
                        view.showGenericErrorMessage()
                }
            } finally {
                view.hideLoading()
            }
        }
    }
}
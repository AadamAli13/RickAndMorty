package com.saam.rickandmorty.nav.characters.di

import androidx.lifecycle.Lifecycle
import com.saam.rickandmorty.nav.characters.presentation.CharactersView
import com.saam.rickandmorty.nav.characters.ui.CharactersFragment
import com.saam.rickandmorty.core.scope.FragmentScope
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.experimental.Job

@Module
class CharactersFragmentModule {
    @FragmentScope
    @Provides
    fun providesLoginView(charactersFrag: CharactersFragment): CharactersView = charactersFrag

    @FragmentScope
    @Provides
    fun providesJob(): Job = Job()

    @FragmentScope
    @Provides
    fun providesLifecycle(fragment: CharactersFragment): Lifecycle = fragment.lifecycle
}

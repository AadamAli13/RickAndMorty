package com.saam.rickandmorty.nav.characters.di

import com.saam.rickandmorty.nav.characters.ui.CharactersFragment
import com.saam.rickandmorty.core.scope.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CharactersFragmentProvider {
    @FragmentScope
    @ContributesAndroidInjector(modules = [
        CharactersFragmentModule::class
    ])
    abstract fun providesCharactersFragment(): CharactersFragment
}

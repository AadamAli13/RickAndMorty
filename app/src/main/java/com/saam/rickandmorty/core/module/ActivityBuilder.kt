package com.saam.rickandmorty.core.module

import com.saam.rickandmorty.nav.di.NavModule
import com.saam.rickandmorty.nav.characters.di.CharactersFragmentProvider
import com.saam.rickandmorty.nav.ui.NavActivity
import com.saam.rickandmorty.core.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = [
        NavModule::class,
        CharactersFragmentProvider::class
    ])
    abstract fun bindsAuthActivity(): NavActivity
}

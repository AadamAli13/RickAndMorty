package com.saam.rickandmorty.core

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import com.saam.rickandmorty.core.component.DaggerApplicationComponent

class RickAndMortyApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerApplicationComponent.builder().create(this)
}



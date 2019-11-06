package com.remych04.dtf.base.di.viewmodel

import androidx.lifecycle.ViewModelProvider
import com.remych04.dtf.base.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
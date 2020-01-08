package com.remych04.dtf.feature.category.di

import androidx.lifecycle.ViewModel
import com.remych04.dtf.base.di.viewmodel.ViewModelFactoryModule
import com.remych04.dtf.base.di.viewmodel.ViewModelKey
import com.remych04.dtf.feature.category.domain.CategoryViewModel
import com.remych04.dtf.feature.category.view.CategoryFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class CategoryModule {

    @ContributesAndroidInjector(modules = [ViewModelFactoryModule::class])
    internal abstract fun categoryFragment(): CategoryFragment

    @Binds
    @IntoMap
    @ViewModelKey(CategoryViewModel::class)
    internal abstract fun categoryViewModel(viewModel: CategoryViewModel): ViewModel
}
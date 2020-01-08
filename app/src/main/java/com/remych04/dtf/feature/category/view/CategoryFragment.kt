package com.remych04.dtf.feature.category.view

import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.remych04.dtf.databinding.CategoryFragmentBinding
import com.remych04.dtf.feature.category.domain.CategoryViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class CategoryFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<CategoryViewModel> { viewModelFactory }

    private lateinit var binding: CategoryFragmentBinding

}
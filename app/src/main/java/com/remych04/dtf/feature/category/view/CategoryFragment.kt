package com.remych04.dtf.feature.category.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.remych04.dtf.databinding.CategoryFragmentBinding

class CategoryFragment : Fragment() {

//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//    private val viewModel by viewModels<CategoryViewModel> { viewModelFactory }

    private lateinit var binding: CategoryFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CategoryFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
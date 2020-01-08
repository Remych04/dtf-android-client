package com.remych04.dtf.feature.newslist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.remych04.dtf.base.DaggerFragment
import com.remych04.dtf.databinding.NewsListFragmentBinding
import com.remych04.dtf.feature.newslist.domain.NewsListViewModel
import javax.inject.Inject

class NewsListFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<NewsListViewModel> { viewModelFactory }

    private lateinit var binding: NewsListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewsListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}

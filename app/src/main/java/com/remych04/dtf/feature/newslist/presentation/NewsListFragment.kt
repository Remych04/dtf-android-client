package com.remych04.dtf.feature.newslist.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.remych04.dtf.base.ext.viewLifecycle
import com.remych04.dtf.databinding.NewsListFragmentBinding
import com.remych04.dtf.feature.newslist.data.models.NewsList
import com.remych04.dtf.feature.newslist.presentation.adapter.NewsListAdapter
import org.koin.android.viewmodel.ext.android.viewModel
import timber.log.Timber

class NewsListFragment : Fragment() {

    private val newsListViewModel: NewsListViewModel by viewModel()
    private var binding: NewsListFragmentBinding by viewLifecycle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewsListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val newslistAdapter = NewsListAdapter()
        binding.newsListRecycler.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = newslistAdapter
        }
        newsListViewModel.getLiveData().observe(viewLifecycleOwner, Observer { state ->
            if (state.inProgress) {
                Timber.d("asd123 ПРОГРЕСС")
            } else if (state.success != null) {
                newslistAdapter.setData(state.success as List<NewsList>)
            }
        })
    }
}

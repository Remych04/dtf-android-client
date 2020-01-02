package com.remych04.dtf.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.remych04.dtf.R

class NewsListFragment : Fragment() {

    companion object {
        fun newInstance() = NewsListFragment()
    }

    private lateinit var viewModel: NewsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NewsListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

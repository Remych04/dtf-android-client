package com.remych04.dtf.feature.newslist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.remych04.dtf.base.utils.CustomLiveData
import com.remych04.dtf.base.utils.State
import com.remych04.dtf.feature.newslist.data.models.NewsList
import com.remych04.dtf.feature.newslist.domain.NewsListCommand
import kotlinx.coroutines.launch


class NewsListViewModel(private val newsListCommand: NewsListCommand) : ViewModel() {

    private val customLiveData = CustomLiveData<State<List<NewsList>>>()
    private val state = State<List<NewsList>>()

    init {
        loadNewsList()
    }

    fun getLiveData(): LiveData<State<List<NewsList>>> {
        return customLiveData.liveData
    }

    private fun loadNewsList() {
        viewModelScope.launch {
            customLiveData.mutableLiveData.value = state.also { it.inProgress = true }
            val response = newsListCommand.execute()
            customLiveData.mutableLiveData.value = state.also { state ->
                state.inProgress = false
                state.success = response.newsList
            }
        }
    }
}

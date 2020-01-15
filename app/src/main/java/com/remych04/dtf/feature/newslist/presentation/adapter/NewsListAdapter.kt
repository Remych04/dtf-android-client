package com.remych04.dtf.feature.newslist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.remych04.dtf.databinding.NewsItemBinding
import com.remych04.dtf.feature.newslist.data.models.NewsList

class NewsListAdapter(var newsList: List<NewsList> = emptyList()) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = NewsItemBinding.inflate(inflater, parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount() = newsList.size

    fun setData(newsList: List<NewsList>) {
        this.newsList = newsList
        notifyDataSetChanged()
    }
}
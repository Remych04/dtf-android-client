package com.remych04.dtf.feature.newslist.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.remych04.dtf.databinding.NewsItemBinding
import com.remych04.dtf.feature.newslist.data.models.NewsList

class NewsViewHolder(private val binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(newsList: NewsList) {
        binding.itemText.text = newsList.title
    }
}
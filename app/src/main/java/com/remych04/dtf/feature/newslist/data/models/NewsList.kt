package com.remych04.dtf.feature.newslist.data.models

import com.squareup.moshi.Json

data class NewsList(
    @field:Json(name = "id") val id: Long,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "webviewUrl") val webViewUrl: String,
    @field:Json(name = "author") val author: Author,
    @field:Json(name = "intro") val intro: String
)
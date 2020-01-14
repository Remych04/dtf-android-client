package com.remych04.dtf.feature.newslist.data.models

import com.squareup.moshi.Json

data class Author(
    @field:Json(name = "id") val id: Long,
    @field:Json(name = "created") val created: Long,
    @field:Json(name = "first_name") val firstName: String,
    @field:Json(name = "last_name") val lastName: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "gender") val gender: Int,
    @field:Json(name = "url") val url: String,
    @field:Json(name = "avatar_url") val avatarUrl: String,
    @field:Json(name = "karma") val karma: String
)
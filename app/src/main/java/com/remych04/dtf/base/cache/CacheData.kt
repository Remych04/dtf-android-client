package com.remych04.dtf.base.cache

class CacheData<T>(
    val cacheData: T
) {
    val creationDate = System.currentTimeMillis()
}
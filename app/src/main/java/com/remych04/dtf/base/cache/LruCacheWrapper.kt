package com.remych04.dtf.base.cache

import androidx.collection.LruCache


class LruCacheWrapper<T> (
    private val lruCache: LruCache<String, CacheData<T>>
) {

    fun loadData(cacheKey: String, maxTimeInCache: Long): T? {

        val cacheData = lruCache.get(cacheKey) ?: return null

        val dataIsNotExpired = System.currentTimeMillis() - cacheData.creationDate <= maxTimeInCache
        return if (dataIsNotExpired) {
            cacheData.cacheData
        } else {
            lruCache.remove(cacheKey)
            null
        }
    }

    fun saveData(data: T, cacheKey: String) {
        lruCache.put(cacheKey, CacheData(data))
    }

    fun removeData(cacheKey: String) = lruCache.remove(cacheKey) != null

    fun removeAllData() {
        lruCache.evictAll()
    }
}
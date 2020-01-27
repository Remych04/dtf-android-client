package com.remych04.dtf.base.cache

import androidx.collection.LruCache
import java.util.*

private const val DEFAULT_SIZE_CACHE = 16

class CacheManager {
    private val mapWrapper = Collections.synchronizedMap(
        mutableMapOf<Class<*>, LruCacheWrapper<*>>()
    )

    init {
        addWrapper(String::class.java, 1024 * 1024)
        addWrapper(Int::class.java, 1024)
    }

    private fun <T> addWrapper(clazz: Class<T>, maxSize: Int) {
        mapWrapper[clazz] = LruCacheWrapper<T>(LruCache(maxSize))
    }

    suspend fun <T> loadData(resultClass: Class<T>, key: String, memoryCacheTime: Long): T? {
        return getObjectWrapper(resultClass).loadData(key, memoryCacheTime)
    }

    suspend fun <T : Any> saveData(data: T, key: String) {
        getObjectWrapper(data.javaClass).saveData(data, key)
    }

    @Suppress("UNCHECKED_CAST")
    private fun <T> getObjectWrapper(clazz: Class<T>): LruCacheWrapper<T> {
        if (!mapWrapper.containsKey(clazz)) {
            addWrapper(clazz, DEFAULT_SIZE_CACHE)
        }
        return mapWrapper[clazz] as LruCacheWrapper<T>
    }

    suspend fun <T> clearCache(type: Class<T>) {
        mapWrapper[type]?.removeAllData()
    }

    suspend fun <T> clearCache(type: Class<T>, cacheKey: String) {
        mapWrapper[type]?.removeData(cacheKey)
    }

    suspend fun clearAllCache() {
        mapWrapper.entries.forEach { entry ->
            entry.value.removeAllData()
        }
    }
}
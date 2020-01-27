package com.remych04.dtf.base.domain

import com.remych04.dtf.base.cache.CacheManager

abstract class CacheBaseCommand<T>(
    private val resultClass: Class<T>,
    private val cacheManager: CacheManager
) {

    suspend fun execute(): T {
        var result = cacheManager.loadData(resultClass, getCacheKey(), getCacheTime())
        if (result == null) {
            result = run()
            cacheManager.saveData(result as Any, getCacheKey())
        }
        return result
    }

    abstract suspend fun run(): T

    abstract fun getCacheKey(): String

    abstract fun getCacheTime(): Long
}
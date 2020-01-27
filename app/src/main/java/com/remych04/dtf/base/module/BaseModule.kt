package com.remych04.dtf.base.module

import com.remych04.dtf.base.cache.CacheManager
import org.koin.dsl.module

val baseModule = module {
    single { provideCacheManager() }
}

fun provideCacheManager(): CacheManager {
    return CacheManager()
}
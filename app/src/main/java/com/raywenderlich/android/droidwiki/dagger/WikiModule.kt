package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.WikiApi
import com.raywenderlich.android.droidwiki.network.WikiSearchResult
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WikiModule {

    @Provides
    @Singleton
    fun providesHomePage(api: WikiApi)=Homepage(api)

    @Provides
    @Singleton
    fun providesWikiSearchResult(api: WikiApi)=WikiSearchResult(api)
}
package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.WikiSearchResult
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {

    @Provides
    @Singleton
    fun providesHomePagePresenter(homePage:Homepage): HomepagePresenter = HomepagePresenterImpl(homePage)

    @Provides
    @Singleton
    fun providesEntryPresenter(wikiSearchResult: WikiSearchResult): EntryPresenter = EntryPresenterImpl(wikiSearchResult)

}
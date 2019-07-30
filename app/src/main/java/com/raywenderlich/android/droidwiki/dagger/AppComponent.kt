package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    PresenterModule::class,
    NetworkModule::class,
    WikiModule::class
])

interface AppComponent {
    //HomepageActivity class will require injection from AppComponent.
    fun inject(target: HomepageActivity)

    //SearchActivity class will require injections from AppComponent
    fun inject(target: SearchActivity)
}
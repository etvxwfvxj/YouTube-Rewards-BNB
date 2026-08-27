package com.youtuberewards.bnb

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class YouTubeRewardsApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize app-wide configurations
    }
}

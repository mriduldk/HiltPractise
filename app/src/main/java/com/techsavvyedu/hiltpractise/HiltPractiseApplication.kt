package com.techsavvyedu.hiltpractise

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltPractiseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
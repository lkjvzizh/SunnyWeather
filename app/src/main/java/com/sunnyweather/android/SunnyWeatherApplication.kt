package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "6z54gwJ55rUbY1i2"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
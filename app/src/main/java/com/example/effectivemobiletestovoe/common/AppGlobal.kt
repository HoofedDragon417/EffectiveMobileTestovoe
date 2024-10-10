package com.example.effectivemobiletestovoe.common

import android.app.Application
import com.example.effectivemobiletestovoe.common.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppGlobal : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@AppGlobal)
            modules(appModules)
        }
    }
}
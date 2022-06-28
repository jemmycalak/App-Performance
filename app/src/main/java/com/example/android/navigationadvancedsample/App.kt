package com.example.android.navigationadvancedsample

import android.app.Application
import com.example.android.navigationadvancedsample.homescreen.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.java.KoinAndroidApplication
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level


val module = module {
    viewModel { HomeViewModel() }
}

val listModule = listOf(
    module
)

open class App: Application() {

    override fun onCreate() {
        super.onCreate()

        // Start KoinApplication instance
        startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(applicationContext)
            modules(listModule)
        }
    }
}

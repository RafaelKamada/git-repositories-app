package me.dio.gitrepositories

import android.app.Application
import me.dio.gitrepositories.data.di.DataModule
import me.dio.gitrepositories.domain.di.DomainModule
import me.dio.gitrepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
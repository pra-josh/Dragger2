package com.techyourchance.dagger2course

import android.app.Application
import com.techyourchance.dagger2course.common.dependnecyinjection.app.AppComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.app.AppModule
import com.techyourchance.dagger2course.common.dependnecyinjection.app.DaggerAppComponent

class MyApplication : Application() {

    public lateinit var appModule: AppComponent

    override fun onCreate() {
        appModule = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        super.onCreate()
    }

}
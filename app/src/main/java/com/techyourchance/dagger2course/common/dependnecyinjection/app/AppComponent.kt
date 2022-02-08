package com.techyourchance.dagger2course.common.dependnecyinjection.app

import android.app.Application
import com.techyourchance.dagger2course.networking.StackoverflowApi
import dagger.Component
import javax.inject.Singleton

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun stackoverflowApi() :StackoverflowApi

    fun application():Application
}
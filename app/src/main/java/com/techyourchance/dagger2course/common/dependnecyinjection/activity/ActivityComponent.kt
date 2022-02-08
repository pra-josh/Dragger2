package com.techyourchance.dagger2course.common.dependnecyinjection.activity

import android.app.Application
import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager
import com.techyourchance.dagger2course.common.dependnecyinjection.app.AppComponent
import com.techyourchance.dagger2course.common.dependnecyinjection.app.AppModule
import com.techyourchance.dagger2course.networking.StackoverflowApi
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun layoutInflater() : LayoutInflater

    fun fragmentManager() : FragmentManager

    fun screenNavigator(): ScreensNavigator

    fun stackOverFlowAPI(): StackoverflowApi
}
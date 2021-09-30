package com.techsavvyedu.hiltpractise.hilt

import com.techsavvyedu.hiltpractise.network.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped


@Module
@InstallIn(ActivityComponent::class)
/*abstract class NetworkModule {

    @Binds
    abstract fun bindNetworkAdapterImpl(networkAdapter: MyAppNetworkAdapter): NetworkAdapter



}*/

class NetworkModule {

    /*@Provides
    fun provideNetworkService(): NetworkService {
        return NetworkService.Builder().host("Google.com").protocol("https").intercepter(CallIntercepterImplementation()).build()
    }*/

    @CallIntercepter
    @Provides
    @ActivityScoped
    fun provideCallNetworkService(): NetworkService{
        return NetworkService.Builder().host("Google.com").protocol("https").intercepter(CallIntercepterImplementation()).build()
    }

    @ResponseIntercepter
    @Provides
    fun providesResponseNetworkService(): NetworkService{
        return NetworkService.Builder().host("Google.com").protocol("https").intercepter(ResponseIntercepterImplementation()).build()
    }



}

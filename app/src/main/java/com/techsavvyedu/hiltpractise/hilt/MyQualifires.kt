package com.techsavvyedu.hiltpractise.hilt

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CallIntercepter

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ResponseIntercepter



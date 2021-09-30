package com.techsavvyedu.hiltpractise.network

import javax.inject.Inject

class CallIntercepterImplementation @Inject constructor() : Intercepter {

    override fun log(message: String) {
        println("\nThis is call Intercepter $message\n")
    }


}
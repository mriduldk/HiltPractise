package com.techsavvyedu.hiltpractise.network

import javax.inject.Inject

class ResponseIntercepterImplementation @Inject constructor(): Intercepter {

    override fun log(message: String) {
        println("\nReceive Response Intercepter $message\n")
    }

}
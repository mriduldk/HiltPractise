package com.techsavvyedu.hiltpractise.network

import android.util.Log
import javax.inject.Inject


class MyAppNetworkAdapter @Inject constructor() : NetworkAdapter {


    override fun log(message: String) {
        println("MyNetworkAdapter $message")
    }


}
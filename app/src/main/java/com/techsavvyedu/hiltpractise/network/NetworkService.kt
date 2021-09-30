package com.techsavvyedu.hiltpractise.network

import android.util.Log

class NetworkService private constructor(builder: Builder){

    class Builder {

        var protocol: String ? = null
        private set

        var host: String? = null
        private set

        var path: String? = null
        private set

        var intercepter: Intercepter? = null
        private set


        fun protocol(protocol: String) = apply { this.protocol = protocol }

        fun host(host: String) = apply { this.host = host }

        fun path(path: String) = apply { this.path = path }

        fun intercepter(intercepter: Intercepter) = apply { this.intercepter = intercepter }


        fun build() = NetworkService(this)

    }



    var protocol: String?
    var host: String?
    var path: String?
    var intercepter: Intercepter?

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.intercepter = builder.intercepter
    }


    fun performNetworkCall(){
        println("\nNetworkService Network Call Perform $this\n")
        intercepter?.log("MEssage intercepter")
    }


















}
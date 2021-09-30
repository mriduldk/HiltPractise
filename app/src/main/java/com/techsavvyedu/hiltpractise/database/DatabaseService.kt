package com.techsavvyedu.hiltpractise.database

import javax.inject.Inject

class DatabaseService {

    @Inject
    constructor()


    fun load(message: String){
        println("\nDatabase Service Message $message\n")
    }


}
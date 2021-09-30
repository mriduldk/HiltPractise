package com.techsavvyedu.hiltpractise.database

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(@ActivityContext private var context: Context, var databaseService: DatabaseService) {


    fun load(message: String){
        println("\nDatabase adapter message $message\n")
        databaseService.load("message")
    }



}
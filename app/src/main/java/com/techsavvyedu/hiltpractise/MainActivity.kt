package com.techsavvyedu.hiltpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techsavvyedu.hiltpractise.database.DatabaseAdapter
import com.techsavvyedu.hiltpractise.database.DatabaseService
import com.techsavvyedu.hiltpractise.hilt.CallIntercepter
import com.techsavvyedu.hiltpractise.hilt.ResponseIntercepter
import com.techsavvyedu.hiltpractise.network.NetworkAdapter
import com.techsavvyedu.hiltpractise.network.NetworkService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseAdapter: DatabaseAdapter

    /*@Inject
    lateinit var networkAdapter: NetworkAdapter*/

    @CallIntercepter
    @Inject
    lateinit var networkService: NetworkService


    @ResponseIntercepter
    @Inject
    lateinit var networkService2: NetworkService

    @CallIntercepter
    @Inject
    lateinit var networkService3: NetworkService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // @AndroidEntryPoint : This annotation is used where dependency is injected.
        // It can be used in multiple classes as there can be multiple classes where dependency needed to be injected.
        // If you annotate a class with this annotation then we have to use this annotation with all its dependent outside.


        /**
         *  Supported classes for using this Annotation are
        a.	Application
        b.	Activity (must be children of ComponentActivity)
        c.	Fragment (androidx.Fragment, no retained Fragments)
        d.	View
        e.	Service
        f.	Broadcast receivers
        g.	ViewModel
         */


        databaseAdapter.load("Hello Hilt")



        // Method Injection


        //networkAdapter.log("Hello Network Adapter")

        networkService.performNetworkCall()
        networkService2.performNetworkCall()



        // Qualifier : If we want to provide different implementation of same type, Like in our example there are two classes implementing Interceptor and suppose sometimes we want
        // to profile 1st type and sometimes we want to provide another.



        // Sometime we need to provide context in one of the type that are injected. The context can be simply provided as an injection using the predefine qualifier.
        // Let's try to do the same in our databaseAdapter class.

        // @ActivityContext is used to provide the context of current activity and @ApplicationContext Qualifier is used to provide the context of application.
        //



        // Components: Components are automated in hilt. So we don't need to worry much about them but these are importent so we are goining to read about them.
        // Components binds togather modules and injections.



        // Scopes: Scopes allow us how many individual objects will be creates for our binding.
        // By default the binding is unscoped which means every time we inject certain object to type they will be create new.
        // As shown in image modules provides in ApplicationComponent can use singleton scope and then each time the same object will be returned for the whole application.
        // ActivityComponent have activity scope which means every time when we inject a type in an activity it will be same element and won't be created for again for the same activity.
        // Let's see now how to use ActivityComponent in our code.

        networkService3.performNetworkCall()


















    }

    @Inject
    fun directToDatabase(databaseService: DatabaseService){
        databaseService.load("Method Injection")
    }


}
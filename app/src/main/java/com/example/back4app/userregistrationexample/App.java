package com.example.back4app.userregistrationexample;

import com.parse.Parse;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if desired
                .clientKey(getString(R.string.back4app_client_key))
                .server("http://ec2-18-219-221-127.us-east-2.compute.amazonaws.com/parse/")
                .build()
        );
    }
}

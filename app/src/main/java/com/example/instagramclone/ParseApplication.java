package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JMu5PAKB8yrablXuMt5nZVr9diF2lyGzBdooFVXY")
                .clientKey("rgPa4VhFohTo6O8iS2Ty0PlBBcFjioVBTGGEppS7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

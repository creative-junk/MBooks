package com.crysoft.me.mbooks;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Maxx on 9/25/2017.
 */

public class MainApplication extends Application{
    public MainApplication(){

    }
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("mbooks")
                .clientKey("r153ofth3n00b5")
                .server("http://mbooks.herokuapp.com/parse/")
                .build());
    }
}

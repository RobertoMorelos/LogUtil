package com.example.logutilexample;

import android.app.Application;

import rm.logutil.LogU;

/**
 * @author Roberto Morelos
 * @since 7/5/17
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Here you can set any boolean value to enable/disable logs.
        // I'm using the Android variable from BuildConfig to check my environment.
        // If I'm in debug mode (development) I want to be able to see all logs.
        // If I want to publish my app then it won't be debug anymore and all my logs won't be shown.
        LogU.enableLogs(BuildConfig.DEBUG);
    }

}

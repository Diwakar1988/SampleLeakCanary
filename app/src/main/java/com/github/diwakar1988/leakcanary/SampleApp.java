package com.github.diwakar1988.leakcanary;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by diwakar.mishra on 4/1/2016.
 */
public class SampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}

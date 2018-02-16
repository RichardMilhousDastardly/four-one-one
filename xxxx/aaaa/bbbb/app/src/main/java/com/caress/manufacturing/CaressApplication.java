package com.caress.manufacturing;

import android.app.Application;

import io.realm.Realm;

public class CaressApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(getApplicationContext());
    }
}

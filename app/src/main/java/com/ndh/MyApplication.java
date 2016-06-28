package com.ndh;

import android.app.Application;

import hotfix.pingan.com.mylibrary.ResManager;


/**
 * Created by ndh on 16/5/20.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ResManager.getInstance().init(this, "");
    }

}

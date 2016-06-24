package com.example.wangjing.rntext;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by wangjing on 16/6/23.
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}

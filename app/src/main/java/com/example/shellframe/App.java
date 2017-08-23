package com.example.shellframe;

import android.app.Application;

import com.example.shellframe.base.BaseActivity;
import com.example.shellframe.base.BaseFragment;

/**
 * Created by 张豫耀 on 2017/8/23.
 */

public class App extends Application {
    public static BaseActivity baseActivity;
    public static BaseFragment baseFragment;
    @Override
    public void onCreate() {
        super.onCreate();
    }
}

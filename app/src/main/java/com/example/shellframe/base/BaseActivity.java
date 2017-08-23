package com.example.shellframe.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 张豫耀 on 2017/8/22.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());

        initView();
        initOnClicklistener();
        initOperation();
    }

    protected abstract int getlayout();

    protected abstract void initView();

    protected abstract void initOnClicklistener();

    protected abstract void initOperation();


}

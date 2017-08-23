package com.example.shellframe.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.shellframe.App;

import java.sql.SQLException;

import butterknife.ButterKnife;


/**
 * Created by xiaogang on 2017/6/20.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutID());
        ButterKnife.bind(this);
        App.baseActivity = this;
        try {
            initView();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        loadData();
        initListener();
    }
    protected abstract int layoutID();
    protected  abstract void initView() throws SQLException;
    protected abstract void loadData();
    protected abstract void initListener();

    @Override
    protected void onResume() {
        super.onResume();
        App.baseActivity = this;
    }
}

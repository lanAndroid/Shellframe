package com.example.shellframe.model;

import com.example.shellframe.model.entry.Bean;
import com.example.shellframe.model.entry.HomeBean;
import com.example.shellframe.model.entry.pandalive.PLHome;
import com.example.shellframe.model.entry.pandalive.PLLive;
import com.example.shellframe.model.retrofit.RetrofitUtils;

import java.util.Map;

import io.reactivex.Observer;


public class ModelImpl implements IModel {

    @Override
    public void RequestGet(Observer<Bean> observer) {

        RetrofitUtils.getmRetrofitUtils_Demo().GetNetwork(observer);

    }

    @Override
    public void RequestPost(Map<String, String> map, Observer<Bean> observer) {
        RetrofitUtils.getmRetrofitUtils_Demo().PostNetwork(map, observer);
    }

    @Override
    public void RequestHomeGet(Map<String, String> map, Observer<HomeBean> observer) {
        RetrofitUtils.getmRetrofitUtils_Demo().GetHomeNetwork(observer);
    }

    @Override
    public void doGet(Map<String, String> map, Observer<PLHome> observer) {

    }

    @Override
    public void doGets(Map<String, String> map, Observer<PLLive> observer) {

    }
}

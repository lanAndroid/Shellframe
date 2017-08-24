package com.example.shellframe.model;


import com.example.shellframe.model.entry.Bean;
import com.example.shellframe.model.entry.HomeBean;

import java.util.Map;

import io.reactivex.Observer;


public interface IModel {
    void RequestGet(Observer<Bean> observer);

    void RequestPost(Map<String, String> map, Observer<Bean> observer);

    //首页 第一次网络获取
    void RequestHomeGet(Map<String, String> map, Observer<HomeBean> observer);


}

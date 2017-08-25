package com.example.shellframe.model;


import com.example.shellframe.model.entry.Bean;
import com.example.shellframe.model.entry.HomeBean;
import com.example.shellframe.model.entry.pandalive.PLHome;
import com.example.shellframe.model.entry.pandalive.PLLive;

import java.util.Map;

import io.reactivex.Observer;


public interface IModel {
    void RequestGet(Observer<Bean> observer);

    void RequestPost(Map<String, String> map, Observer<Bean> observer);

    //首页 第一次网络获取
    void RequestHomeGet(Map<String, String> map, Observer<HomeBean> observer);

    //    熊猫直播 第一次网络获取
    void doGet(Map<String, String> map, Observer<PLHome> observer);

    //    熊猫直播 第二次网络获取
    void doGets(Map<String, String> map, Observer<PLLive> observer);


}

package com.example.shellframe.model;


import com.example.shellframe.model.entry.AnnBean;
import com.example.shellframe.model.entry.Bean;

import java.util.Map;

import io.reactivex.Observer;


public interface IModel {
    void RequestGet(Observer<Bean> observer);

    void RequestPost(Map<String, String> map, Observer<Bean> observer);

    void AnnRequsetGet(Observer<AnnBean> observer);
}

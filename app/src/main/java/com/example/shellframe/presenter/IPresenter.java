package com.example.shellframe.presenter;

import java.util.Map;


public interface IPresenter {
    void Getcontroller();

    void PosyController(Map<String, String> map);

    void onDestroy();
}
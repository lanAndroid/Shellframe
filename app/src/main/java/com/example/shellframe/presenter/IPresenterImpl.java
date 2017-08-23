package com.example.shellframe.presenter;


import com.example.shellframe.model.ModelImpl;
import com.example.shellframe.model.entry.Bean;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


public class IPresenterImpl implements IPresenter, Observer<Bean> {

    private ModelImpl iModel;

    public IPresenterImpl() {
        this.iModel = new ModelImpl();
    }


    @Override
    public void Getcontroller() {
        iModel.RequestGet(this);
    }

    @Override
    public void PosyController(Map<String, String> map) {

    }

    @Override
    public void onDestroy() {

    }


    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull Bean bean) {

    }

    @Override
    public void onError(@NonNull Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}

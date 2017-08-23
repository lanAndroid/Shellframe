package com.example.shellframe.presenter;


import com.example.shellframe.model.ModelImpl;
import com.example.shellframe.model.entry.Bean;
import com.example.shellframe.view.IView;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


public class IPresenterImpl implements IPresenter, Observer<Bean> {
    private IView iView;
    private ModelImpl iModel;

    public IPresenterImpl(IView iView) {
        this.iView = iView;
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
        iView = null;
    }


    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull Bean bean) {
        iView.OnSucceed(bean.toString());
    }

    @Override
    public void onError(@NonNull Throwable e) {
        iView.OnDefeated();
    }

    @Override
    public void onComplete() {

    }
}

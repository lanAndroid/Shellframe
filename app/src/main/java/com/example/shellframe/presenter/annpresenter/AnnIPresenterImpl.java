package com.example.shellframe.presenter.annpresenter;


import com.example.shellframe.model.IModel;
import com.example.shellframe.model.ModelImpl;
import com.example.shellframe.model.entry.AnnBean;
import com.example.shellframe.model.retrofit.RetrofitUtils;
import com.example.shellframe.view.announce.AnnView;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class AnnIPresenterImpl implements AnnIPresenter, Observer<AnnBean> {
    private AnnView annView;
    private final ModelImpl model;

    public AnnIPresenterImpl(AnnView annView) {
        this.annView=annView;
        model = new ModelImpl();
    }

    @Override
    public void annGet() {
        model.AnnRequsetGet(this);
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull AnnBean annBean) {
        annView.onSuccess(annBean);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        annView.onError(e.toString());
    }

    @Override
    public void onComplete() {

    }
}

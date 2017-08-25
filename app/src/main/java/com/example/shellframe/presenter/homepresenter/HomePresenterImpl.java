package com.example.shellframe.presenter.homepresenter;


import android.util.Log;

import com.example.shellframe.model.ModelImpl;
import com.example.shellframe.model.entry.HomeBean;
import com.example.shellframe.view.home.IHomeFragment;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class HomePresenterImpl implements HomeIPresenter {
        IHomeFragment mIhomeFragment;

    ModelImpl model;

Map<String,String> map=new HashMap<>();

    public HomePresenterImpl(IHomeFragment mIhomeFragment) {
        this.mIhomeFragment = mIhomeFragment;
    }

    @Override
    public void getHomeBean( ) {
        model=new ModelImpl();
        model.RequestHomeGet(map, new Observer<HomeBean>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull HomeBean homeBean) {
                Log.e("TAG","传值了");
                mIhomeFragment.gethomebean(homeBean);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}

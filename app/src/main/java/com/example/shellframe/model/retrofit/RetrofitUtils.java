package com.example.shellframe.model.retrofit;

import com.example.shellframe.model.entry.AnnBean;
import com.example.shellframe.model.entry.Bean;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 韩志军 on 2017/8/19.
 */

public class RetrofitUtils {
    private static RetrofitUtils mRetrofitUtils = null;
    private final RetrofitAPIServices apiServices;

    private RetrofitUtils() {
        OkHttpClient okhttp = new OkHttpClient.Builder()
                .connectTimeout(50, TimeUnit.SECONDS)
                .readTimeout(50, TimeUnit.SECONDS)
                .writeTimeout(50, TimeUnit.SECONDS).build();
        apiServices = new Retrofit.Builder()
                .client(okhttp)
                .baseUrl("https://www.baidu.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build().create(RetrofitAPIServices.class);

    }

    public static RetrofitUtils getmRetrofitUtils_Demo() {
        if (mRetrofitUtils == null)
            mRetrofitUtils = new RetrofitUtils();
        return mRetrofitUtils;
    }


    public void PostNetwork(Map<String, String> map, Observer<Bean> observer) {
        Observable<Bean> services = apiServices.getServices(map);
        services.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }

    public void GetNetwork(Observer<Bean> observer) {
        Observable<Bean> services = apiServices.getServicesGET();
        services.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }
    public void annGetNetWork(Observer<AnnBean> observer){
        Observable<AnnBean> annBeanObservable = apiServices.annServicesGET();
        annBeanObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }
}

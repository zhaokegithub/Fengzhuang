package com.example.admin.fengzhuang.model;

import com.example.admin.fengzhuang.RetrofitFactory;
import com.example.admin.fengzhuang.view.SplashP;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by admin on 2018/1/5.
 */

public class SplashModel {
SplashP splashP;

    public SplashModel(SplashP splashP) {
        this.splashP = splashP;
    }

    public void getdata() {

        RetrofitFactory.get("addCart?uid=3004&pid=1&source=android").subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                //Log.d("tag","============");
                splashP.successful(s);
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

package com.example.admin.fengzhuang.base;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by admin on 2018/1/7.
 */

public abstract class BaseObserver  implements Observer<String>{

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull String s) {

        onSuccess(s);
    }


    @Override
    public void onError(@NonNull Throwable e) {
        onFail();
    }



    @Override
    public void onComplete() {

    }
    public abstract void onSuccess(String s) ;
    public abstract void onFail() ;
}


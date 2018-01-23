package com.example.admin.fengzhuang.base;

/**
 * Created by admin on 2018/1/5.
 */

public abstract class BasePresenter<T> {
    public T view;

    public void  attach(T view) {
        this.view = view;
    }
    public void detach(T view){
        this.view=null;
    }
}

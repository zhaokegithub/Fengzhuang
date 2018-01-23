package com.example.admin.fengzhuang.presenter;

import com.example.admin.fengzhuang.base.BasePresenter;
import com.example.admin.fengzhuang.model.SplashModel;
import com.example.admin.fengzhuang.view.SplashP;
import com.example.admin.fengzhuang.view.SplashView;

/**
 * Created by admin on 2018/1/5.
 */

public class SplashPresenter extends BasePresenter<SplashView> implements SplashP{
    SplashModel splashModel;
    SplashView splashView;
    public SplashPresenter(SplashView splashView) {
        this.splashView=splashView;
        splashModel=new SplashModel(this);
    }
    public void getdata(){

        splashModel.getdata();
    }

    @Override
    public void successful(String s) {
        splashView.successful(s);
    }
}

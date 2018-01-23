package com.example.admin.fengzhuang;

import android.os.Bundle;
import android.util.Log;

import com.example.admin.fengzhuang.presenter.SplashPresenter;
import com.example.admin.fengzhuang.view.SplashView;

public class SplashActivity extends BaseMvpActivity<SplashView,SplashPresenter> implements SplashView {


    @Override
    public SplashPresenter initPresenter() {
        return new SplashPresenter(this);
    }

    /**
     *
     * @param savedInstanceState
     * mvp基本封装
     * 1.搭建框架，首先创建基类
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag","====撒村错错错错多错多");

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.getdata();

    }

    @Override
    public void successful(String s) {
        Log.d("tag","===sdsdsdds"+s);
    }
}

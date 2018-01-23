package com.example.admin.fengzhuang;

import android.os.Bundle;

import com.example.admin.fengzhuang.base.BasePresenter;
import com.example.admin.fengzhuang.base.IActivity;

/**
 * MVPactivity的一个抽象类，在对应的生命周期中，绑定和释放资源，避免内存泄漏
 * V代表当前的view
 * P代表当前的presenter
 * 每个activity创建的view presenter都不同所以用泛型
 * @param <V>
 * @param <T>
 */
public abstract class BaseMvpActivity<V,T extends BasePresenter<V>> extends IActivity {
    public T presenter ;

    public abstract T initPresenter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_mvp);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detach((V) this);
    }
}

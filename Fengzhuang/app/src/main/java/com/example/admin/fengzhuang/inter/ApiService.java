package com.example.admin.fengzhuang.inter;


import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by admin on 2018/1/5.
 */

public interface ApiService {
    @GET
    public Observable<String> get(@Url String url);
//get请求提交表单
    @GET
    public Observable<String> get(@Url String url,@QueryMap Map<String,String> map);

    @FormUrlEncoded
    @POST
    public Observable<String> post(@Url String url,@QueryMap Map<String,String> map);
}

package com.xiaoxing.mvp.api;

import com.xiaoxing.mvp.Constants;
import com.xiaoxing.mvp.ui.login.bean.Login;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.api
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 15:34
 * @change
 * @chang time
 * @class describe
 */
public interface LoginApi {

    @GET(Constants.DOMAIN_API + "user/login")
    Observable<Login> login(@Query("user_name") String user_name, @Query("password") String password);
}

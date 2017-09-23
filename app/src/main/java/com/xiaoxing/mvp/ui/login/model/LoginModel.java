package com.xiaoxing.mvp.ui.login.model;

import com.xiaoxing.mvp.api.LoginApi;
import com.xiaoxing.mvp.ui.login.bean.Login;
import com.xiaoxing.mvp.ui.login.contract.LoginContract;
import com.xiaoxing.mvp_core.data.net.RxService;
import com.xiaoxing.mvp_core.utils.helper.RxUtil;

import rx.Observable;

/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.ui.login.model
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 15:32
 * @change
 * @chang time
 * @class describe
 */
public class LoginModel implements LoginContract.LoginModel {


    @Override
    public Observable<Login> login(String username, String pwd) {
        return RxService.
                createApi(LoginApi.class).
                login(username, pwd).
                compose(RxUtil.rxSchedulerHelper());
    }
}

package com.xiaoxing.mvp.ui.login.contract;

import android.content.Context;

import com.xiaoxing.mvp.ui.login.bean.Login;
import com.xiaoxing.mvp_core.base.CoreBaseModel;
import com.xiaoxing.mvp_core.base.CoreBasePresenter;
import com.xiaoxing.mvp_core.base.CoreBaseView;

import rx.Observable;


/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.ui.login.contract
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 14:59
 * @change
 * @chang time
 * @class describe
 */
public interface LoginContract {

    interface LoginModel extends CoreBaseModel {
        Observable<Login> login(String username, String pwd);

        void saveLoginData(Context context, Login login);
    }

    interface LoginView extends CoreBaseView {
        void accountIsNull();

        void passwordIsNull();

        void loginSuccess();
    }

    abstract class LoginPresenter extends CoreBasePresenter<LoginContract.LoginModel, LoginContract.LoginView> {
        public abstract void doLogin(String username, String pwd);
    }
}

package com.xiaoxing.mvp.ui.login.presenter;

import android.text.TextUtils;

import com.xiaoxing.mvp.R;
import com.xiaoxing.mvp.ui.login.bean.Login;
import com.xiaoxing.mvp.ui.login.contract.LoginContract;
import com.xiaoxing.mvp_core.base.CoreLoadingSubscriber;

/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.ui.login.presenter
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 15:15
 * @change
 * @chang time
 * @class describe
 */
public class LoginPresenter extends LoginContract.LoginPresenter {
    @Override
    public void onStart() {

    }


    @Override
    public void doLogin(String username, String pwd) {
        if (TextUtils.isEmpty(username)) {
            mView.accountIsNull();
            return;
        }
        if (TextUtils.isEmpty(pwd)) {
            mView.passwordIsNull();
            return;
        }

        //mRxManager.add(mModel.login(username, pwd).subscribe(data -> mView.loginSuccess(data), e -> mView.showError("数据加载失败ヽ(≧Д≦)ノ")));
        mRxManager.add(mModel.login(username, pwd).subscribe(new CoreLoadingSubscriber<Login>(mContext, mActivity.getFragmentManager(), R.raw.loading) {
            @Override
            public void _onNext(Login entity) {
                mModel.saveLoginData(mContext, entity);
                mView.loginSuccess();
            }
        }));
    }
}

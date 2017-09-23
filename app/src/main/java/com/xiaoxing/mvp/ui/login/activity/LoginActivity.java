package com.xiaoxing.mvp.ui.login.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.xiaoxing.mvp.R;
import com.xiaoxing.mvp.ui.login.contract.LoginContract;
import com.xiaoxing.mvp.ui.login.model.LoginModel;
import com.xiaoxing.mvp.ui.login.presenter.LoginPresenter;
import com.xiaoxing.mvp_core.base.CoreBaseActivity;
import com.xiaoxing.mvp_core.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @name Xiaoxing_Mvp
 * @class name：com.xiaoxing.mvp.ui.login.activity
 * @class describe
 * @anthor xiaoxing QQ:2235445233
 * @time 2017/9/22 15:12
 * @change
 * @chang time
 * @class describe
 */
public class LoginActivity extends CoreBaseActivity<LoginPresenter, LoginModel> implements LoginContract.LoginView {


    @BindView(R.id.ced_tel)
    EditText cedTel;
    @BindView(R.id.cet_pwd)
    EditText cetPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showError(String msg) {
        ToastUtils.showToast(this, msg);
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        btnLogin.setText("ssssssssss");
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        mPresenter.doLogin("123", "111111");
    }

    @Override
    public void accountIsNull() {
        ToastUtils.showToast(this, "账号不能为空");
    }

    @Override
    public void passwordIsNull() {
        ToastUtils.showToast(this, "密码不能为空");
    }


    @Override
    public void loginSuccess() {
        ToastUtils.showToast(this, "登录成功");
    }
}

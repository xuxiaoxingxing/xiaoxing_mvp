package com.xiaoxing.mvp.ui.login.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.xiaoxing.mvp.R;
import com.xiaoxing.mvp.ui.login.contract.LoginContract;
import com.xiaoxing.mvp.ui.login.model.LoginModel;
import com.xiaoxing.mvp.ui.login.presenter.LoginPresenter;
import com.xiaoxing.mvp_core.base.CoreBaseActivity;
import com.xiaoxing.mvp_core.utils.StatusBarUtil;
import com.xiaoxing.mvp_core.utils.ToastUtils;
import com.xiaoxing.validation.EditText;
import com.xiaoxing.validation.Validators;

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
    @BindView(R.id.toolbar)
    Toolbar toolbar;
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
        StatusBarUtil.setTransparent(this);
        toolbar.setTitle("全民TV");
        btnLogin.setText("ssssssssss");
        cedTel.addValidator(Validators.notEmpty(this, R.string.zhang_hao_bu_neng_wei_kong));
        cetPwd.addValidator(Validators.notEmpty(this, R.string.mi_ma_bu_neng_wei_kong));

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        mPresenter.doLogin("", "");
    }

    @Override
    public void accountIsNull() {
        cedTel.validate();

    }

    @Override
    public void passwordIsNull() {
        cetPwd.validate();
    }


    @Override
    public void loginSuccess() {
        ToastUtils.showToast(this, "登录成功");
    }
}

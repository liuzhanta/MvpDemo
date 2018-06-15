package com.tata.mvpdemo.login;

import com.tata.mvpdemo.base.BaseMVP;

public class LoginMvpImpl extends BaseMVP {

    ILoginView loginView;

    public void login(String username, String pwd) {
        loginView.showLoading();

        loginView.hideLoading();
    }
}

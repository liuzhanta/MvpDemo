package com.tata.mvpdemo.login;

import com.tata.mvpdemo.base.BaseMVP;

public class LoginPresenter extends BaseMVP<ILoginView> {

    LoginInteractor loginInteractor = new LoginInteractor();

    public void login(String account, String pwd) {
        getIView().showLoading();
        loginInteractor.login(account, pwd, new LoginInteractor.OnLoginCallBack() {
            @Override
            public void onSucceed() {
                getIView().hideLoading();
            }

            @Override
            public void onFailed() {

            }
        });

    }
}

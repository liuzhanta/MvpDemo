package com.tata.mvpdemo.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;

import com.tata.mvpdemo.R;
import com.tata.mvpdemo.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter, ILoginView> implements ILoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    public void onLoginClick(View v) {
        mPresenter.login("ss", "123");
    }


    @Override
    public void showLoading() {
        Toast.makeText(this, "start to login", Toast.LENGTH_SHORT).show();

    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                Toast.makeText(LoginActivity.this, "login succeed", Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    public void hideLoading() {
        handler.sendEmptyMessage(1);

    }

    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }
}

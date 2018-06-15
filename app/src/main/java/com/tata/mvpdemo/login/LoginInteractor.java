package com.tata.mvpdemo;


import android.os.Handler;
import android.os.Message;

public class LoginInteractor {

    public void login(String userName, String pwd, final OnLoginCallBack listener)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                listener.onSucceed();
            }
        }).start();
    }
    public interface OnLoginCallBack{
        void onSucceed();
        void onFailed();
    }
}

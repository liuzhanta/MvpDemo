package com.tata.mvpdemo.component;

import android.app.Activity;

import com.tata.mvpdemo.login.ILoginView;

public class ComponentBusinessB extends ComponentImpl<ILoginView> {

    public ComponentBusinessB(ILoginView mView, Activity activity) {
        super(mView, activity);
    }
    public void init(){
    }

}

package com.tata.mvpdemo.component;

import android.app.Activity;

import com.tata.mvpdemo.base.IView;
import com.tata.mvpdemo.login.ILoginView;

public class ComponentBusinessA extends ComponentImpl<ILoginView> {

    public ComponentBusinessA(ILoginView mView, Activity activity) {
        super(mView, activity);
    }
    public void init(){
    }

}

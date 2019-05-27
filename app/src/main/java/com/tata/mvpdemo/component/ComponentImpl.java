package com.tata.mvpdemo.component;

import android.app.Activity;

import com.tata.mvpdemo.base.IView;

public abstract class ComponentImpl<T extends IView> extends Component {

    T mView;
    Activity activity;

    public ComponentImpl(T mView, Activity activity) {
        this.mView = mView;
        this.activity = activity;
    }

    @Override
    void add(Component component) {
        if (!getComponents().contains(component)) {
            getComponents().add(component);
        }
    }

    @Override
    void remove(Component component) {
        if (getComponents().contains(component)) {
            getComponents().remove(component);
        }
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

}

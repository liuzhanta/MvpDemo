package com.tata.mvpdemo.base;

import java.lang.ref.WeakReference;

public abstract class BaseMVP<V extends IView> {

    private WeakReference<V> mViewRef;

    public void attachView(V view) {
        if (mViewRef == null) {
            mViewRef = new WeakReference<>(view);
        }
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public V getIView(){
        if (mViewRef==null) {
            return null;
        }
        return mViewRef.get();
    }

}

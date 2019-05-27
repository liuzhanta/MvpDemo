package com.tata.mvpdemo.visitor;

public class TargetImpl implements Target {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTarget(this);
    }
}

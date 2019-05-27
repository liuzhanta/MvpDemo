package com.tata.mvpdemo.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visitTarget(Target target) {
        target.accept(this);
    }
}

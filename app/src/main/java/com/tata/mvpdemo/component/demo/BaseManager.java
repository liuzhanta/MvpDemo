package com.tata.mvpdemo.component.demo;

public abstract class BaseManager extends Employer {

    public BaseManager(String name) {
        super(name);
    }

    @Override
    public Employer addEmployer(Employer employer) {
        getEmployers().add(employer);
        return this;
    }

    @Override
    public Employer removeEmployer(Employer employer) {
        getEmployers().remove(employer);
        return this;
    }
}

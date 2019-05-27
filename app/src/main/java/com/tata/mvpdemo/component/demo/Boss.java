package com.tata.mvpdemo.component.demo;

public class Boss extends Employer {

    public Boss(String name) {
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

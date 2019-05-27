package com.tata.mvpdemo.component.demo;

import java.util.HashSet;

/**
 * Description : 雇主<br>
 * Author : Terry Liu <br>
 * Date : 2019/1/11 下午3:56
 */

public abstract class Employer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer(String name) {
        this.name = name;
    }

    private HashSet<Employer> employers= new HashSet<>();

    public abstract Employer addEmployer(Employer employer);

    public abstract Employer removeEmployer(Employer employer);

    public HashSet<Employer> getEmployers() {
        return employers;
    }
}

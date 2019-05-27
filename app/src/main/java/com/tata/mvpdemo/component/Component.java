package com.tata.mvpdemo.component;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Component {

    private HashSet<Component> components= new HashSet();

    abstract void add(Component component);

    abstract void remove(Component component);

    public HashSet<Component> getComponents() {
        return components;
    }
}

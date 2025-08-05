package com.tiv.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 */
public class Catalog implements Component {

    private String name;

    private Integer level;

    private List<Component> components = new ArrayList<>();

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String getName(Component component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(getName(this));
        for (Component component : components) {
            if (this.level != null) {
                for (int i = 0; i <= this.level; i++) {
                    System.out.print("  ");
                }
            }
            component.print();
        }
    }

}

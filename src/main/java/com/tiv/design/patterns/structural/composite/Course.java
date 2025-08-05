package com.tiv.design.patterns.structural.composite;

/**
 * 课程
 */
public class Course implements Component {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(Component component) {
        return this.name;
    }

    @Override
    public double getPrice(Component component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.printf("Course:%s,Price:%.1f%n", getName(this), getPrice( this));
    }

}

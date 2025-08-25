package com.tiv.design.patterns.behavioral.command;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("打开" + name);
    }

    public void turnOff() {
        System.out.println("关闭" + name);
    }

}

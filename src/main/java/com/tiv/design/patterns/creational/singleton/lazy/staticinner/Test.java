package com.tiv.design.patterns.creational.singleton.lazy.staticinner;

public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
    }

}

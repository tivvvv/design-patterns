package com.tiv.design.patterns.creational.singleton.lazy.staticinner;

public class T implements Runnable {

    @Override
    public void run() {
        LazySingletonByStaticInner instance = LazySingletonByStaticInner.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }

}

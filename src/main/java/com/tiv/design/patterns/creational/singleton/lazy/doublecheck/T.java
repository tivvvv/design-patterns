package com.tiv.design.patterns.creational.singleton.lazy.doublecheck;

public class T implements Runnable {

    @Override
    public void run() {
        LazySingletonByDoubleCheck instance = LazySingletonByDoubleCheck.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }

}

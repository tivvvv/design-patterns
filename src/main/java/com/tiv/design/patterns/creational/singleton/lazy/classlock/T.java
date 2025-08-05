package com.tiv.design.patterns.creational.singleton.lazy.classlock;

public class T implements Runnable {

    @Override
    public void run() {
        LazySingletonByClassLock instance = LazySingletonByClassLock.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }

}

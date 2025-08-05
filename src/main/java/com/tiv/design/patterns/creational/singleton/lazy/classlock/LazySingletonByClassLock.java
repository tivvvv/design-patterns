package com.tiv.design.patterns.creational.singleton.lazy.classlock;

/**
 * 基于类锁的懒汉式
 */
public class LazySingletonByClassLock {

    private static LazySingletonByClassLock instance = null;

    private LazySingletonByClassLock() {
    }

    public synchronized static LazySingletonByClassLock getInstance() {
        if (instance == null) {
            instance = new LazySingletonByClassLock();
        }
        return instance;
    }

}

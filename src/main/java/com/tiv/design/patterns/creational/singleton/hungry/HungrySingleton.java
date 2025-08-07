package com.tiv.design.patterns.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    /**
     * 实现readResolve()方法,解决序列化破坏单例的问题
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }

}

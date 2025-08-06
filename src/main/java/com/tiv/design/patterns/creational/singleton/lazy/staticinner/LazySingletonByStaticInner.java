package com.tiv.design.patterns.creational.singleton.lazy.staticinner;

/**
 * 基于静态内部类的懒汉式
 */
public class LazySingletonByStaticInner {

    private LazySingletonByStaticInner() {
    }

    public static LazySingletonByStaticInner getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static final LazySingletonByStaticInner instance = new LazySingletonByStaticInner();
    }

}

package com.tiv.design.patterns.creational.singleton.lazy.doublecheck;

/**
 * 基于双重检查的懒汉式
 */
public class LazySingletonByDoubleCheck {

    // 对象初始化步骤
    // 1. 分配内存给这个对象
    // 2. 初始化对象
    // 3. 设置instance指向刚分配的内存
    // 其中2和3可能会颠倒顺序,instance指向了未初始化完成的对象,导致多线程访问时出现错误
    // volatile关键字可以禁止重排序
    private volatile static LazySingletonByDoubleCheck instance = null;

    private LazySingletonByDoubleCheck() {
    }

    public static LazySingletonByDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingletonByDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazySingletonByDoubleCheck();
                }
            }
        }
        return instance;
    }

}

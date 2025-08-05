package com.tiv.design.patterns.structural.composite;

/**
 * 组件接口
 */
public interface Component {

    default void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    default void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    default String getName(Component component) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    default double getPrice(Component component) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    default void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}

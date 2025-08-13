package com.tiv.design.patterns.structural.flyweight;

/**
 * 享元字符
 */
public class FlyweightCharacter {

    /**
     * 内部状态
     */
    private char value;

    public FlyweightCharacter(char value) {
        this.value = value;
    }

    /**
     * 显示 字体,大小,颜色 外部状态
     *
     * @param font
     * @param size
     * @param color
     */
    public void display(String font, int size, String color) {
        System.out.println("字符: " + value + " 字体: " + font + " 大小: " + size + " 颜色: " + color);
    }

}

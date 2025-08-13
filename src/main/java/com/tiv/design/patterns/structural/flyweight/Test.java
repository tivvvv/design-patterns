package com.tiv.design.patterns.structural.flyweight;

public class Test {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.displayText("Hello world!");
        System.out.println("----------");
        textEditor.displayText("Java World");
    }

}

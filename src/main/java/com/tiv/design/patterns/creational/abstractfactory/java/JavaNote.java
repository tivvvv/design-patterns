package com.tiv.design.patterns.creational.abstractfactory.java;

import com.tiv.design.patterns.creational.abstractfactory.Note;

/**
 * Java笔记
 */
public class JavaNote extends Note {

    @Override
    public void read() {
        System.out.println("阅读Java笔记");
    }

}

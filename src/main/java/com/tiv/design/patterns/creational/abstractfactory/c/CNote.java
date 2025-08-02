package com.tiv.design.patterns.creational.abstractfactory.c;

import com.tiv.design.patterns.creational.abstractfactory.Note;

/**
 * C笔记
 */
public class CNote extends Note {

    @Override
    public void read() {
        System.out.println("阅读C笔记");
    }

}

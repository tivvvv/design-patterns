package com.tiv.design.patterns.creational.abstractfactory.java;

import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * Java视频
 */
public class JavaVideo extends Video {

    @Override
    public void play() {
        System.out.println("播放Java视频");
    }

}

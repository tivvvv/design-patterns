package com.tiv.design.patterns.creational.abstractfactory.c;

import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * C视频
 */
public class CVideo extends Video {

    @Override
    public void play() {
        System.out.println("播放C视频");
    }

}

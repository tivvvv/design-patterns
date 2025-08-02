package com.tiv.design.patterns.creational.abstractfactory.python;

import com.tiv.design.patterns.creational.abstractfactory.Video;

/**
 * Python视频
 */
public class PythonVideo extends Video {

    @Override
    public void play() {
        System.out.println("播放Python视频");
    }

}

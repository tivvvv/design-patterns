package com.tiv.design.patterns.creational.factorymethod.factory;

import com.tiv.design.patterns.creational.factorymethod.video.JavaVideo;
import com.tiv.design.patterns.creational.factorymethod.video.Video;

/**
 * Java视频工厂
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

}

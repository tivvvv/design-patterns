package com.tiv.design.patterns.creational.factorymethod.factory;

import com.tiv.design.patterns.creational.factorymethod.video.PythonVideo;
import com.tiv.design.patterns.creational.factorymethod.video.Video;

/**
 * Python视频工厂
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

}

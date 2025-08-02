package com.tiv.design.patterns.creational.factorymethod.factory;

import com.tiv.design.patterns.creational.factorymethod.video.Video;

/**
 * 视频工厂
 */
public abstract class VideoFactory {

    /**
     * 获取视频
     *
     * @return
     */
    public abstract Video getVideo();

}

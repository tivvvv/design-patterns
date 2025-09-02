package com.tiv.design.patterns.behavioral.state.states;

import com.tiv.design.patterns.behavioral.state.VideoContext;

/**
 * 视频播放状态抽象类
 */
public abstract class VideoState {

    protected VideoContext videoContext;

    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public abstract void speedUp();

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

}

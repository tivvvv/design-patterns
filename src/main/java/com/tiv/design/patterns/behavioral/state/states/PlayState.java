package com.tiv.design.patterns.behavioral.state.states;

import com.tiv.design.patterns.behavioral.state.VideoContext;

/**
 * 正常播放状态
 */
public class PlayState extends VideoState {

    @Override
    public void play() {
        System.out.println("正常速度播放课程状态");
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }

    @Override
    public void speedUp() {
        super.videoContext.setVideoState(VideoContext.SPEED_UP_STATE);
    }

}

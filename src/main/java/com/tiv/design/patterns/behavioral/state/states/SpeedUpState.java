package com.tiv.design.patterns.behavioral.state.states;

import com.tiv.design.patterns.behavioral.state.VideoContext;

/**
 * 倍速播放状态
 */
public class SpeedUpState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
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
        System.out.println("倍速播放视频状态");
    }

}

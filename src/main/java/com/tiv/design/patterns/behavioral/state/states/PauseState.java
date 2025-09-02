package com.tiv.design.patterns.behavioral.state.states;

import com.tiv.design.patterns.behavioral.state.VideoContext;

/**
 * 暂停播放状态
 */
public class PauseState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放状态");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }

    @Override
    public void speedUp() {
        System.out.println("现在不能倍速播放");
    }

}

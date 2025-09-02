package com.tiv.design.patterns.behavioral.state.states;

import com.tiv.design.patterns.behavioral.state.VideoContext;

/**
 * 停止播放状态
 */
public class StopState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("已经停止播放了");
    }

    @Override
    public void stop() {
        System.out.println("停止播放状态");
    }

    @Override
    public void speedUp() {
        System.out.println("现在不能倍速播放");
    }

}

package com.tiv.design.patterns.behavioral.state;

import com.tiv.design.patterns.behavioral.state.states.*;

/**
 * 视频播放上下文
 */
public class VideoContext {

    private VideoState videoState;

    public final static PlayState PLAY_STATE = new PlayState();

    public final static StopState STOP_STATE = new StopState();

    public final static PauseState PAUSE_STATE = new PauseState();

    public final static SpeedUpState SPEED_UP_STATE = new SpeedUpState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void play() {
        this.videoState.play();
    }

    public void pause() {
        this.videoState.pause();
    }

    public void stop() {
        this.videoState.stop();
    }

    public void speedUp() {
        this.videoState.speedUp();
    }

}

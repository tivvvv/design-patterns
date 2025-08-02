package com.tiv.design.patterns.creational.factorymethod;

import com.tiv.design.patterns.creational.factorymethod.factory.PythonVideoFactory;
import com.tiv.design.patterns.creational.factorymethod.factory.VideoFactory;
import com.tiv.design.patterns.creational.factorymethod.video.Video;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.play();
    }

}

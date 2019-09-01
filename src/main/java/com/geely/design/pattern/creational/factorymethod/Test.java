package com.geely.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
//        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}

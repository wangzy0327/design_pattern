package com.geely.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}

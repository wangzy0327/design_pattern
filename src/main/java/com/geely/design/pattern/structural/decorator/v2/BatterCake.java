package com.geely.design.pattern.structural.decorator.v2;

public class BatterCake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

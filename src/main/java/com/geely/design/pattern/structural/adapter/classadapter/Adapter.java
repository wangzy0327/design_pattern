package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * 类适配器模式
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}

package com.geely.design.pattern.structural.adapter.objectadapter;

import com.geely.design.pattern.structural.adapter.classadapter.Adapter;
import com.geely.design.pattern.structural.adapter.classadapter.ConcreteTarget;
import com.geely.design.pattern.structural.adapter.classadapter.Target;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

package com.geely.design.principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习FE课程");
    }
}

package com.geely.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        //链式调用
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();
        System.out.println(course);
    }
}

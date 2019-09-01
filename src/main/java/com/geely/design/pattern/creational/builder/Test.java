package com.geely.design.pattern.creational.builder;


public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java精品课程",
                "Java精品课程PPT",
                "Java精品课程视频",
                "Java精品课程手记",
                "Java精品课程问答");
        System.out.println(course);
    }
}

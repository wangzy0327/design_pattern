package com.geely.design.principle.dependenceinversion;

public class Geely {

    private ICourse iCourse;

    public Geely() {
    }

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

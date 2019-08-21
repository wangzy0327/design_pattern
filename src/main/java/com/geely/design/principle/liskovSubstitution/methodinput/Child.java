package com.geely.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }


//     3、当子类的方法重载父类的方法时，方法的前置条件（即方法的输入、入参）
//        要比父类方法的输入参数更宽松
//
//     4、当子类的方法实现父类的方法时（重写、重载或实现抽象方法），方法的后置条件
//     （即方法的输出、返回值）要比父类更严格或相等
    public void method(Map map){
        System.out.println("子类Map入参方法被执行");
    }

}

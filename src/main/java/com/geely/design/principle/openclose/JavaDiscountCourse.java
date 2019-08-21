package com.geely.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

//    public Double getOriginPrice(){
//        return super.getPrice();
//    }


    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

    /**
     * 遵循里式替换原则，子类不修改父类抽象方法原有功能
     *
     * 子类可以扩展父类的功能，但不能改变父类原有的功能
     *
     * 1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
     *
     * 2、子类中可以增加自己特有的方法
     *
     * 3、当子类的方法重载父类的方法时，方法的前置条件（即方法的输入、入参）
     * 要比父类方法的输入参数更宽松
     *
     * 4、当子类的方法实现父类的方法时（重写、重载或实现抽象方法），方法的后置条件
     * （即方法的输出、返回值）要比父类更严格或相等
     *
     * 优点：
     * 1、约束继承泛滥，是开闭原则的一种体现
     * 2、加强程序的健壮性，同时变更时可以做到非常好的兼容性，
     * 提高程序的维护性、扩展性。降低需求变更时引入的风险
     *
     */
//    @Override
//    public Double getPrice() {
//        return super.getPrice()*0.8;
//    }


}

package com.geely.design.principle.liskovSubstitution;

public class Test {

    /**
     * 不适用于使用Quadrangle，继承约束
     * @param rectangle
     */
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+"  length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth()+"  length:"+rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
        Square square = new Square();
//        square.setWidth(10);
//        square.setLength(20);
//        resize(square);
    }

}

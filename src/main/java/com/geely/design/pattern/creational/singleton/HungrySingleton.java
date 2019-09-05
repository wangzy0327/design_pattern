package com.geely.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable{
    /**
     * 静态变量初始化
     */
//    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 静态块初始化
     */
    private final static HungrySingleton hungrySingleton ;

    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        /**
         * 反射防御
         */
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
        System.out.println("construct!");
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


    /**
     * ObjectInputStream 里面关于校验readResolve
     *
     */

    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //保持单例
        return getInstance();
        //原型模式 拷贝
//        return super.clone();
    }
}

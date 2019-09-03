package com.geely.design.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    /**
     * 基于静态内部类延迟加载解决方案
     *
     * 类加载时机
     * 当外部类加载时，静态内部类还未加载
     *
     *
     * 线程0
     *        ——>                       -------------------------
     *              Class对象   ——>     | 1、分配对象内存空间
     *              的初始化锁   ——>     | 3、设置instance指向内存空间
     *        ——>                       |  2、初始化对象
     * 线程1                              |
     *                                    ------------------------
     * 由于Class对象的初始化锁，所以其他线程在未得到锁时 就在等待
     *
     */
    private StaticInnerClassSingleton(){
        System.out.println("innerClass");
        if(InnerClass.staticInnerClassSingleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
        System.out.println("innerClass construct!");
    }
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}

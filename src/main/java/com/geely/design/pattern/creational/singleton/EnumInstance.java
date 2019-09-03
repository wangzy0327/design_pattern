package com.geely.design.pattern.creational.singleton;

public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    //为了让外部调用
    protected abstract void printTest();
    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}

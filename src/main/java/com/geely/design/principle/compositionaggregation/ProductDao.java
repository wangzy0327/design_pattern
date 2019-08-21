package com.geely.design.principle.compositionaggregation;

public class ProductDao {

    private DBConnnection dbConnnection;

    public void setDbConnnection(DBConnnection dbConnnection) {
        this.dbConnnection = dbConnnection;
    }

    public void addProduct(){
        System.out.println("使用"+dbConnnection.getConnection()+"增加产品");
    }
}

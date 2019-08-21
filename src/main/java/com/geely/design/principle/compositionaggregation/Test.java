package com.geely.design.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnnection(new PostgreSQLConnection());
//        productDao.setDbConnnection(new MySQLConnection());
        productDao.addProduct();
    }
}

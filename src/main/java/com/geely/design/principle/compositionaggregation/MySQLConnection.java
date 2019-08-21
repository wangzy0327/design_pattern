package com.geely.design.principle.compositionaggregation;

public class MySQLConnection extends DBConnnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}

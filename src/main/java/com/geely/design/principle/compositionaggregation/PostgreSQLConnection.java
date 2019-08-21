package com.geely.design.principle.compositionaggregation;

public class PostgreSQLConnection extends DBConnnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}

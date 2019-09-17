package com.geely.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring 会自己注入，这里就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加订单");
        return iOrderDao.insert(order);
    }
}

package com.geely.design.pattern.structural.facade;

public class GiftExchangeService {
//    private PointsPaymentService pointsPaymentService;
//    private QualifyService qualifyService;
//    private ShippingService shippingService;

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

//    public PointsPaymentService getPointsPaymentService() {
//        return pointsPaymentService;
//    }
//
//    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
//        this.pointsPaymentService = pointsPaymentService;
//    }
//
//    public QualifyService getQualifyService() {
//        return qualifyService;
//    }
//
//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public ShippingService getShippingService() {
//        return shippingService;
//    }
//
//    public void setShippingService(ShippingService shippingService) {
//        this.shippingService = shippingService;
//    }

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格审核通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}

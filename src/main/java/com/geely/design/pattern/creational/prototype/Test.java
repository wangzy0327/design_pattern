package com.geely.design.pattern.creational.prototype;

public class Test {
    /**
     * 原型模式在内存中进行二进制流的拷贝
     * @param args
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        MailUtil.saveOriginMailRecord(mail);
        for(int i = 0;i<10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}

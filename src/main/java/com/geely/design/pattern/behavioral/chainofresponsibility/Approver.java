package com.geely.design.pattern.behavioral.chainofresponsibility;

public abstract class Approver {
    //审批者
    protected Approver approver;

    public void setNextApprver(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);

}

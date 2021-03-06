package com.geely.design.principle.liskovSubstitution;


public class Square implements Quadrangle{

    private long sideLength;

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}

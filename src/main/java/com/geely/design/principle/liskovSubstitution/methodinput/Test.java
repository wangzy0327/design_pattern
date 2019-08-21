package com.geely.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Base base = new Child();
        HashMap hashMap = new HashMap();
        base.method(hashMap);
    }
}

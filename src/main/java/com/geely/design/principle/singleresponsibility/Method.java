package com.geely.design.principle.singleresponsibility;

public class Method {

    private void updateUserInfo(String userName,String address){
        userName = "Geely";
        address = "Beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "Geely";
//        address = "Beijing";
    }

    private void updateUsername(String userName){
        userName = "Geely";
    }

    private void updateUserAddress(String address){
        address = "Beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            // todo Something1
        }else{
            // todo Somthing2
        }
        userName = "Geely";
        address = "Beijing";
    }
}

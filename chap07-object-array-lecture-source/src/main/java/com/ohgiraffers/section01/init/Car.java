package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed){
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
    }

    public void carMaxSpeedInfo(){
        System.out.println(modelName + "이(가) 최고속도 " + maxSpeed + "km/h로 달려갑니다.");
    }

}

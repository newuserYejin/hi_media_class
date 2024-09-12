package com.ohgiraffers.section04.use;

public class FarmCar extends Car{
    
    @Override
    public void go() {
        System.out.println("경운기 출발");
    }

    @Override
    public void stop() {
        System.out.println("경운기 멈춤");
    }
}

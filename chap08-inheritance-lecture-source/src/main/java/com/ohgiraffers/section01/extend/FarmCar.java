package com.ohgiraffers.section01.extend;

public class FarmCar extends Car{

    public FarmCar(){
        System.out.println("경운기 기본 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("덜덜더러더러러더러덛러더러덜");
    }

    @Override
    public void soundHorn() {
        System.out.println("경운기는 경적이 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("푸슝....");
    }
}

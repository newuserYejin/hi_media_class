package com.ohgiraffers.section04.use;

public class FIreCar extends Car implements SoundHorn{
    @Override
    public void go() {
        System.out.println("소방차 출발");
    }

    @Override
    public void stop() {
        System.out.println("소방차 멈춤");
    }

    @Override
    public void horn() {
        System.out.println("에에에에에에에에에ㅔ에에에에엥");
    }
}

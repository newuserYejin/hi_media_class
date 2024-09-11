package com.ohgiraffers.section01.polymorphism;

public class Raccoon extends Animals{

    @Override
    public void eat() {
        System.out.println("너구리가 너구리라면을 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("너구리가 잽싸게 뛰어갑니다.");
    }

    @Override
    public void howling() {
        System.out.println("너구리가 너굴너굴 울고 있습니다.");
    }

    public void bite(){
        System.out.println("너구리가 앙 깨물었습니다.");
    }
}

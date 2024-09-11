package com.ohgiraffers.section01.polymorphism;

public class Frog extends Animals{
    @Override
    public void eat() {
        System.out.println("개구리가 식탁에 앉아 햄버거를 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("개구리가 폴짝폴짝 뛰기 시작합니다.");
    }

    @Override
    public void howling() {
        System.out.println("개구리가 개굴개굴 울기 시작합니다.");
    }

    public void attack(){
        System.out.println("개구리가 혓바닥으로 때립니다.");
    }
}

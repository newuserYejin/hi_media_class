package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    @Override
    public void abstMethod() {
        System.out.println("Product클래스로부터 오버라이드 강제화된 smartPhone 메서드");
    }
    
    public void childMethod(){
        System.out.println("smartPhone 에 childMethod 호출");
    }
}

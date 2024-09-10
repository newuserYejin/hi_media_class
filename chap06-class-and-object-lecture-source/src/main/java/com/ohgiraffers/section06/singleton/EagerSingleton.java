package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    // 클래스가 초기화 되는 시점에 인스턴스 생성 (이름 초기화)
    private static EagerSingleton eager = new EagerSingleton();

    // 기본 생성자 private 으로 생성하여 new로 초기화 없이 호출 막기
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return eager;
    }

}

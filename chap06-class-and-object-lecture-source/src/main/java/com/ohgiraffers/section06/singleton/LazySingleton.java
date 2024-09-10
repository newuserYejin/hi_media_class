package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    // 클래스가 초기화 될 때 정적 필드로 선언 (아직 인스턴스 생성 X)
    private static LazySingleton lazy;

    // 기본 생성자 막기
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazy == null){              // 인스턴스가 만들어진적이 없다.
            // 1번이라도 생성되면 바로 return
            lazy = new LazySingleton();
        }

        return lazy;
    }

}

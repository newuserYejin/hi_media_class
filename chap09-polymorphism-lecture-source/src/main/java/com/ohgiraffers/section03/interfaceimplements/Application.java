package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        // 인터페이스
        // 추상 메서드와 상수 필드만 가질 수 있다.

        // 사용 목적
        /*
        * 1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성 부여 목적
        * 2. 자바가 가진 단일상속의 단점을 극복할 수 있다.
        * */

        // 인터페이스로 인터페이스 생성 불가
//        InterfaceProduct inter = new InterfaceProduct();

        InterfaceProduct inter = new Product();

        // 동적 바인딩 통해 오버라이딩 된 메소드 호출
        inter.nonStaticMethod();

    }
}

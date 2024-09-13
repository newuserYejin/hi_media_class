package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {
        // 제네릭
        // 클래스나 메소드에서 사용할 내부의 데이터 타입을 컴파일 시점에 지정하는 방법

        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        gt1.setValue(10);
        System.out.println("gt1.getValue() = " + gt1.getValue());

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("호");
        System.out.println(gt2.getValue());
        
        // 생성자 쪽 타입 생략 가능

    }
}

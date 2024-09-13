package com.ohgiraffers.section01.generic;

// 제네릭은 선언부에 <>를 이룔하여 작성
// T의 의미: Type 변수 -> 자료형 아직 미정
// 여러개의 타입 변수 작성 시, 나열 연산자(,)를 이용해서 여러개 기술 가능
public class GenericTest<T> {
    
    // <T> 대신 <내가 원하는 타입>으로 작성하면 컴파일 시 타입 결정된다

    private  T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

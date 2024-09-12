package com.ohgiraffers.section03.interfaceimplements;

// interface를 상속 받을때는 implements 사용
public class Product implements InterfaceProduct {

    // 이ㅏㄴ터페이스는 여러개를 상속 받을 수 있고, extends로 다른 클래스를 상속받는 경우에도 추가 상속 가능
    // 단, extends가 implements보다 앞에 작성되어야 한다.

    @Override
    public void nonStaticMethod() {
        System.out.println("interface의 nonstasic 메서드 호출");
    }
}

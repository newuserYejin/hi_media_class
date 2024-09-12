package com.ohgiraffers.section03.interfaceimplements;

public interface InterfaceProduct {
    
    // 상수필드만 작성 가능(public static final 키워드의 조합이 상수 필드)
    
    // 키워드 생략해도 묵시적 public static final 적용된다.
    int MAX_NUM = 10;

    // 인터페이스는 생성자를 가질 수 없다.
    // 인터페이스는 구현구를 가진 메소드를 가질 수 업사다
    // 추상 클래스에서 작성해둔 추상메소드만 작성할 수 있다.

    // 인터 페이스 내부의 메소드는 묵시적으로 public abstract의 의미를 가진다.
    void nonStaticMethod();
    
    // static 메소드는 작성 가능 (프로그램을 run했을때 생성되기 때문에 static메소드는 작성가능한거다.)
    static void staticMethod(){
        System.out.println("interface안에 static메소드 호출");
    }
}

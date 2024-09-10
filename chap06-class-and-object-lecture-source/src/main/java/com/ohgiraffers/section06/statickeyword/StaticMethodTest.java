package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonstatic 메소드 호출");
    }

    // static 메소드는 인스턴스를 생성하지 않고 사용되기 때문에 this 사용 불가
    public static void staticMethod(){
//        this.count++;
        System.out.println("static 메소드 호출");
    }

}

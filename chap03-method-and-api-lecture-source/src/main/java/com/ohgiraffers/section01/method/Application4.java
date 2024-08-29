package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4 = new Application4();

        app4.testArgsMethod("jin",24, '여');
        
        // 메소드를 호출할때는 개수와 순서(데이터 타입 맞추기)가 중요하다


    }
    public void testArgsMethod(String name, int age, final char gender) {

        // 여러개 전달 인자를 이용한 메소드 호출
        System.out.println("제이름은 "+name+"이고 "+age+"살 "+gender+"입니다.");
        
        
        

    }
}

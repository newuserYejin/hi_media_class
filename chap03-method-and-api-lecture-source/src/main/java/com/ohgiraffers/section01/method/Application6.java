package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        
        // 메소드의 return 값
        // return 문을 작성하면 돌아갈때 값을 가지고 돌아 갈 수 있다.
        // 이때 가지고 가는 값이 return 값이다.

        System.out.println("main 시작...");

        Application6 app6 = new Application6();

        System.out.println("app6.str() = " + app6.str());

        System.out.println("main 종료...");
        
    }

    public String str() {

        return "str";
    }
}

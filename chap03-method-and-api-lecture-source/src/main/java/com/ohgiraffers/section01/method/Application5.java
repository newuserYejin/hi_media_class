package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        // 메소드 리턴에 대해서 알 수 있다.
        // return 이란? 현재 메소드의 결과를 반환하며 종료
        // return 은 가장 마지막 줄에 작성해야하며 그렇지 않을 경우 그 아래의 코드가 실행되지 않는다.

        System.out.println("main 시작");

        Application5 application5 = new Application5();
        application5.testMethod();

        System.out.println("main 종료");
    }
    
    public void testMethod() {
        System.out.println("testMethod 호출");

        System.out.println("testMethod 종료");
    }
}

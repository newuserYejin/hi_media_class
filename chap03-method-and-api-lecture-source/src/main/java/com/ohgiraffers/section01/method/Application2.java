package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {
        Application2 app = new Application2();

        System.out.println("main 시작");
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("main 종료");
    }

    public void methodA() {
        System.out.println("methodA 호출");
        System.out.println("methodA 종료");
    }

    public void methodB() {
        System.out.println("methodB 호출");
        System.out.println("methodB 종료");
    }

    public void methodC() {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }
}

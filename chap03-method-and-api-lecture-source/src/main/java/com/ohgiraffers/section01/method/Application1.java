package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        //메소드의 흐름 이해
        System.out.println("main 시작");
        Application1 app1 = new Application1();
        app1.methodA();
        System.out.println("main 끝");
    }
    
    public void methodA () {
        System.out.println("methodA 웅장하게 등장~!");
        methodB();
        System.out.println("methodA 웅장하게 퇴장~!");
    }

    // methodB 만들어보기

    public void methodB () {
        System.out.println("methodB 등장 두둥탁!");
        System.out.println("methodB 퇴장 두둥탁!");
    }
}

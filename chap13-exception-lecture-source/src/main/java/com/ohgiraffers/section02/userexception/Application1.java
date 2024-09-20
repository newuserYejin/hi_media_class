package com.ohgiraffers.section02.userexception;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest2 et = new ExceptionTest2();

        et.checkEnoughMoney(20000, 30000);
    }
}

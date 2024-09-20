package com.ohgiraffers.section02.userexception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest2 et = new ExceptionTest2();

        try {
//            et.checkEnoughMoney(-20000, 30000);
//            et.checkEnoughMoney(20000, -30000);
            et.checkEnoughMoney(200000, 30000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

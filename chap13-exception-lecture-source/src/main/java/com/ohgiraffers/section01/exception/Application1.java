package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {

        // 예외처리

        /*
        * Error
        * 시스템 상에서 프로그램에 심각한 문제가 발생되어 종료되는것
        *
        * Exception
        * 프로그램을 비정상적으로 종료시키지만
        * 발생할 수 있는 상황을 예측하여 처리할 수 있는 미약한 오류를 의미한다.
        * */



        ExceptionTest et = new ExceptionTest();

        // 상품을 사야하는데 상품 가격이 30000원이고 소유금액은 50000원인 경우, 10000원인 경우.

        et.checkEnoughMoney(30000,50000);

        et.checkEnoughMoney(30000,10000);

        System.out.println("프로그램 종료");


    }
}

package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가진 돈: " + money);

        if (money >= price){
            System.out.println("상품을 구매할 수 있습니다.");
        } else {
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑 하세요.");
    }
}

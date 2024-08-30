package com.ohgiraffers.section01.method.HomeWork2;

public class User {
    public static void main(String[] args) {

        int sum = 0;

        Account ac = new Account();

        sum = ac.add(300,sum);
        sum = ac.sub(60,sum);
        sum = ac.sub(5,sum);
        sum = ac.sub(15,sum);
        sum = ac.add(20,sum);
        sum = ac.event(1.1,sum);

        System.out.println("현재 현승이의 통장 잔액은 " + sum + "원 입니다.");
    }
}

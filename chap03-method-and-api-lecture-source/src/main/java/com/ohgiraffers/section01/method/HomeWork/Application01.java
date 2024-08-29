package com.ohgiraffers.section01.method.HomeWork;

public class Application01 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.checkMethod();
        System.out.println("10과 20의 합 : " + cal.sumTwoNumber(10,20));
        System.out.println("10과 5의 차 : " + cal.minusTwoNumber(10,5));
        System.out.println("10과 5의 곱 : " + cal.multiTwoNumber(10,5));
        System.out.println("10과 5의 나눈 후 몫 : " + cal.divideTwoNumber(10,5));
    }
}

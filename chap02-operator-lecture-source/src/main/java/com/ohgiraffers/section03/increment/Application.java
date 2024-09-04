package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {

        // 증감 연산자

        // ++, --

        int num = 1;

        System.out.println("++num = " + ++num);

        num =1;
        System.out.println("num++ = " + num++);
        System.out.println("2번째 num++ = " + num);

        int firstnum = 20;
        int result1 = firstnum++ * 3;

        System.out.println("result = " + result1);
        System.out.println("firstnum = " + firstnum);

        int secondNum = 20;
        int result2 = ++secondNum * 3;

        System.out.println("result = " + result2);
        System.out.println("secondNum = " + secondNum);
        
        int thirdNum = 20;
        int result3 = thirdNum++;

        System.out.println("result3 = " + result3);
        System.out.println("thirdNum = " + thirdNum);

    }
}

package com.ohgiraffers.section01.method;

public class Home2 {
    public static void main(String[] args) {
        int num1 = 37;
        int num2 = -4;
        int num3 = 0;

        Home2 home = new Home2();

        System.out.println("num1 = "+ home.isEven(num1));
        System.out.println("num2 = "+ home.isEven(num2));
        System.out.println("num3 = "+ home.isEven(num3));
    }

    public String isEven(int num){
        String result = (num == 0)? "0입니다.": (num % 2 == 0) ? "참" : "거짓";

        return result;
    }
}

package com.ohgiraffers.section01.method;

public class Home2 {
    public static void main(String[] args) {
        int num1 = 37;
        int num2 = 28;

        Home2 home = new Home2();

        System.out.println("num1 = "+ home.isEven(num1));
        System.out.println("num2 = "+ home.isEven(num2));
    }

    public String isEven(int num){
        String result = (num % 2 == 0) ? "참" : "거짓";

        return result;
    }
}

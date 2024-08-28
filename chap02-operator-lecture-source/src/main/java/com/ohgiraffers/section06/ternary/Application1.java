package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {

        // 삼항연산자
        // (조건식) ? 참일 때 값 : 거짓일 때 값

        int num1 =10;
        int num2 =-10;

        String result1 = num1 == num2 ? "ture" : "false";
        String result2 = num1 > 0 ? "양수" : "음수";
        String result3 = num2 > 0 ? "양수" : "음수";
        String result4 = num1 != num2 ? "다르다" : "같다";

        System.out.println("num1과 num2는 같다. : " + result1);
        System.out.println("num1은 " + result2);
        System.out.println("num2은 " + result3);
        System.out.println("num1과 num2는 " + result4);

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result5 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0 이다" : "음수다";
        String result6 = (num4 > 0) ? "양수다" : (num4 == 0) ? "0 이다" : "음수다";
        String result7 = (num5 > 0) ? "양수다" : (num5 == 0) ? "0 이다" : "음수다";

        System.out.println();
        System.out.println("num3은 " + result5);
        System.out.println("num4은 " + result6);
        System.out.println("num5은 " + result7);

    }
}

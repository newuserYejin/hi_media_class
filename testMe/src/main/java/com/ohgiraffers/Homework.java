package com.ohgiraffers;

public class Homework {
    public static void main(String[] args) {

        // 문제 1.

        int a = 20;
        int b = 30;

        System.out.println("--출력 예시--");
        System.out.println("더하기 결과 :"+ (a+b));
        System.out.println("빼기 결과 :"+ (a-b));
        System.out.println("곱하기 결과 :"+ (a*b));
        System.out.println("나누기한 몫 :"+ (a/b));
        System.out.println("나누기한 나머지 :"+ (a%b));

        // 문제 2.

        double width = 12.5;
        double height = 36.4;

        double area = width * height;
        double round = (width + height) * 2;

        System.out.println("\n"+"--출력 예시--");
        System.out.println("면적 :" + area);
        System.out.println("둘레 :" + round);
  }
}

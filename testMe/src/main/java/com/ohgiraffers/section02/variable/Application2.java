package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        // 변수를 선언하고 사용하는 방법
        // 1. 변수를 준비한다.
        // 2. 변수에 값을 대입한다.
        // 3. 변수를 사용한다.

        // 1. 변수를 준비 ex) int num;
        String str;

        // 2. 변수에 값을 대입하고 초기화 한다.
        str = "호이짜짜";
        
        // 3. 변수를 사용한다.
        System.out.println(str);
        byte bnum =1;
        short snum =2;
        int num =4;
        Long lnum =8L;

        float fnum =4.0f;
        double dnum =8.0;

        char ch ='a';       // 문자는 내부적으로 숫자이기 때문에 아스키코드 숫자로 표현 가능

        Boolean isTrue =true;

        String st = "안녕하세요";

    }
}

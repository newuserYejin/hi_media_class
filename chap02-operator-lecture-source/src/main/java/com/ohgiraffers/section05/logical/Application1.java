package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        
        // 논리연산자
        // 참과 거짓으로 결과를 반환한다

        // 'f' 대 소문자 상관없이 영어인지 확인해보기

        char ch = ';';
        char a = 'A';
        char z = 'z';

        if ((int)a <= (int)ch && (int)ch <= (int)z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("영어인지 판별하기: "+((ch>='A' && ch<='Z') || (ch>='a' && ch <='z') ? true : false));
    }
}

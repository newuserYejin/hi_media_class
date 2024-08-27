package com.ohgiraffers.section04.comparison;

public class Application {
    public static void main(String[] args) {

        // 비교연산자

        // 문자 값 비교

        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println(ch1 == ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 <= ch2);

        // 문자열 비교 , 문자열은 동등 비교는 가능하지만 대소 비교는 불가하다

        String str1 = "you";
        String str2 = "you";

        System.out.println("===============");
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
        System.out.println(str1.equals(str2));
    }
}

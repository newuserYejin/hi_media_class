package com.ohgiraffers.section01.string;

public class Application02 {
    public static void main(String[] args) {
        
        // 문자열 객체를 만드는 방법
        
        /*
        * 1. ""리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(싱글톤)
        * 2. new String("문지열")
        * */

        String str1 = "java";
        String str2 = "python";
        String str3 = "java";

        System.out.println(str1 == str3);
        System.out.println(str1 == str2);

        
    }
}

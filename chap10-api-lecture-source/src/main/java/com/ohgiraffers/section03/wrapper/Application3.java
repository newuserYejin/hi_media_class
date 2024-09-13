package com.ohgiraffers.section03.wrapper;

public class Application3 {
    public static void main(String[] args) {
        
        // valueof() : 기본 자료형 Wrapper 클래스 타입으로 변환
        // toString(): 필드 값 문자열로 반환

        String i = Integer.valueOf(2).toString();
        String b = Byte.valueOf((byte)2).toString();

        String str2 = 7 + "";
    }
}

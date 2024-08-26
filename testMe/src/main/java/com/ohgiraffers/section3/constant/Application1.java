package com.ohgiraffers.section3.constant;

public class Application1 {
    public static void main(String[] args) {
        /*상수란?
        * 변수 - 메모리에 변경될 수 있는 값을 저장하기 위한 공간
        * 상수 - 변하지 않는 값 (고정된 값)을 저장하기 위한 공간
        *
        * 선언하는 방법
        * 1. 앞에 final을 붙여 선언한다. (보통 대문자로 작성)
        * 2. 값을 초기화(대입) 한다.
        * 3. 필요한 곳에서 호출하여 사용
         */
        
        final int AGE;
        
        AGE = 10;

        System.out.println("AGE = " + AGE);
    }
}

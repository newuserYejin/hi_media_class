package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        // import

        // 다른 패키지에 있는 클래스를 사용하는 경우 사용

        Calculator cal = new Calculator();

        // non-static 메소드 호출
        System.out.println(cal.add(3,4));

        // static 메소드 호출
        System.out.println(Calculator.avg(3,4));

    }
}

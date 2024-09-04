package com.ohgiraffers.section02.package_and_import;


public class Application1 {
    public static void main(String[] args) {

        // 패키지

        // 경로를 이용해 호출 할때는 java 밑에서부터 작성해야한다.
        // 같은 패키지 내의 클래스를 호출할때는 경로를 생략해도 된다.
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        System.out.println(cal.min(30,50));
        
        // static 호출
        double avg = com.ohgiraffers.section01.method.Calculator.avg(10,30);
        System.out.println("avg = " + avg);
    }
}

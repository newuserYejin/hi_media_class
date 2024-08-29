package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.avg;

public class Application9 {
    public static void main(String[] args) {
        
        // 다른 클래스레 작성한 메소드 호출
        
        // calculator는 2개의 정수를 전달 받아 각종연산 수행하는 메서드

        Calculator cal = new Calculator();
        System.out.println("add = " + cal.add(5,3));
        System.out.println("sub = " + cal.sub(5,3));
        System.out.println("mul = " + cal.mul(5,3));
        System.out.println("div = " + cal.div(5,3));

        System.out.println("max = " + cal.max(5,3));
        System.out.println("min = " + cal.min(5,3));

        // static이 있는 메소드는 new를 통한 선언으로 호출하는 것이 아닌 해당 클래스명.메소드()로 바로 호출한다.
        System.out.println("avg = " + Calculator.avg(5,4));
        System.out.println("import avg = "+avg(2,9));
    }
}

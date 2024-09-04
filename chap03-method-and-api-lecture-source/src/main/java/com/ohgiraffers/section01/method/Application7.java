package com.ohgiraffers.section01.method;

import java.util.*;

public class Application7 {

    public static void main(String[] args) {
        
        // 매개변수와 리턴값을 복합적으로 사용하는 것을 이해할 수 있다.
        
        // 계산기 만들기

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        Application7 app7 = new Application7();

        System.out.println("add: "+app7.add(a,b));
        System.out.println("sub: "+app7.sub(a,b));
        System.out.println("mul: "+app7.mul(a,b));
        System.out.println("div: "+app7.div(a,b));

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}

package com.ohgiraffers.section01.method;

public class Home {

    public static void main(String[] args) {
        int a = 5;  // 8월 10일 기준
        int b = 0;
        boolean A = a > 8 || a+b>=8 ? true : false ;
        boolean B = b>=4 ? true : false ;

        System.out.println("8/18==========");
        System.out.println("A패키지: "+ a + "/8" + "출발 " + (A?"가능":"불가능"));
        System.out.println("B패키지: "+ b + "/4" + "출발 " + (B?"가능":((a+b)>=8)?"A회사에 합류해서 가능":"불가능"));

        System.out.println("8/20==========");
        b = 4;

        A = a > 8 || a+b>=8 ? true : false ;
        B = b>=4 ? true : false ;

        System.out.println("A패키지: "+ a + "/8" + "출발 " + (A?"가능":"불가능"));
        System.out.println("B패키지: "+ b + "/4" + "출발 " + (B?"가능":((a+b)>=8)?"A회사에 합류해서 가능":"불가능"));

    }
}

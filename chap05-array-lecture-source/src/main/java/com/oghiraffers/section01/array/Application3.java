package com.oghiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        // 배열에 초기화되는 자료형별 기본 값을 알 수 있다.

        /*
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 :
        * 참조 : void*/

        char[] carr = new char[]{'d','s','a','r'};
        int[] iarr = new int[5];

        System.out.println(iarr[1]);

        int[] iarr2 = {11,12,33,123,432};
        int[] iarr3 = new int[] {13,24,32,411,23,2};

        for (int i : iarr2){
            System.out.println(i);
        }

        for (char i : carr){
            System.out.println(i);
        }
    }
}

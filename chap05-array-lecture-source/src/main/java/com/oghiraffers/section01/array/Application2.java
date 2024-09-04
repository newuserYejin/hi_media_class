package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        // 자료형[] 배열명
        // 자료형 배열명[] 상관없음
        
        int[] iarr;
        char carr[];

        // 레퍼런스 변수(참조형 변수)
        // new 할당 연산자는 heap 영역 공간에 할당하고, 발생한 주소 값을 반환해주는 연산자다.

        iarr = new int[5];

        // 선언과 할당 동시 가능
        int[] iarr2 = new int[5];
        char carr2[] = new char[10]; 

        // heap메모리는 이름으로 접근이 아닌 주소로 접근
        
        System.out.println("iarr2 = " + iarr2);
        System.out.println("carr2 = " + carr2);
        
        // hashcode() : 객체 주소 값(16진수) -> 우리가 아는 수(10진수)로 바꿔주는 메소드

        System.out.println("iarr2.hashCode() = " + iarr2.hashCode());
        System.out.println("carr2.hashCode() = " + carr2.hashCode());
        
        // 배열의 길이 제공 : length
        // 배열의 length는 메소드가 아닌 필드이기 때문에 () 필요 없음

        System.out.println("iarr의 길이: " + iarr2.length);
        System.out.println("carr의 길이: " + carr2.length);

        // 변수를 이용해서 배열의 길이 지정

        // new 키워드로 인해 stack에 sc라는 이름으로 주소를 출력하는 Scanner가 생성되지만 데이터는 heap에 저장된다.
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이를 입력해주세요: ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 해시코드 : " + darr.hashCode());

        System.out.println("darr의 길이 : " + darr.length);
        
        // 한번 지정한 배열의 크기 변경 불가

        darr = new double[10];
        System.out.println("darr의 해시코드 : " + darr.hashCode());

        System.out.println("darr의 길이 : " + darr.length);
        
        // 가르키고 있는 주소 값을 없애버린다 -> NullPointException 발생
//        darr  = null;

        // NullPointException : 아무것도 참조하지 않고 null을 참조하고 있을때 참조 연산자(.)를 사용할 때 발생하는 에러




    }
}

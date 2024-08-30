package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {

        // Math 클래스 사용

        // api -> 운영체제나 프로그래밍 언어가 제공하는 기능을 이용할 수 있도록 만든 인터페이스
        
        // abs(절댓값) 사용하기
        System.out.println(Math.abs(-7));

        // 최댓값과 최솟값 출력
        System.out.println("최댓값: " + Math.max(10,20));
        System.out.println("최댓값: " + Math.min(10,20));

        // 난수 출력
        System.out.println("랜덤값 출력: "+Math.random());

        // 루트값
        System.out.println("루트값: "+Math.sqrt(9));
    }
}

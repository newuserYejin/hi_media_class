package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    
    // if-else의 흐름

    // 정수 한개를 입력받아 홀수 판별 작성

    public void testIfElseStatement(){

        Scanner sc = new Scanner(System.in);

        System.out.print("양수의 숫자를 입력해주세요: ");
        int num  = sc.nextInt();

        if (num % 2 == 1){
            System.out.println("입력하신 수는 홀수 입니다.");
        } else {
            System.out.println("입력하신 수는 짝수 입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    // 숫자를 하나 입력받아 양수 음수를 판단하고 0일경우 0이라고 출력하라, 조건과 상과없이 프로그램 종료시에는 안내한다.
    public void testNestedIfElseStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num  = sc.nextInt();

        if (num < 0 ){
            System.out.println("입력하신 수는 음수 입니다.");
        } else if (num > 0) {
            System.out.println("입력하신 수는 양수 입니다.");
        } else {
            System.out.println("입력하신 수는 0입니다.");
        }
    }
    
}

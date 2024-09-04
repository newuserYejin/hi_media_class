package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    // if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.

    /*표현식
    if(조건식){
        조건이 true 일 때 수행할 명령문
    }
    
    조건식 : true 나 false가 나오는 연산식
    */
    
    // 짝수 판별문제 작성
    
    public void testSimpleStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자하나를 입력해주세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else {
            System.out.println("입력하신 숫자는 짝수가 아닙니다.");
        }

        System.out.println("프로그램이 종료됩니다.");
    }

    // 숫자를 입력받아 숫자가 양수인 경우에만 짝수 판별 진행, 종료시에는 종료 안애 띄우기
    
    public void testNestedIfStatement() {
        
        Scanner sc = new Scanner(System.in);
        
        int num;

        System.out.print("숫자를 입력해주세요 : ");
        num  = sc.nextInt();

        if (num > 0){
            if (num %2 == 0){
                System.out.println("입력하신 수는 양수이면서 짝수 입니다.");
            } else {
                System.out.println("입력하신 수는 양수이지만 짝수가 아닙니다.");
            }
        } else {
            System.out.println("입력하신 수는 0 보다 큰 양수가 아닙니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }

    //
}

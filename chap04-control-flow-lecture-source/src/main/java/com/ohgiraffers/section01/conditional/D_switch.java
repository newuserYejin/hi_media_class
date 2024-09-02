package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    
    // switch 문
    
    // 표현식

    /*
    * switch(비교할 변수){
    *       case 비교값1: 비교값1과 일치할 경우 수행할 명령어
     *      case 비교값2: 비교값2과 일치할 경우 수행할 명령어
     *      case 비교값3: 비교값3과 일치할 경우 수행할 명령어
     *      default : case 모두 해당하지 않을 경우 수행할 명령문
     * }
     */

    // switch 에서 실수와 논리는 비교 불가, case 에서 변수 사용 불가
    
    // 정수 2개와 기호 문자를 입력받는 계산기

    public void testSwitchStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력해주세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수를 입력해주세요: ");
        int num2 = sc.nextInt();

        System.out.print("연산기호 입력: + - * /(몫)");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1-num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/' :
                result = num1 / num2;
                break;

            default:
                System.out.println("올바른 입력값들을 입력하지 않으셨습니다.");
        }

        System.out.println(num1+" "+op+" "+num2+"= "+result);
    }
    
    // 자판기
    
    public void testSwitchVendingMachine(){
        System.out.println("=======HiMedia 음료 자판기=======");
        System.out.println("사이다  맥콜  눈의솔  콜라  환타  밀키스");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);
        System.out.print("음료를 선택해 주세요: ");

        String selectDrink = sc.nextLine();
        int price = 0;



    }
}

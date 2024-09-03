package com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    // for

    // 표현식
    /*
    * for(초기식; 조건식; 증감식) {
    *       조건을 만족하는 경우 수행하는 구문
    * }
    * */

    public void testSimpleForStatement(){
        for(int i = 1; i <=10 ; i++){
            System.out.println(i);
        }
    }

    // 10명의 학생 이름을 입력 받아 출력하기

    public void testForExample() {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.print("학생의 이름을 입력해주세요: ");
            String name = sc.nextLine();
            System.out.println(i+"번째 학생의 이름은 "+name+"입니다.");
        }

    }

    public void testForExample2(){
        int sum =0;

        for (int i=1;i<=10;i++){
            sum +=i;
            System.out.println(i+"까지의 합 sum: "+sum);
        }

        System.out.println("sum = " + sum);
    }

    public void testForExample3(){
        int sum = 0;

        Random random = new Random();
        int num = random.nextInt(5,11);

        System.out.println("난수 num = " + num);

        for (int i=1;i<=num;i++){
            sum += i;
        }

        System.out.println("총합 = " + sum);
    }

    // 숫자 2개를 입력 받아 작은 수에서 큰수까지의 합 구하기
    // 단, 두 수는 같지 않다.
    public void testForExample4(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int num2 = sc.nextInt();

        int sum = 0;

        if (num1 > num2){
            for (int i = num2;i<=num1;i++){
                sum += i;
            }
        } else {
            for (int i = num1;i<=num2;i++){
                sum += i;
            }
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("sum = " + sum);
    }

    public void gugudan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("출력하실 단을 입력해주세요: ");
        int num = sc.nextInt();

        if (num < 1){
            System.out.println("구구단은 1단부터 가능합니다.");
        } else {
            for (int i = 1;i<=9;i++){
                System.out.println(num + " * " + i + " = " + num *i);
            }
        }

    }

}

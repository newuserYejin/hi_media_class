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
}

package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {
        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 :");
        int num = sc.nextInt();

        for(int i = 1; i < num+1;i++){
            if (i %2 ==1){
                System.out.print('토');
            } else {
                System.out.print('마');
            }
        }

    }

}

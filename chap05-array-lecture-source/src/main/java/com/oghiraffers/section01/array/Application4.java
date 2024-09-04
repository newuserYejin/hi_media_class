package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {
        
        // 5명의 점수를 입력받아 합계와 평균을 실수로 구하기

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        for (int i = 0; i<score.length;i++){
            System.out.print(i+1+"의 점수를 입력해주세요: ");
            score[i] = sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i<score.length;i++){
            sum +=score[i];
        }

        avg = sum/score.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);


    }

}

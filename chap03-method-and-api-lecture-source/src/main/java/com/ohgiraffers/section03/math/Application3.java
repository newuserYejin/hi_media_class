package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {

        // java.util.Random 사용
        
        // random.nextInt( 시작, 구하려는 난수의 범위의 크기)
        // random.nextInt(구하는 범위의 크기) + 최소 시작 값

        Random random = new Random();

        System.out.println("random Number: "+random.nextInt(-10,4));

        // 1~10 사이의 난수 출력
        System.out.println(random.nextInt(10) + 1);

        // 10~15 사이의 난수 출력
        System.out.println(random.nextInt(6) + 10);

        // -128~127 사이의 난수 출력
        System.out.println(random.nextInt(256) -128);

    }
}

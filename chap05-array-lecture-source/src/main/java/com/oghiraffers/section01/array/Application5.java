package com.oghiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        
        // 배열 사용한 원카드 예제
        
        // 랜덤한 카드 한장 뽑아서 출력
        
        // 숫자 & 문양 배열 따로 생성해서 조합

        String[] shapes = {"spade","clover","heart","diamond"};
        String[] number = {"2","3","4","5","6","7","8","9","10","king","queen","jack"};

        int num1 = (int)(Math.random() * shapes.length);

        Random random = new Random();
        int num2 = random.nextInt(number.length+1) - 1;

        System.out.println(shapes[num1] + " " + number[num2]);
        
    }
}

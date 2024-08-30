package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        // 난수의 활용
        // Math.random()은 0이상 1미만의 난수를 출력해준다.
        // 공식 : Math.random() * (범위의 크기) + 최솟값
        // 범위의 크기 : 최댓값 + 1 - 최솟값
        
        // 1~10 사이의 난수 출력

        System.out.println("1~10 사이: "+(int)(Math.random() * 10 +1));

        // 10~15 사이의 난수 출력
        System.out.println("10~15 사이: "+(int)(Math.random()*6 + 10));

        // -128~127 사이의 난수 출력
        System.out.println("-128~127 사이: "+ (int)(Math.random()*256 -128));


    }
}

package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {

        // 형 변환 시 주의점

        // ★ 데이터 손실 ★

        // 1. 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("bnum = " + bnum);       // byte의 크기보다 큰 숫자를 강제 형 변환하는 과정에서 데이터가 손실됐다.
        
        // 2. 고의적인 데이터 손실
        double height = 175.5;
        int cellHeight = (int) height;

        System.out.println("cellHeight = " + cellHeight);

        double kuk = 80.5;
        double math = 50.6;
        double eng = 70.8;

        System.out.println("--출력 예시--");
        System.out.println("총점 : " + (int)(kuk + math + eng));
        System.out.println("평균 : " + (int)(kuk + math + eng) / 3);

    }
}

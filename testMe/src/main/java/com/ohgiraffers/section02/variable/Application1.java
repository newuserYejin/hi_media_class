package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        // 변수 사용 목적 이해
        // 1. 값의 의미를 부여
        // 2. 한번 저장해둔 값을 재사용하기 위한 목적
        // 3. 시간에 따라 변하는 값을 저장하고 사용
        
        // 1. 값의 의미
        System.out.println("=======값의 의미부여 테스트=======");
        System.out.println("보너스를 포함한 급여 : " + (1000000+200000));

        int pay = 1000000;
        int bonus = 200000;

        System.out.println("변수를 이용해서 출력 : "+ (pay + bonus));

        // 2. 값 재사용 하기
        System.out.println("=======값 재사용 테스트=======");

        for(int i = 0; i <10 ; i++){
            System.out.println((i+1)+"번 고객에게 100포인트를 지급했습니다.");
        }
        
        // 3. 시간에 따라 변경되는 값을 저장하고 사용하기
        System.out.println("=======변수에 저장된 값 변경 테스트=======");
        
        int sum = 0;
        System.out.println("sum = " + sum);

        sum = sum +10;
        System.out.println("두번째 sum = " + sum);

        sum = sum +10;
        System.out.println("세번째 sum = " + sum);
    }
}

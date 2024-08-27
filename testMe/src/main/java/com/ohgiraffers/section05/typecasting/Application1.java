package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        // 형 변환
        // java에서는 같은 데이터 타입끼리만의 연산이 가능하기 때문에 형 변환이 필요하다

        // 형 변환 테스트
        int num1 =10 ;
        long num2 =10 ;

        long result = num1 + num2;
//        int result = num1 + num2;                 자동으로 큰 쪽인 long로 변환되기 때문에 int형에 결과를 넣는 것은 불가능

        float fnum = 4.0f;
        double dnum = fnum;

        double re = fnum + dnum;

        // 정수와 실수의 연산은 실수로 결과가 반영된다.



    }
}

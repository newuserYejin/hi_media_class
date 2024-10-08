package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

        String[] str = {"딸기","바나나","복숭아","키위","사과"};

        Scanner sc = new Scanner(System.in);
        System.out.print("0~4까지의 수를 입력해주세요: ");
        int num = sc.nextInt();

        while (num < 0 || num >4){
            System.out.print("준비된 과일이 없습니다. 0~4까지의 수로 다시 입력해주세요: ");
            num = sc.nextInt();
        }

        System.out.println(str[num]);
    }
}

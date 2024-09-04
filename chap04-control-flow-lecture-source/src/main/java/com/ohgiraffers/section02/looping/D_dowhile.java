package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_dowhile {

    // do-while

    // 표현식
    /*
    * do {
    *       1회차에는 무조건 실행
    *       아래 조건을 만족한는 경우에만 반복
    *       증감식;
    * } while (조건식)
    * */

    public void testDoWhileStatement(){
        int num = 0;

        do {
            System.out.println("최초 1번");
            num++;
        }while (num <3);

        System.out.println("while 테스트 중");
    }

    public void doWhileExample(){
        // 문자열 입력 받아 반복적으로 출력하기
        // 단, exit라고 입력 시 반목문 종료

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("문자열 입력: ");
            str = sc.nextLine();
            System.out.println(str);
        }while (!str.equals("exit"));

        System.out.println("do-while 종료");
    }

}

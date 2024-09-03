package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testWhileStatement(){
        int i = 1;
        while(i <=10){
            System.out.println(i);
            i++;
        }
    }

    public void whileExample(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        // charAt() : 해당 인덱스 위치의 문자를 char형으로 반환해준다.

        for (int i =0; i < str.length();i++){
            System.out.println(str.charAt(i));
        }

    }

}

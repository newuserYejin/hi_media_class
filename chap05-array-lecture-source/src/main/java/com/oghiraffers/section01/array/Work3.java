package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요: ");
        String str = sc.nextLine();
        char[] ch =new char[str.length()];

        int count = 0;

        System.out.print("출력: ");
        for (int i= 0; i< str.length(); i++) {
            ch[i] = str.charAt(i);

            if (Character.isDigit(ch[i])){
                count ++;
            }

            if (count > 7){
                ch[i] = '*';
            }

            System.out.print(ch[i]);
        }


    }
}

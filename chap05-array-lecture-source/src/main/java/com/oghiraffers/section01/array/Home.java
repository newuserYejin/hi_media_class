package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        // 중복 문자열 제거
        // 원하는 출력 결과 : a p l e

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        System.out.print("결과: ");

        for (int i = 0; i<str.length(); i++){
            ch[i] = str.charAt(i);

            boolean isMatch = true;     // true면 일치하는게 없음 false면 일치하는 거 있음

            if (Character.isLetter(ch[i])){
                for (int j = 0; j < i; j++){
                    if (ch[i] == ch[j]){
                        isMatch = false;
                        break;
                    }
                }

                if (isMatch){
                    System.out.print(ch[i] + " ");
                }
            }
        }


    }
}

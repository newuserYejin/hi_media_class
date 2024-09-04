package com.oghiraffers.section01.array;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요: ");
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        // ch에 문자열 한글자씩 넣기
        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        System.out.println("구성요소: ");
        
        for (int i = 0; i < ch.length; i++){
            
            boolean isMatch = true;         // true면 일치하는거 없음, 각 문자별오 isMatch가 필요하기 때문에 for안에서 정의

            // 문자인지 확인
            if (Character.isLetter(ch[i])) {

                Character.isL
                
                // 내 앞에서만 나랑 안 겹치면 되니까 i보다 작은데까지만 비교
                for (int j = 0; j < i; j++) {
                    if (ch[i] == ch[j]){
                        isMatch = false;
                        break;
                    }
                }

                // 출력문이 for 안으로 들어가면 반복적으로 출력되기 때문에 출력해도 되는지 밖에서 판별
                
                // 그러기 위해서 판별기준이 되는 isMatch 필요
                if (isMatch){
                    System.out.print(ch[i] + " ");
                }
            } else {
                continue;
            }
        }

    }
}

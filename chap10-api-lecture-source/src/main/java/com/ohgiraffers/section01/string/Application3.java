package com.ohgiraffers.section01.string;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        
        // split() : 정규식을 이용해 문자열 분리

        // StringTokenizer (문자열을 분리해주지만 공백은 무시해준다)

        String employee1 = "유관순/18세/서울";

        StringTokenizer str1 = new StringTokenizer(employee1,"/");

        while (str1.hasMoreTokens()){
            System.out.println("str1:" + str1.nextToken());
        }
    }
}

package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        // nextLine() : 공백 문자를 개행문자(줄 바꿈) 전까지 포함한 한줄
        // next() : 공백문자나 개행문자(줄바꿈) 전까지

        Scanner scan = new Scanner(System.in);

        // 문자열 입력
        System.out.println("입력한 문자열: "+scan.nextLine());

        // 문자 입력
        System.out.println("공백 포함 입력한 문자 중 첫 단어: " + scan.next());
        System.out.println("공백 포함 입력한 문자 중 첫 단어: " + scan.next());
        System.out.println("공백 포함 입력한 문자 중 첫 단어: " + scan.next());
    }
}

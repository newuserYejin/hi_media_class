package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        // Scanner
        Scanner scan = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.println("이름을 입력해주세요: ");
        System.out.println("당신의 이름은? "+scan.nextLine());
        
        // 정수형 값 입력 받기
        int age = scan.nextInt();
        System.out.println("입력하신 나이는 : " + age);

        // 실수 값 입력 받기
        Double num = scan.nextDouble();
        System.out.println("입력한 실수: "+num);

        // 논리형 입력 받기
        boolean bool = scan.nextBoolean();
        System.out.println("입력 논리: "+bool);

        // 문자 분리해서 사용하기
        scan.nextLine();
        System.out.println(scan.nextLine().charAt(0));
        
    }
}

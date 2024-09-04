package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        String[] com = {"scissors","rock","paper"};

        Scanner scan = new Scanner(System.in);
        System.out.print("scissors rock paper 중 선택해서 입력해주세요: ");

        String userResult = scan.next();
        String comResult = com[random()];
        System.out.println("컴퓨터가 낸 값:"+comResult);

        String result = "tie(무승부)" ;

        if (comResult.equals("scissors")){
            if (userResult.equals("rock")){
                result = "user win";
            } else if (userResult.equals("paper")) {
                result = "user lose";
            }
        } else if (comResult.equals("rock")) {
            if (userResult.equals("scissors")){
                result = "user lose";
            } else if (userResult.equals("paper")) {
                result = "user win";
            }
        } else if (comResult.equals("paper")){
            if (userResult.equals("scissors")){
                result = "user win";
            } else if (userResult.equals("rock")) {
                result = "user lose";
            }
        }

        System.out.println("result : " + result);
    }

    public static int random(){
        return (int)(Math.random()*3);
    }
}

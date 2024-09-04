package com.ohgiraffers.section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        String[] menu = {"한식","중식","일식","양식","분식","베이커리","샐러드","동남아","패스트푸드","편의점 간편식"};
//
//        int num = random.nextInt(0,10);
//
//        System.out.println(num+1);
//        System.out.println("오늘의 메뉴: " + menu[num]);

        boolean userLose = true;

        Random random = new Random();
        int com = random.nextInt(1,4);

        Scanner sc = new Scanner(System.in);
        
        while (userLose) {
            System.out.print("\n"+"가위(1) 바위(2) 보(3) 중 숫자로 입력하세요 (만약 100을 입력하면 게임이 종료됩니다.): ");
            int user = sc.nextInt();

            if (user == 100){
                break;
            }

            System.out.println("com: " + com);
            System.out.println("user: " + user);

            if (user != 1 && user !=2 && user !=3){
                System.out.println("가위(1) 바위(2) 보(3) 중 숫자로 입력하셔야 합니다.");
            } else if (com == user) {
                System.out.println("무승부 입니다. 다시 진행주세요.");
            } else if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1) ){
                System.out.println("당신이 승리했습니다!!");
                userLose = false;
            } else {
                System.out.println("당신이 패배했습니다. 승리할 때까지 계속해보세요.");
            }
        }

        System.out.println("\n"+"게임 종료");

    }
}

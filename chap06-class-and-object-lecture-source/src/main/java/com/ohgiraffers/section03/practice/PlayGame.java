package com.ohgiraffers.section03.practice;

import java.util.Scanner;

public class PlayGame {

    // 아래쪽의
    private static Racer racer = new Racer();

    public static void startGame() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========================= 카레이싱 =========================");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");

            System.out.print("메뉴를 선택해주세요: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    racer.turnOn();
                    break;
                case 2:
                    racer.letGo();
                    break;
                case 3:
                    racer.letStop();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램이 종료 됩니다.");
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다.");
                    break;
            }

            if (num == 9) {
                break;
            }
        }
    }
}

package com.ohgiraffers.section03.RaceGame;

import java.util.Scanner;

public class PlayGame {

    public static void gaming(){

        User user1 = new User();
        User user2 = new User();
        Scanner sc = new Scanner(System.in);

        // 사용자 이름 정하기
        System.out.print("player1의 이름을 입력해주세요: ");
        user1.setName(sc.nextLine());

        System.out.print("player2의 이름을 입력해주세요: ");
        user2.setName(sc.nextLine());

        while (true) {
            if (!(user2.isKeep() || user1.isKeep())){
                return;
            }else {
                user1.Myturn();
                if (user1.getPosition() == user2.getPosition()) {
                    System.out.println("==================");
                    System.out.println(user1.getName() + "님이 " + user2.getName() + "을 잡았습니다.");
                    System.out.println(user2.getName() + "님이 3칸 뒤로갑니다.");
                    System.out.println("==================");

                    user2.setPosition(user2.getPosition() - 3);
                    System.out.println("한번 더 던지세요!");
                    user1.Myturn();

                    System.out.println(user1.getName() + "님의 현 위치: " + user1.getPosition());
                    System.out.println(user2.getName() + "님의 현 위치: " + user2.getPosition());
                    System.out.println("==================");
                }

                user2.Myturn();
                if (user2.getPosition() == user1.getPosition()) {
                    System.out.println("==================");
                    System.out.println(user2.getName() + "님이 " + user1.getName() + "을 잡았습니다.");
                    System.out.println(user1.getName() + "님이 3칸 뒤로갑니다..");
                    System.out.println("==================");

                    user1.setPosition(user1.getPosition() - 3);
                    System.out.println("한번 더 던지세요!");
                    user2.Myturn();

                    System.out.println(user1.getName() + "님의 현 위치: " + user1.getPosition());
                    System.out.println(user2.getName() + "님의 현 위치: " + user2.getPosition());
                    System.out.println("==================");

                }
            }
        }
    }
}

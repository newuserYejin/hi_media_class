package com.ohgiraffers.section03.RaceGame;

import java.util.Random;
import java.util.Scanner;

public class Application {

    // 주사위 게임

    /*
    * user1과 user2는 1~3랜덤으로 돌린다.
    * 15에 먼저 도달하는 사람이 승리
    *
    * user1이나 user2가 상대를 잡았을 경우 주사위를 한번 더 던진다.(같은 칸에 존재)
    * 
    * 시용자에게서는
    * 1. 게임 진행
    * 2. 게임 종료
    * 3. 게임 초기화
    * 를 입력 받는다.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("15이 만큼의 길에서 1~3까지의 주사위를 던져 먼저 도착하는 사람이 승리하는 게임입니다.");
        System.out.println("단, 다른사람이 위치한 곳에 도착했을경우 해당 위치에 있던 플레이어는 출발점으로 돌아오게 됩니다.");

        while (true) {
            System.out.println("\n게임을 시작하시겠습니까?");
            System.out.print("시작을 원하신다면 start를 입력해주세요(over을 입력하시면 프로그램이 종료됩니다.): ");
            String start = sc.nextLine();

            if (start.equals( "start")){
                break;
            } else if (start.equals("over")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }

        System.out.println("게임을 시작합니다.");

        while (true){
            PlayGame.gaming();
            break;
        }
    }

}

package com.ohgiraffers.section03.RaceGame;

import java.util.Random;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    private int position;
    private String name;
    private boolean keep = true;

    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean isKeep() {
        return keep;
    }

    public void Myturn(){
        System.out.println("\n"+name + "님의 차례입니다. 다음 행동 중 원하시는걸 골라주세요.");

        while (true) {
            System.out.println("1. 주사위 굴리기");
            System.out.println("2. 현재 위치 확인하기");
            System.out.println("3. 게임 종료하기");

            int btn = sc.nextInt();

            switch (btn) {
                case 1:
                    dice();
                    return; // 차례 종료 시키기 (함수 종료)
                case 2:
                    checkPosition();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("게임을 포기하시나요?(y/n)");
                    String end = sc.nextLine();
                    gameOver(end);
                    return;
            }
        }
    }

    public void dice() {
        int num = random.nextInt(1, 7);
        System.out.println(name + "님 " + num + "칸 이동합니다.");
        setPosition(position + num);

        if (position == 17 || position == 44) {
            System.out.println("함정에 빠졌어요!!!! 이번 주사위는 무효입니다!!");
            setPosition(position - num);
        } else if(position % 13 == 0){
            System.out.println("땅굴에 빠졌어요ㅠㅠ 뒤로 2칸 이동합니다.");
            setPosition(position - 2);
        } else if (position % 16 == 0) {
            System.out.println("부스터를 달고 4칸 앞으로 전진!!");
            setPosition(position+4);
        }
        System.out.println(name+"의 현재 위치는 "+position+"입니다.");
    }

    public void checkPosition(){
        System.out.println(name+"님의 현재 위치는 " + position + "입니다.");
    }

    public void gameOver(String end){
        if (end.equals("y")){
            System.out.println("게임을 종료합니다.");
            keep = false;
        } else {
            System.out.println("게임을 다시 진행합니다.");
        }
    }
}

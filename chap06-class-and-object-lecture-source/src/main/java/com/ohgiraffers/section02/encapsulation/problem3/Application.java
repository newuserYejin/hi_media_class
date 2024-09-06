package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        // 필드(전역 변수)에 직접 접근 시 발생하는 문제

        // 3.
        Monster monster1 = new Monster();
        monster1.setName("하츄핑");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setName("시진핑");
        monster2.setHp(300);

        Monster monster3 = new Monster();
        monster3.setName("티니핑");
        monster3.setHp(400);

        Monster monster4 = new Monster();
        monster4.setName("핑");
        monster4.setHp(500);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        // 아직도 필드에 직접 접근 가능
        Monster monster5 = new Monster();
        monster5.name = "";
        monster5.hp= -90;

    }
}

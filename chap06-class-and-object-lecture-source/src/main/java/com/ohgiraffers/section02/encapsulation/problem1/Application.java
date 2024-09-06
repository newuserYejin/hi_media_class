package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    
    // 필드에 직접 접근시 발생하는 문제
    // 1. 필드내 올바르지 않은 값이 들어가더라도 통제 불가

    public static void main(String[] args) {

        Monster monster1 = new Monster();

        monster1.name = "하츄핑";
        monster1.setHP(200);

        System.out.println("monster1.name: "+monster1.name);
        System.out.println("monster1.hp: "+monster1.hp);

        Monster monster2 = new Monster();

        monster2.name = "피카츄";
        monster2.setHP(-20);

        System.out.println("monster2.name: "+monster2.name);
        System.out.println("monster2.hp: "+monster2.hp +"\n");

        // 2. 검증되지 않은 값을 제한하기 위해 메소드(기능)을 만들었지만 여전히 필드에 직접적으로 접근 가능
        
        Monster monster4 = new Monster();
        monster4.name = "핑";
        monster4.hp = -1000;

        System.out.println("monster4.name: "+monster4.name);
        System.out.println("monster4.hp: "+monster4.hp);


    }
}

package com.ohgiraffers.section02.encapsulation.resolve;

public class Application {
    public static void main(String[] args) {

        // 접근 제한자

        // private으로 선언된 것은 직접적인 접근이 불가하다.
        // public 으로 만들어둔 메소드를 통해서만 필드값을 접근할 수 있다.
        // 이것을 캡슐화라고 한다.    <- 유지보수성 향상

        Monster monster1 = new Monster();
        monster1.setName("ho");
        monster1.setHp(20);

        System.out.println(monster1.getInfo());
    }
}

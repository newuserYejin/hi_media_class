package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        
        // this() -> 자기 자신의 생성자
        // super() -> 부모의 생성자(인자와 매개변수의 타입 갯수등이 일치하는 생성자 호출)

        Product product1 = new Product();
        System.out.println(product1.getInfo());

        Product product2 = new Product("s-2123","LG","hohohat",3000000, LocalDateTime.now());
        System.out.println(product2.getInfo());


        System.out.println("==========================================");

        Computer computer1 = new Computer();
        System.out.println(computer1.getInfo());
        
        Computer computer2 = new Computer("인텔",512,16,"윈도우");
        System.out.println(computer2.getInfo());

        System.out.println("==========================================");

        Computer computer3 = new Computer("s-2123","LG","hohohat",3000000, LocalDateTime.now(),"인텔",512,16,"윈도우");
        System.out.println(computer3.getInfo());


    }
}

package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        
        // 와일드 카드
        // <?> : 제한 없음
        // <? extends Type> : 와일드 카드 상한 제한(Type과 Type의 후손 만 가능)
        // <? super Type> : 와일드 카드 하한 제한(Type과 Type의 부모를 이용한 인스턴스 가능)

        WildCardFarm wildCardFarm = new WildCardFarm();

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        System.out.println("========================================");
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        System.out.println("========================================");
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<Bunny>());
    }

}

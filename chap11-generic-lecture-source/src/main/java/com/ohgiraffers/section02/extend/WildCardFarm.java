package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 토끼가 bunny이거나 그 후손으로 만들어진 인스턴스
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }

}

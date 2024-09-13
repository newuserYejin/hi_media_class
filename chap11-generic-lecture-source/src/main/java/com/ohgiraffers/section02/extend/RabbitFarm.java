package com.ohgiraffers.section02.extend;

// 타입이 정해지지 않은 T 타입이지만 Rabbit 에 관련된 것만 들어올 수 있다.
public class RabbitFarm <T extends Rabbit> {

    private T animal;

    public RabbitFarm(){}

    // 모든 필드 초기화하는 생성자
    public RabbitFarm(T animal){
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}

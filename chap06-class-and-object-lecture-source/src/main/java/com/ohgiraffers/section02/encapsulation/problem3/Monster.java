package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    String name;
    int hp;

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        if (hp > 0){
            this.hp= hp;
        } else {
            this.hp = 10;
        }
    }

    // 몬스터의 이름과 체력 알려줌
    public String getInfo(){
        return "몬스터의 이름은: " + this.name +" hp : " + this.hp;
    }

}

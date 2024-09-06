package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {

    private String kinds;
    private int hp;

    public void setName(String name){
        this.kinds = name;
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
        return "몬스터의 이름은: " + this.kinds +" hp : " + this.hp;
    }
}

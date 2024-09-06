package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean carSwitch;
    private int speed;

    public void startUp(){
        if (carSwitch){
            System.out.println("이미 시동이 걸려있습니다.");
        }else{
            this.carSwitch = true;
            System.out.println("시동 걸었습니다. 출발 준비 완료!!!");
        }
    }

    public void go(){
        if (carSwitch){
            this.speed += 10;
            System.out.println("현재 시속: " + this.speed);
        } else {
            System.out.println("움직이기 위해 시동을 먼저 걸어주세요");
        }
    }

    public void stop(){
        if (this.speed>0){
            this.speed -= 10;
            System.out.println("현재 시속: " + this.speed);
        } else{
            System.out.println("자동차가 이미 멈춰 있습니다.");
        }
    }

    public void turnOff(){
        if (this.speed == 0) {
            if (this.carSwitch) {
                this.carSwitch = false;
                System.out.println("자동차 시동을 껐습니다.");
            } else {
                System.out.println("이미 시동이 꺼져 있습니다.");
            }
        } else {
            System.out.println("지덩차가 달리는 중이라 시동을 끌 수 없습니다.");
        }
    }
}

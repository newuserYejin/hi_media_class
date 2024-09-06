package com.ohgiraffers.section03.practice;

public class Car {

    private boolean carSwitch;
    private int speed;

    public void On(){
        if (carSwitch){
            System.out.println("이미 시동이 켜져 있습니다.");
        } else {
            carSwitch = true;
            System.out.println("시동을 켰습니다.");
        }
    }

    public void Go(){
        if (carSwitch){
            speed += 10;
            System.out.println("현재 시속: " + speed + "km/h");
        } else{
            System.out.println("자동차 시동을 먼저 걸어주세요.");
        }
    }

    public void Stop(){
        if (carSwitch){
            if (speed > 0){
                speed -= 10;
                System.out.println("현재 시속: " + speed + "km/h");
            } else {
                System.out.println("이미 자동차는 멈춰 있습니다.");
            }
        } else{
            System.out.println("자동차 시동이 꺼져있어 브레이크를 밟을 필요가 없습니다.");
        }
    }

    public void Off(){
        if (carSwitch){
            if (speed > 0){
                System.out.println("자동차가 달리고 있는 중이기 때문에 시동을 끌 수 없습니다.");
            } else{
                carSwitch = false;
                System.out.println("자동차의 시동이 꺼졌습니다.");
            }
        } else{
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }


}

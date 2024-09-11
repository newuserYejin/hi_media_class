package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;
    
    public Car(){
        System.out.println("Car의 기본 생성자 호출");
    }
    
    /*
    * run() : 달리기
    * soundHorn():경적 울리기
    * */

    public void run(){
        runningStatus = true;
        System.out.println("자동차 달리는 중");
    }

    public void soundHorn(){
        if (runningStatus){
            System.out.println("빠아아아앙아ㅏ아아아아아아아아ㅏ아아아아아아아앙");
        } else {
            System.out.println("주행중이 아니기 때문에 경적을 울릴 수 없습니다.");
        }
    }

    protected boolean isRunning(){
        return runningStatus;
    }
    
    public void stop(){
        runningStatus = false;
        System.out.println("자동차 멈춤");
    }

}

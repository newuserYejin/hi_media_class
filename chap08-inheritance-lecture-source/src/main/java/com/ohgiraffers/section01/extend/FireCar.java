package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    // extends 키워드를 통해 Car 클래스 상속
    
    public FireCar(){

        // super() : 부모의 기본 생성자 호출
        super();            // 안써도 상속된 관계라 상관없다.

        System.out.println("기본 생성자: 소방차입니다!에에에에에에에엥에에에에에에에에엥");
    }
    
    
    // 오버 라이딩


    @Override
    public void soundHorn() {
//        super.soundHorn();      // 부모의 soundHorn 받아오기(없어야 부모꺼 자식껄로 덮기 가능. 있으면 둘 다 출력된다.))
        
        if(isRunning()){
            System.out.println("빠랄바라빠라바아아아아아아아아아아아아아아ㅏ앙아ㅏ아아아아아아아아암");
        } else {
            System.out.println("소방차 전진 불가");
        }
            
    }
    
    // 물 뿌리기
    
    public void sprayWater(){
        System.out.println("불난 곳 발견");
    }
    
    
}

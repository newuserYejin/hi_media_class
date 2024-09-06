package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;

    // 기능은 곧 메소드
    // this는 인스턴스가 생성될때 자신의 주소를 저장하는 레퍼런스 변수
    // 지역변수와 전역변수의 이름이 동일할 경우, 전역변수에 접근하기 위해 this 사용

    public void setHP(int hp){
        if (hp > 0){
            System.out.println("정상적인 값이 입력되었습니다.");
            this.hp = hp;
        } else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 hp를 10으로 설정합니다.");
            this.hp = 10;
        }
    }

}

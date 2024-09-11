package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        // 상속: 뷰모 클래스의 (필드, 메소드)를 물려받는다.

        // 오버 라이딩 : 메소드 재정의
        // 오버 로드 : 같은 이름의 메소드를 작성하지만 매개변수의 종류와 갯수 등을 다양하게 하여 여러개 작성하는 것

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();

        System.out.println("============================");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sprayWater();

        System.out.println("=============================");
        FarmCar farmCar = new FarmCar();
        farmCar.run();

    }
}

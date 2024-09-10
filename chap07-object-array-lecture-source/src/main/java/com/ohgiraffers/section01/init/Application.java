package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {
        
        // 객체 배열

        Car car1 = new Car("페라리",300);
        Car car2 = new Car("G바겐",200);
        Car car3 = new Car("롤스로이스",250);
        Car car4 = new Car("부가티",400);
        Car car5 = new Car("케스퍼",500);

        car1.carMaxSpeedInfo();
        car2.carMaxSpeedInfo();
        car3.carMaxSpeedInfo();
        car4.carMaxSpeedInfo();
        car5.carMaxSpeedInfo();

        System.out.println("===========================");

        Car[] carArr = new Car[5];
        carArr[0] = new Car("페라리",300);
        carArr[1] = new Car("G바겐",200);
        carArr[2] = new Car("롤스로이스",250);
        carArr[3] = new Car("부가티",400);
        carArr[4] = new Car("케스퍼",500);

        for (int i = 0; i<carArr.length;i++){
            carArr[i].carMaxSpeedInfo();
        }

        System.out.println("============================");
        for(Car i : carArr){
            i.carMaxSpeedInfo();
        }
    }
    
}

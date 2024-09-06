package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 객체지향 프로그래밍
        // 하나의 객체는 너무 많은 일의 책임을 가지는 것이 아닌 적절한 책임을 져야한다(단일 책임의 원칙)

        // 추상화

        /*
        * 카레이서: 시동걸기, 엑셀밟기, 브레이크 밝기, 시동 끄기
        * 자동차 : 시동 걸리기, 앞으로 가기, 멈추기, 시동 꺼지기
        * 자동차는 처음에 멈춘 상태로 대기
        * 카레이서는 먼저 자동차에 시동을 걸고 이미 걸려있다면 다시 시동을 걸 수 없다.
        * 카레이서가 엑셀이 걸려있다면 자동차의 시송이 10km/h 증가하며 앞으로 나간다.
        * 자동차가 잘리는 중인 경우, 브레이크를 밟으면 자동차의 시속은 0km/h로 떨어지며 멈춘다.
        * 브레이크를 밟을 때 자동차가 달리는 중이 아니면 이미 멈춰 있습니다. 라는 안내가 나온다.
        * 카레이서가 시동을 끄면 더이상 자동차는 움직이지 않는다.
        * */
        
        /*
        * 객체 추출
        * -> 사용자, 카레이서, 자동차
        *
        * 객체간의 상호작용
        * -> 카레이서가 수신할 수 있는 메세지
        * 1. 시동을 걸어라
        * 2. 엑셀을 밟아라
        * 3. 브레이크를 밟아라
        * 4. 시동을 꺼라
        * 
        * -> 자동차가 수신할 수 있는 메세지
        * 1. 시동이 걸려라
        * 2. 앞으로 가라
        * 3. 멈춰라
        * 4. 시동이 꺼져라
        * */
        
        /*
        * Application 클래스
        * - main(Scanner)
        * CarRacer 클래스
        * - 속성 : 자동차
        * - 행위 : 시동 걸기, 멕셀 밟기, 브레이크 밝기, 시동 끄기
        * Car 클래스
        * - 속성 : 시동상태, 현재 시속
        * - 행위 : 시동이 걸려라, 앞으로 가라, 멈춰라, 시동이 꺼져라
        * */

        Scanner sc = new Scanner(System.in);

        CarRacer carracer = new CarRacer();

        while (true){
            System.out.println("========================= 카레이싱 =========================");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");

            System.out.print("메뉴를 선택해주세요: ");
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    carracer.startUp();
                    break;
                case 2:
                    carracer.stepAccelerator();
                    break;
                case 3:
                    carracer.stepBreak();
                    break;
                case 4:
                    carracer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }

            if (num == 9){
                break;
            }
            
        }
    }
}

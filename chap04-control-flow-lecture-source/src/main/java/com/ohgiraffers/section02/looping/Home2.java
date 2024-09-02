package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Home2 {

    public void Beer(){
        System.out.print("나이가 어떻게 되세요? ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 19){
            System.out.println("판매 가능합니다.");
        } else {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }

    public void Even(){
        System.out.print("짝홀, 그 결과는? ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.println("짝수입니다~!");
        } else{
            System.out.println("홀수입니다~!");
        }
    }

    public void Event(){
        System.out.print("당첨 번호가 어떻게 되세요? ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1 || num > 10){
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
            return;
        }

        if (num%2==1){
            System.out.println("홀수네요, 인형 선물입니다!");
        } else {
            System.out.println("짝수네요, 모자 선물입니다!");
        }
    }

    public void Health(){
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력해주세요(m): ");
        double  height = sc.nextDouble();

        System.out.print("몸무게를 입력해주세요(kg): ");
        double  weight = sc.nextDouble();

        double BMI = weight / (height * height);

        if (BMI >= 30){
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        } else if (BMI >=25) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        }else if (BMI >= 20){
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        }else {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        }

    }

    public void Cal (){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int num2 = sc.nextInt();

        sc.nextLine();
        System.out.print("연산 기호를 입력하세요 : ");
        String op = sc.nextLine();

        int result;

        switch (op){
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " " + op +" " + num2 +" = "+result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " " + op +" " + num2 +" = "+result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " " + op +" " + num2 +" = "+result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1 + " " + op +" " + num2 +" = "+result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println(num1 + " " + op +" " + num2 +" = "+result);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }

    }

    public void Dessert(){
        System.out.println("-- 상품 가격 --");
        System.out.println("캬라멜팝콘(1) : 15500원");
        System.out.println("츄로스(2) : 3000원");
        System.out.println("통감자(3) : 2000원");
        System.out.println("도토리탕후루(4) : 5000원");

        Scanner sc = new Scanner(System.in);

        System.out.print("\n"+"어떤 간식을 주문하시겠어요? (숫자로 입력해주세요) ");
        int de = sc.nextInt();

        if (de == 1){
            System.out.println("캬라멜팝콘의 가격은 15500원 입니다.");
        } else if(de ==2){
            System.out.println("츄로스의 가격은 3000원 입니다.");
        } else if(de == 3){
            System.out.println("통감자의 가격은 2000원 입니다.");
        } else if (de == 4) {
            System.out.println("도토리탕후루의 가격은 5000원 입니다.");
        } else {
            System.out.println("해당 상품이 판매하지 않습니다.");
        }
    }

    public void Score(){
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int num1 = sc.nextInt();

        System.out.print("서비스  점수 : ");
        int num2 = sc.nextInt();

        System.out.print("미소 점수 : ");
        int num3 = sc.nextInt();

        if ( (num1 + num2 + num3) /3 < 60){
            System.out.println("평균점수 미달로 불합격입니다.");
        }

        if(num1 <40){
            System.out.println("성실 항목의 점수 미달로 불합격 입니다.");
        }

        if(num2 <40){
            System.out.println("서비스 항목의 점수 미달로 불합격 입니다.");
        }

        if(num3 <40){
            System.out.println("미소 항목의 점수 미달로 불합격 입니다.");
        }

        if ( (num1 + num2 + num3) /3 >= 60 && num1 >= 40 && num2 >= 40 && num3 >= 40){
            System.out.println("합격입니다!");
        }
    }

    public void Pay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
        int monthPay = sc.nextInt();

        System.out.print("매출액 입력 : ");
        int total = sc.nextInt();

        int percent;

        if (total >= 50000000){
            percent = 5;
        } else if (total >= 30000000) {
            percent = 3;
        } else if (total >= 10000000) {
            percent = 1;
        } else {
            percent = 0;
        }

        System.out.println("\n" + "매출액 : " + total);
        System.out.println("보너스율: "+percent+"%");
        System.out.println("월 급여: "+monthPay);
        System.out.println("보너스 급여: "+ (total * percent /100));
        System.out.println("총 급여: "+ (monthPay + (total * percent/100)));

    }

    public void Ride() {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double height = sc.nextDouble();

        if (age < 9){
            System.out.println("9살 넘으면 오시오.");
        } else if (height < 110) {
            System.out.println("키 더 크고 오시오");
        } else {
            System.out.println("놀이기구 탑승가능");
        }
    }

    public void Pass (){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < 40 || num2 < 40){
            System.out.println("과락 존재 불합격");
        } else if ((num1 + num2) / 2 < 60){
            System.out.println("평균 60 미만 불합격");
        } else {
            System.out.println("합격");
        }
    }

    public void Rent() {
        System.out.println("소형 : 40000원\n" +
                "중형 : 55000원\n" +
                "대형 : 80000원\n" +
                "SUV : 100000원\n" +
                "승합 : 120000원");

        Scanner sc = new Scanner(System.in);
        System.out.print("예산 금액을 입력하세요: ");
        int budget = sc.nextInt();

        if (budget >= 120000) {
            System.out.println("전 차량 가능");
        } else if (budget >= 100000) {
            System.out.println("승합차 제외하고 가능");
        } else if (budget >= 80000) {
            System.out.println("SUV, 승합차 제외하고 가능");
        } else if (budget >= 55000){
            System.out.println("중형과 소형만 가능");
        } else if (budget >= 40000){
            System.out.println("소형만 가능");
        } else {
            System.out.println("렌트 불가");
        }
    }

    public void Weather() {
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 몇월인지 숫자로 입력해주세요: ");
        int month = sc.nextInt();

        if (month >= 3 && month <=5){
            System.out.println("봄의 계절입니다.");
        } else if (month >= 6 && month <= 8){
            System.out.print("온도를 입력해주세요: ");
            int temp = sc.nextInt();
            if (temp >= 33){
                System.out.println("폭염경보");
            } else if (temp >=28) {
                System.out.println("폭염주의보");
            }
            System.out.println("여름의 계절입니다.");
        } else if(month >= 9 && month<=11){
            System.out.println("가을의 예절입니다.");
        } else {
            System.out.print("온도를 입력해주세요: ");
            int temp = sc.nextInt();
            if (temp <= -15){
                System.out.println("한파경보");
            } else if (temp <= -5) {
                System.out.println("한파 주의보");
            }
            System.out.println("겨울의 계절입니다.");
        }

    }


}

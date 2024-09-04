package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.print("받으신 금액을 입력하세요 : ");
            int input = sc.nextInt();

            if (input == -20000){
                System.out.println("프로그램이 종료 됩니다.");
                break;
            }

            System.out.print("상품 가격을 입력하세요 : ");
            int price = sc.nextInt();

            if (input < price){
                System.out.print("투입 금액은 상품의 가격보다 높아야합니다.");
            } else{
                int charge = input - price;

                int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

                for (int i : money){
                    System.out.println(i + "권 " + charge/i + "장");
                    charge = charge % i;
                }

                System.out.println("거스름돈 : " + (input-price) + "원 \n");
            }
        }

    }
}

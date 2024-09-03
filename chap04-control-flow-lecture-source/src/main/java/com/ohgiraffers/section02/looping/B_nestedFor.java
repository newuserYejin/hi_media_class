package com.ohgiraffers.section02.looping;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class B_nestedFor {

    public void allGugudan() {
        for (int i = 1; i<=9;i++){
            System.out.println("\n"+i+"단");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

     /*  bbb*
     *   bb***
     *   b*****
     *   *******  */

    public void starPoint(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇줄짜리 삼각형을 출력하고 싶으신가요? ");
        int num = sc.nextInt();

        for(int i = 1; i <=num;i ++){
            for (int j = num-1; j>=i;j--){
                System.out.print(" ");
            }

            for (int z = 1; z <= i*2-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void modifyStarPoiny(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇줄짜리 삼각형을 출력하고 싶으신가요? ");
        int num = sc.nextInt();

        for (int i = 1; i <=num; i++){
            for(int j = 0; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int z = 1; z <= i*2-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void row(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            print(5);
        }
    }

    private void print(int n){
        for (int j=1; j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void reverseTriangle(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇줄짜리 삼각형을 출력하고 싶으신가요? ");
        int num = sc.nextInt();

        for(int i = num; i >0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    // 다이아몬드
    public void diamond(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇줄짜리 삼각형을 출력하고 싶으신가요(1보다 큰 홀수로 입력해주세요)? ");
        int num = sc.nextInt();

        for (int i =1; i <= num; i++){
            int a = num/2 +1;

            if (i <= num /2 +1 ) {
                
                // 공백 찍기
                for (int z = 1; z <= a-i;z++){
                    System.out.print(" ");
                }

                // * 찍기
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // 공백 찍기
                for (int z = 1; z <= i-a;z++){
                    System.out.print(" ");
                }

                // * 찍기
                for (int j = 1; j <= (num-i)*2+1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }

}

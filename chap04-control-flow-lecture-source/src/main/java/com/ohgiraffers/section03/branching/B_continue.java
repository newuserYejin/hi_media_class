package com.ohgiraffers.section03.branching;

public class B_continue {
    
    // continue 문
    
    public void testContinueStatement(){

        for (int dan = 1; dan <10; dan++){

            if (dan == 5){
                continue;
            }

            for (int num = 1;num < 10;num++){
                System.out.println(dan+" * "+num+" = "+dan*num);
            }
            System.out.println();
        }
        
    }

    // 3의 배수이면서 4의 배수인 값 출력
    public void testContinueStatement2(){

        for (int i = 1; i < 101; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println("3과 4의 배수: " + i);
            } else {
                break;
            }
        }
    }

    // 구구단 출력 단, 수가 5인 경우 출력 하지 않는다.
    public void testContinueGugudan(){

        for (int dan = 1; dan < 10; dan++){
            for (int su = 1; su < 10 ; su++){

                if (su == 5){
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }

    }
    
    // 구구단 출력 단, 각 단의 수가 짝수인 경우 출력 생략
    public void test1(){
        for (int dan = 1; dan < 10; dan++){
            for (int su = 1; su < 10 ; su++){
                if (su %2 == 0){
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    public void test2(){
        for (int dan = 1; dan < 10; dan++){
            for (int su = 1; su < 10 ; su++){
                if (su %2 != 0){
                    System.out.println(dan + " * " + su + " = " + dan * su);
                }
            }
            System.out.println();
        }
    }
}

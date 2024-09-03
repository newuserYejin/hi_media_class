package com.ohgiraffers.section03.branching;

public class A_break {

    // 반복문에서의 break 활용

    // 1~100까지의 합계
    public void testBreakStatement() {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;

            if (i ==100){
                break;
            }
            i++;
        }

        System.out.println("sum: "+sum) ;
    }

    // 구구단
    public void breakegugudan(){
        for (int dan = 1; dan <10; dan++){
            for (int num = 1;num < 10;num++){
                if (num > 5){
                    break;
                }
                System.out.println(dan+" * "+num+" = "+dan*num);
            }
            System.out.println();
        }

    }
}

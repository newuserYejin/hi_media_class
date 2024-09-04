package com.oghiraffers.section01.array;

import java.util.Scanner;

public class Home3 {
    
    /*
    * 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 
    * 영문자 O가 입력되면 영문자 O를 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램
    *
    * 321321313O565146516
    * */

    public static void main(String[] args) {
        int[] num = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        String str = sc.nextLine();

        while (str.length() > 100){
            System.out.println("100자리 내의 정수로 다시 입력해주세요: ");
            str = sc.nextLine();
        }

        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) != 'O'){
                num[i] = str.charAt(i);
            }else{
                break;
            }
        }

        for (int i = num.length; i >= 0; i--){
            if (num[i] != 0){
                System.out.println(num[i]);
            }
        }

    }


}

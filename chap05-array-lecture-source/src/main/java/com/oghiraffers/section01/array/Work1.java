package com.oghiraffers.section01.array;

public class Work1 {
    public static void main(String[] args) {

        /* Q1.길이가 10인 정수형 배열을 선언 및 할당한 뒤 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요.
         * */

        int[] num = new int[10];
        for(int i = 0 ; i <10; i++){
            num[i] = i+1;
            System.out.println(num[i]);
        }
    }
}

package com.oghiraffers.section02.copy;

import java.util.Random;

public class Home {
    // 1~10 까지의 난수 10개를 랜덤적으로 뽑아 arr 배열에 중복없이 저장하고, 출력하세요.

    public static void main(String[] args) {

        int[] arr = new int[5];

        Random random = new Random();

        for (int i = 0; i < arr.length;i++){
            arr[i] = random.nextInt(1,11);

            for (int j = 0; j < i; j++){
                while (arr[i] == arr[j]){
                    arr[i] = random.nextInt(1, 11);
                }
            }

            System.out.print(arr[i] + " ");
        }
    }
}

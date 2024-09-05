package com.oghiraffers.section02.copy;

import java.util.Arrays;

public class Home3 {
    public static void main(String[] args) {

        int[] a = {1, 5, 2, 45, 9, 8, 42};
        int[] b = a;

        for (int i = 0; i < b.length; i++){
            if (b[i] % 2 == 1){
                b[i]--;
            }
        }

        // b = [0,4,2,44,8,8,42]

        int c[] = Arrays.copyOf(b, b.length);

        for (int j = 0; j < c.length;j++){
            if (c[j] % 4 == 0){
                c[j]--;
            }
        }

        System.out.println("a배열: ");
        printArray(a);

        System.out.println("b배열: ");
        printArray(b);

        System.out.println("c배열: ");
        printArray(c);
    }

    public static void printArray(int[] nums){
        for (int i =0; i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}

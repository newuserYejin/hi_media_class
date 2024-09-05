package com.oghiraffers.section02.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {
        
        // 깊은 복사
        
        // 깊은 복사 방법 4가지
        
        /*
        * 1. for 문을 이용한 복사
        * 2. Object 의 clone() 메소드 이용
        * 3. System 의 arraycopy() 메소드 이용
        * 4. Arrays 의 copyOf() 메소드 이용
        * */

        // 성능이 가장 높은건 전용으로 만들어진 arraycopy(), 가장 많이 쓰는건 copyOf()
        // clone()은 단순 복사만 가능하지만 나머지는 길이 조절도 가능하다.

        int[] origin = {1,2,3,4,5};

        print(origin);
        
        // for문을 이용한 인덱스 복사
        int[] copyArray1 = new int[10];

        for (int i= 0; i<origin.length;i++){
            copyArray1[i] = origin[i];
        }

        print(copyArray1);
        
        // Object 클래스에 clone() 이용하여 값 복사

        int[] copyArray2 = origin.clone();
        print(copyArray2);

        // System 의 arraycopy() 이용
        int[] copyArray3 = new int[10];

        System.arraycopy(origin,0,copyArray3,3, origin.length);
        print(copyArray3);
        
        // Arrays의 copyoOf 메소드 이용

        int[] copyArray4 = Arrays.copyOf(origin,8);
        print(copyArray4);
    }

    public static void print(int[] nums){
        System.out.println("\n전달받은 매개변수의 hashcode()" + nums.hashCode());

        for (int i = 0; i< nums.length; i++){
            System.out.print(nums[i]  + " ");
        }

    }

}

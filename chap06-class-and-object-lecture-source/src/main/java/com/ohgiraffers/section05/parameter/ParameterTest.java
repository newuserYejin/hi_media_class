package com.ohgiraffers.section05.parameter;

import org.w3c.dom.ls.LSOutput;

public class ParameterTest {

    public void testPrimaryParameter(int num){
        System.out.println("전달 받은 값: "+num);
    }

    public void testPrimaryArrayParameter(int[] arr) {
        System.out.println("전달 받은 배열: "+arr);

        System.out.print("배열의 값: ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[0] = 99;

        System.out.print("변경 후 배열의 값: ");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void testClassParameter(Rectangle r1) {      // 클래스를 받을 땐 클래스의 이름으로 넘어온다.
        System.out.println("매개변수로 전달 받은 값: " + r1);
        System.out.print("변경 전 사각형 ");
        r1.calcArea();
        r1.calcRound();

        System.out.println("================변경 후===============");
        r1.setHeight(7.4);
        r1.setWidth(2.5);

        r1.calcArea();
        r1.calcRound();
    }

    public void testVariableLengthTest(String name, String ...hobbies) {
        System.out.println("이름: " + name);
        System.out.println("취미의 갯수: " + hobbies.length);
        System.out.print("취미: ");
        for (int i =0;i<hobbies.length;i++){
            System.out.print(hobbies[i] + " ");
        }
        System.out.println();
    }



}

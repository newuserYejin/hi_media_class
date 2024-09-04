package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        // 1. 오버플로우
        byte num1 = 127;            // byte의 범위 : -128~127
        System.out.println("num1 = " + num1);

        num1++;                     // 최대 수 127에 1을 더하게 되면 signbit가 변경되면서 음수 -128이 출력되게 된다.
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        // 2. 언더플로우
        
        byte num2 = -128;
        System.out.println("\n"+"num2 = " + num2);
        
        num2--;
        System.out.println("num2 = " + num2);

        // 오버플로우나 언더플로우 발생시에도 에러는 나타나지 않기 때문에 고려해서 코드 작성할 것✨

        int a = 10;
        int b = 3;
        
        float c = (float) a / b;            // 강제 형변환을 미리하지 않고 결과를 받았을 경우 이미 int와 int의 결가가 float에 저장되는 형태로 진행되기 때문에
                                            // float형에 저장했지만 int식의 결과가 출력된다. => 즉, 미리 형변화을 해야 원하는 형태의 결과를 출력 가능하다.

        System.out.println("c = " + c);
    }
}

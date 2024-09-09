package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        
        // 메소드의 파라미터

        // 매개변수로 사용 가능한 자료형
        /*
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스
        * 4. 클래스 자료형 배열
        * 5. 가변 인자
        * */

        ParameterTest pt = new ParameterTest();
        int num = 20;

        pt.testPrimaryParameter(num);

        // 배열 전달
        int[] arr = {1,2,3,4,5};

        pt.testPrimaryArrayParameter(arr);

        // 클래스 전달
        Rectangle r1 = new Rectangle(3.5,4.8);
        System.out.println("클래스 전달: " + r1);
        pt.testClassParameter(r1);

        // 가변인자 (가변인자를 앞이나 중간에 작성 했을 시, 끝을 알 수 없기 때문에 가변인자는 마지막에 작성한다.)
        pt.testVariableLengthTest("hoho","야구", "족발");
    }
}

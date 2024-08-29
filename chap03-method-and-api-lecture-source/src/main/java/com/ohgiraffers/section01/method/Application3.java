package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        // 지역변수 -> 메소드 블럭 내에서만 사용 가능
        // 전역변수 ->
        // 매개변수 ->

        Application3 app3 = new Application3();
//        app3.testMethod(40);

        // 매개변수가 선언되었는데 전달해주지 않으면 오류
        // app3.testMethod();

        // 변수에 저장한 값 전달
        int num = 20;
        app3.testMethod(num);

        // 자동 형 변환을 이용하여 값 전달 테스트
        app3.testMethod('a');

        // + 강제 형변환
        long lnum = 100L;
        app3.testMethod((int) lnum);
    }

    public void testMethod(int test) {
        System.out.println("testMethod start");
        System.out.println(test);
        System.out.println("testMethod end");
    }
}

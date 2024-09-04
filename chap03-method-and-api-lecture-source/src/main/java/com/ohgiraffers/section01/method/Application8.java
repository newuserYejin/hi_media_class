package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        
        // static 메소드 호출하기

        // [표현식]
        // 클래스명.메소드 명()
        // static이 있는 메소드는 build시 미리 선언되기 때문에 new 키워드 없어도 호출 가능
        
        int result = Application8.sumTwoNumbers(10,20);
        System.out.println("result = " + result);

        // 동일한 클래스 내에 작성된 static 메소드는 클래스 명 생략 가능.
        System.out.println(sumTwoNumbers(2,5));
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}

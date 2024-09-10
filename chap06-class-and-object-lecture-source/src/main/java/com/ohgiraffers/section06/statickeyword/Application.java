package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {
        
        // static -> 프로그램의 생성과 끝까지 존재하기 때문에 남발하면 자리 차지

        /*
        * 여러 인스턴스가 공유할 목적으로 작성,
        * 정적 메모리 공단에 할당
        * */

        StaticFieldTest stf1 = new StaticFieldTest();

        System.out.println("nonstatic: "+stf1.getNonStaticCount());
        System.out.println("static: "+stf1.getStaticCount());

        // 두 필드의 값을 1씩 증가
        stf1.increaseNonStaticCount();
        stf1.increaseStaticCount();

        System.out.println("nonstatic: "+stf1.getNonStaticCount());
        System.out.println("static: "+stf1.getStaticCount());

        stf1.increaseStaticCount();

        System.out.println("nonstatic: "+stf1.getNonStaticCount());
        System.out.println("static: "+stf1.getStaticCount());

        stf1.increaseStaticCount();

        System.out.println("nonstatic: "+stf1.getNonStaticCount());
        System.out.println("static: "+stf1.getStaticCount());

        System.out.println("=============================");
        // 새로운 인스턴스 생성
        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("sft2 nonstatic: "+sft2.getNonStaticCount());
        System.out.println("sft2 static: "+sft2.getStaticCount());          // static은 다른 객체(인스턴스)들과 공유하는 값이라는걸 기억하기
        
        // static 메소드 확인
        StaticMethodTest smt = new StaticMethodTest();

        smt.nonStaticMethod();
        smt.staticMethod();         // static 메소드는 인스턴스를 거치지 않아도 호풀이 가능하기 때문에 이와 같은 방식은 권장하지 않는다.
        System.out.println("smt: ");

        //

    }

}

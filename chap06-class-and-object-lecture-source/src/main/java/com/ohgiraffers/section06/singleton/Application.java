package com.ohgiraffers.section06.singleton;

public class Application {

    public static void main(String[] args) {

        // 싱글톤
        // 하나의 인스턴스 공유하여 메모리 낭비 방지(new 키워드를 사용해 인스턴스 생성 안함)

        /*
        * 장점 : 
        * 1. 두번째 이용시에는 인스턴스 생성 시간이 없이 사용가능.
        * 2. 인스턴스가 절ㅈ대적으로 1개만 존재하는것 보장
        * 
        * 단점:
        * 1. 데이터 공유가 많아질 수록 결합도 상승 -> 오류 발생 시 같이 묶임
        * 2. 동시성 고려 필요
        * 
        * 구현 방법
        * 1. 이른 초기화
        * 2. 게으른 초기화
        * */

        // 이른 초기화
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        // 동일한 결과 출력 -> 같은걸 공유하고 있다.
        System.out.println("eager1: " + eager1.hashCode());
        System.out.println("eager2: " + eager2.hashCode());

        // 게으른 초기화
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1 : " + lazy1.hashCode());
        System.out.println("lazy2 : " + lazy2.hashCode());
    }

}

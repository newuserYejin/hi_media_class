package com.ohgiraffers.section08.initblock;

public class Application {

    public static void main(String[] args) {
        
        // 초기화 블럭
        
        // 인스턴스 초기화 블럭
        // 인스턴스 호출마다 호출된다. 생성자 실행 이전에 실행
        
        /*표현식
        * {
        *       초기화 내용
        * }
        * */
        
        // 정적 초기화 블럭
        // 클래스가 로드 될 때 1번 동작
        
        /* 표현식
        * static{
        *       초기화 내용 작성
        * }
        * */

        Product product = new Product();

//        System.out.println(product.getInfo());
        System.out.println(product.getInfo());
        
        // 초기화 블럭으로 필드 초기화 확인
        System.out.println(product.getInfo());
        
        //
        Product product2 = new Product("대륙폰",3000000,"중국");
        System.out.println(product2.getInfo());

        
    }

}

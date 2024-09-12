package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        // 추상 클래스와 추상 메소드
        // 선언부에 abstract 로 명시
        
        // 추상 클래스는 인스턴스 생성 불가
//        Product product = new Product();

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);
        
        // 추상 케소드였던 부분 smartPhone에서 작성한걸로 덮여지니까 가능
        Product product = new SmartPhone();

        product.abstMethod();
        product.nonStaticMethod();

        Product.staticMethod();

    }
}

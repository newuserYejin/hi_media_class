package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    // 필드를 가질 수 있다.
    
    private int nonStaticField;
    private static int staticField;
    
    // 생성자
    public Product(){ }

    // 일반 메서드
    public void nonStaticMethod(){
        System.out.println("Product의 nonstatic메서드");
    }

    public static void staticMethod(){
        System.out.println("Product의 static메서드");
    }
    
    // 추상 클래스에서는 추상 메서드 작성가능 (미완성 메소드)
    public abstract void abstMethod();
    
}

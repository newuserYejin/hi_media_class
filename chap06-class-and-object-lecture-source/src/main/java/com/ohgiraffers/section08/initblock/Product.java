package com.ohgiraffers.section08.initblock;

public class Product {

//    private String name;
//    private int price;
//    private static String brand;
    
    // 명시적 초기화
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼성";

    // 인스턴스 초기화 블럭
    {
        name = "애플";
        price = 1000000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작");
    }

    public Product(){
        System.out.println("기본 생성자 등장");
    }

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price + ", brand =" + Product.brand +
                '}';
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출");
    }

    static {
//        name = "화웨이";
//        price = 50000;
        brand = "샤오미";
        System.out.println("static 초기화 블럭");
    }

}

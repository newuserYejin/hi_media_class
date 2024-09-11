package com.ohgiraffers.section02.superkeyword;

import java.time.LocalDateTime;

public class Product {
    
    private String code;
    private String brand;
    private String name;
    private int price;
    private LocalDateTime manufacturingDate;
    
    public Product(){
        System.out.println("Product의 기본 생성자 호출");
    }

    public Product(String code, String brand, String name, int price, LocalDateTime manufacturingDate) {

        /*
        * Product 클래스는 명시적으로 상속 받은 클래스는 없지만 Object 라는 클래스를 상속 받고 있기 때문에 super() 이 가능하다.
        * */

        super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("모든 필드 초기화하는 생성자 호출");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDateTime manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}

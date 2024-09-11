package com.ohgiraffers.section02.superkeyword;

// 컴퓨터는 상품이다 => computer는 product를 상속 받는다.

import java.time.LocalDateTime;

public class Computer extends Product{

    private String cpu;
    private int hdd;
    private int rm;
    private String os;

    public Computer(){
        System.out.println("computer 기본 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, LocalDateTime manufacturingDate, String cpu, int hdd, int rm, String os) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.rm = rm;
        this.os = os;
        System.out.println("부모 필드까지 초기화하는 computer 생성자 호출");
    }

    public Computer(String cpu, int hdd, int rm, String os) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.rm = rm;
        this.os = os;
        System.out.println("자식인 computer 의 필드만 초기화 하는 생성자 호출 ");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Computer ["
                + "cpu = " + this.cpu
                + ", hdd= " + this.hdd
                + ", ram = " +this.rm
                + ", os = " + this.os
                + "]";
    }

}

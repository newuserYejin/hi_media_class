package com.ohgiraffers.section03.dto;

/*
*  DTO, Dto, VO <- 데이터를 묶어두기 위한 클래스
* */

public class MemberDTO {
    
    private  int memberNo;
    private  String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private  boolean isActivated;       // 회원 탈퇴 여부

    // 설정자(setter)와 접근자(getter) => alt + insert

    // 설정자 규칙

    /* 표현식
    * public void setName(String name){
    *   this.name = name;
    * }
    *
    * 매개변수로 값을 받고 그걸 통해서 값 변경하기.
    *
    * 설정자 -> setName
    * */
    
    // 접근자 규칙
    
    /* 표현식
    * public 자료형 get필드명(){
    *   return 반환값;
    * }
    * 
    * 
    * */

    public void setMemberNo(int memberNo){
        this.memberNo = memberNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public String getName() {
        return name;
    }

    public int getMemberNo(){
        return memberNo;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}

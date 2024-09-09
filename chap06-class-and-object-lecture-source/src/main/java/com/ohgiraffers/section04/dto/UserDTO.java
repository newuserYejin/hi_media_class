package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class UserDTO {

    // DTO 규칙
    // 1. 모든 필드는 private 으로 캡슐화 한다.
    // 2. 기본 생성자는 명시적으로 존재
    // 3. 매개변수가 있는 생성자는 선택사항이다.
    // 4. 모든 필드에 접근 할 수 있는 setter와 getter는 public으로 작성한다.

    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollDate;

    public UserDTO(){

    }
    
    // 모든 필드 초기화 생성자 => alt + insert -> constructor -> 모든 필드 선택

    public UserDTO(String id, String pwd, String name, LocalDateTime enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    // private 접근 getter & setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDateTime enrollDate) {
        this.enrollDate = enrollDate;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }

}

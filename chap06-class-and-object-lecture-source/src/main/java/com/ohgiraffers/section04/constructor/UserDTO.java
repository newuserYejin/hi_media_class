package com.ohgiraffers.section04.constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private LocalDateTime enrollDate;
    
    // 생성자
    
    /*목적
    * 1. 생산 시점 수행할 명령어가 있는 경우
    * 2. 필드 초기화하며 인스턴스 생성
    * 3. 인스턴스 생성 방법 제한
    * */

    /*주의사항
    * 1. 생선자 메소드는 클래스 이름과 이름이 동일
    * 2. 생성자는 반환형이 아니다.
    * */

    // 기본 생성자
    public UserDTO(){
        System.out.println("UserDTO 기본 생성자");
    }

    public UserDTO(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String toString(){
        return "user 데이터" +
                "id: "+id +
                "/ name: "+name+
                "/ pwd: " + pwd+
                "/ enrollDate: "+ enrollDate;
    }

    // 모든 필드를 초기화하는 생성자
    public UserDTO(String id, String pwd, String name, LocalDateTime enrollDate){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.enrollDate = enrollDate;
        System.out.println("생성자 호출하고 초기화 완료");
    }

}

package com.ohgiraffers.section04.dto;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        // 생성자 이용 초기화
        // 장점 : 코드가 짧고 간단하다.
        // 단점 : 매개변수에 따른 경우의 수를 수 만큼 만들어야 한다.

        UserDTO user1 = new UserDTO("user01","pass01","호호", LocalDateTime.now());
        System.out.println("user01: " + user1.toString());

        // 기본 생성자 + setter & getter
        // 장점 : 필드 초기화시 어떤건지 명확히 할 수 있다.
        // 단점 : 하나의 인스턴스 생성시 한번에 끝나지 않는다.(코드가 길어진다.)

        UserDTO user2 = new UserDTO();
        user2.setId("user02");
        user2.setName("차차");
        user2.setPwd("pass02");
        user2.setEnrollDate(LocalDateTime.now());

        System.out.println("user2 id :" + user2.getId());
        System.out.println("user2 name :" + user2.getName());
        System.out.println("user2 pwd :" + user2.getPwd());
        System.out.println("user2 enrollDate :" + user2.getEnrollDate());


    }
}

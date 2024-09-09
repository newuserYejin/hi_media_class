package com.ohgiraffers.section04.constructor;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        // 생성자
        UserDTO user= new UserDTO();
        System.out.println("user의 초기값: " + user.toString());

        UserDTO user2 = new UserDTO("user01","0101","ghgh");
        System.out.println("호잇짜: "+user2.toString());

        UserDTO user3 = new UserDTO("user03","pass03","조조", LocalDateTime.now());
        System.out.println("user03" + user3.toString());

    }

}

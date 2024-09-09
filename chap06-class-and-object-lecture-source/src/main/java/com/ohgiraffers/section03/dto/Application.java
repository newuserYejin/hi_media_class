package com.ohgiraffers.section03.dto;

public class Application {

    // 클래스와  객체를 추상화하는 방법 DTO
    // 어떤값을 쓸지 모르니 미리 준비

    /* 캡슐화 된 필드, 필드 값 수정하는 설정자(setter), 필드 값에 접근 할 수 있는 접근자(getter)*/

    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        member.setMemberNo(1);
        member.setName("호호");
        member.setAge(20);
        member.setGender('여');
        member.setHeight(168);
        member.setWeight(60);
        member.setActivated(true);

        System.out.println("member.getMemberNo() : "+ member.getMemberNo());
        System.out.println("member.getName() : "+ member.getName());
        System.out.println("member.getAge() : "+ member.getAge());
        System.out.println("member.getGender() : "+ member.getGender());
        System.out.println("member.getHeight() : "+ member.getHeight());
        System.out.println("member.getWeight() : "+ member.getWeight());

    }

}

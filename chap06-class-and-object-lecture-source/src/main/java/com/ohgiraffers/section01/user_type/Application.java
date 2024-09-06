package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {

        // 클래스

        // 클래스에는 다양한 종류의 다릉 값들을 넣어 출력 가능하다.
        
        // 변수로 데이터 관리
        /* 변수로 데이터를 관리해야할때의 단점
        * 1. 변수명을 모두 알아야한다.
        * 2. 메소드에 회원정보를 넘겨야할때 하나씩 넘겨야되기 때문에 전달인자가 많아진다.
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어 리턴으로 사용할 수 없게 된다.
        * */

        String id = "user01";
        String pwd = "pass01";
        String name = "jin";
        int age = 20;
        char gender = '여';
        String[] hobbies = new String[] {"야구", "코딩","누워있기"};

        System.out.print("hobbies : ");
        for (int i = 0; i<hobbies.length;i++){
            System.out.print(hobbies[i] + " ");
        }
        
        // 사용자 정의의 자료형 사용하기
        // 변수 선언 및 객체 생성
        
        //표현식
        /* 클래스 변수명 = new 클래스();    <- 사용자 정의의 자료형 클래스
        *   . <- 참조 연산자
        * */

        Member member = new Member();
        
        // 생성된 인스턴스(객체)의 초깃값 확인하기
        System.out.println("\nid: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.println("hobbies: " + member.hobbies);

        // 필드에 접근해서 변수처럼 사용해보기
        member.id = "user02";
        member.pwd = "pass02";
        member.name = "jin2";
        member.age = 22;
        member.gender = '여';
        member.hobbies = new String[] {"먹기","자기","눕기"};

        System.out.println("====================");
        System.out.println("id: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.print("hobbies: ");
        for (String str : member.hobbies){
            System.out.print(str + " ");
        }
    }
}

package com.ohgiraffers.section02.use;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // DTO(데이터 위주) & 행위 위주의 클래스를 활용한 예제
        
        // DTO 활용 회원 관리 프로그램
        /*
        * 1. Application 에서 여러명의 회원정보 받아서 등록
        * 2. 전체 회원 조회 시 등록된 회원 정보 반환
        * */

        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("하위의 메뉴 중 원하는 메뉴를 숫자로 입력해주세요");

            System.out.println("1. 회원 등록하기");
            System.out.println("2. 전체 회원 정보 조회하기");
            System.out.println("3. 종료");

            System.out.print("메뉴 선택: ");

            int num = sc.nextInt();

            User user = new User();

            switch (num){
                case 1:
                    user.resigter();
                    break;
                case 2:
                    user.getList();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("해당 번호의 동작은 없습니다. 다시 골라주세요.");
                    break;
            }
        }
    }
}

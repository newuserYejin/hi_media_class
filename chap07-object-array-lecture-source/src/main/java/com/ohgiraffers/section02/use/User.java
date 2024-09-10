package com.ohgiraffers.section02.use;

import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);
    
    public void resigter() {
        System.out.print("몇명의 회원을 등록하시겠습니까?");
        int num = sc.nextInt();

        MemberDTO[] members = new MemberDTO[num];

        for (int i=0; i < num ;i++) {
            sc.nextLine();
            System.out.print("아이디를 입력하세요: ");
            String id = sc.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String pwd = sc.nextLine();
            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("성별을를 입력해주세요: ");
            char gender = sc.nextLine().charAt(0);
            System.out.print("나이를 입력해주세요: ");
            int age = sc.nextInt();

            members[i] = new MemberDTO(i,id,pwd,name,age,gender);
        }

        MemberInsertManager insertManager = new MemberInsertManager();
        insertManager.insert(members);
    }


    public void getList() {

        MemberSearchManager searchMemager = new MemberSearchManager();

        MemberDTO[] result = searchMemager.searchAllMembers();

        System.out.println("===================");

        for (MemberDTO i : result){
            System.out.println(i.toString());
        }

        System.out.println(result.length + "명의 가입이 완료되었습니다.");
    }
}

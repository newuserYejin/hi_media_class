package com.ohgiraffers.section02.use;

public class MemberInsertManager {
    public void insert(MemberDTO[] members) {

        System.out.println("전달 받은 회원 " + members.length + "명 등록하겠습니다.");

        for (int i = 0;i<members.length;i++){
            System.out.println(members[i].getName() + "님 회원 등록이 완료 되었습니다.");
        }
    }
}

/*
* class 분리 기준
* 1. 반복 작업
* 2. MVC
*
* 데이터 접근단 (DB)
* 컨트롤러단 (서버, 백)
* 서비스단 (프론트)
*
* */

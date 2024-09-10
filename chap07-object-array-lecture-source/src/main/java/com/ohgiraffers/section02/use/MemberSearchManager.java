package com.ohgiraffers.section02.use;

public class MemberSearchManager {

    public MemberDTO[] searchAllMembers() {
        return new MemberDTO[]{
                new MemberDTO(1, "1", "1", "ibao", 5, 'f'),
                new MemberDTO(2, "2", "2", "fubao", 3, 'f'),
                new MemberDTO(3, "3", "3", "rubao", 5, 'f')
        };
    }
}

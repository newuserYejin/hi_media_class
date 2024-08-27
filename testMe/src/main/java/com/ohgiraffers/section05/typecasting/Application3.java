package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        
        // 자동 형 변환과 강제 형변환을 이용해서 서로 다른 자료형끼리 계산 
        
        
        int inum = 10;
        long lnum = 100;

//        int isum = inum + lnum;          연산의 결과가 더 큰 long로 계산되기 때문에 int형에 저장 불가
        int isum = (int) (inum + lnum);
        int isum2 = inum + (int)lnum;

        long isum3 = inum + lnum;

    }
}

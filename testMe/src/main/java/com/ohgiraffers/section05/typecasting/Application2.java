package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        
        // 강제 형 변환 ex) 실수 -> 정수 (소수점 버리기)

        // 정수끼리 형 변환
        long lnum = 8;
        int inum = (int) lnum;

        // 실수를 정수로 강제 형 변환
        double fnum = 4.0;
        int num = (int) fnum;
        
        System.out.println("num = " + num);

        // 문자형을 int 미만의 크기의 변수에 저장할 때
        char c = 'a';
        short s = (short) c;

        // 같은 2byte의 크기를 가진 자료형이지만 문자는 음수가 없기 때문에 강제 형 변환을 거쳐야 한다.
        
        System.out.println("s = " + s);
        
        // 논리는 강제 형 변환도 불가
        
    }
}

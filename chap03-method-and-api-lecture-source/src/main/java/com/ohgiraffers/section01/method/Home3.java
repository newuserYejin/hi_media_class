package com.ohgiraffers.section01.method;

public class Home3 {
    public static void main(String[] args) {
        int lineNum = 1;

        Home3 home = new Home3();

        lineNum = home.testResult("이승현",lineNum,50,66,74);
        lineNum = home.testResult("정은미",lineNum,37,67,73);
        lineNum = home.testResult("문정현",lineNum,85,85,82);
        lineNum = home.testResult("윤이정",lineNum,61,34,89);
        lineNum = home.testResult("박재민",lineNum,66,88,99);
        lineNum = home.testResult("김경훈",lineNum,97,100,24);
        lineNum = home.testResult("조평훈",lineNum,0,0,0);
    }

    public int testResult (String name, int lineNum,int kuk, int eng, int math){
        System.out.println(lineNum+"."+name+" 국어:"+kuk+" 영어: "+eng+" 수학: "+math);
        return ++lineNum;
    }
}

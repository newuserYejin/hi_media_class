package com.ohgiraffers.section04.comparison;

public class test {
    static boolean solution (int score){

        boolean result = false;

        if(score >= 80 && score <= 100){
            result = true;
        } else {
            result = false;
        }

        return score >= 80 && score <= 100 ? true : false;
    }
    public static void main(String[] args) {
        test s = new test();

        System.out.println(s.solution(50));
    }
}

package com.ohgiraffers.section02.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.StrictMath.random;

public class Application2 {
    public static void main(String[] args) {

        // TreeSet

        // 자동 오름차순 정렬
        TreeSet<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("html");
        tset.add("css");
        tset.add("mysql");
        tset.add("DB");

        System.out.println("tset = " + tset);
        
        // 로또번호 발생기
        // 중복 불가, 오름차순 정렬

        Set<Integer> lotto = new TreeSet<>();

        Random randomNum = new Random();

        while (!(lotto.size() == 6)){
            int num = randomNum.nextInt(1,46);
            lotto.add(num);
        }

        System.out.println("lotto = " + lotto);

    }
}

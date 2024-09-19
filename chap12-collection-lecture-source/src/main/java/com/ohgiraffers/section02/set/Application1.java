package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        // set(HashMap)
        
        /*
        * set 특징
        * 1. 저장 순서 유지하지 않음
        * 2. 중복 저장 불가
        *
        * HashSet
        * 검색 속도가 빠르다.
        * */

        HashSet<String> hset = new HashSet<>();

        hset.add("apple");
        hset.add(new String("java"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        hset.add(new String("DB"));

        System.out.println("hset = " + hset);

        hset.add(new String("java"));

        System.out.println("hset = " + hset);
        System.out.println("hset.size() = " + hset.size());
        System.out.println("hset.contains(\"java\") = " + hset.contains("java"));

        // 순서 없는 데이터 하나씩 꺼내기

        // toArray() 이용
        Object[] arr = hset.toArray();
        for (int i = 0; i<arr.length; i++){
            System.out.println(i+" : "+arr[i]);
        }

        // Iterator 사용
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

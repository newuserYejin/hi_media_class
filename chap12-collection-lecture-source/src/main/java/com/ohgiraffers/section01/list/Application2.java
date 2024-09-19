package com.ohgiraffers.section01.list;

import java.util.LinkedList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        
        // LinkedList
        
        // ArrayList를 이용한 성능적인 단점 보완
        /*
        * 단일 연결 리스트
        * 저장한 요소들 사이에 순서가 없이 링크로 연결되어 있다.
        * 요소 추가와 삭제 시 연결 주소만 변경하면 되기 째문에 성능이 우수해진다.
        * 단, 이전 값을 알기 어렵다
        *
        * 이중 연결 리스트
        * 이전 요소도 참조하기 때문에 이전 요소에 접근도 용이해졌다.
        * LinkedList는 이중 연결 리스트에 해당한다.
        * */

        List<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Lemon");
        linkedList.add("PineApple");

        System.out.println("linkedList = " + linkedList);

        for (int i = 0; i<linkedList.size();i++){
            System.out.println(i+"번째 값 "+ linkedList.get(i));
        }

        for (String str : linkedList){
            System.out.println(str);
        }
        
        linkedList.set(1, "WaterMelon");

        System.out.println("linkedList = " + linkedList);

        linkedList.clear();
        System.out.println("linkedList = " + linkedList);
        System.out.println(linkedList.isEmpty());

    }
}

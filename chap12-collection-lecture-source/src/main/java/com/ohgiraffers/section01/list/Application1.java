package com.ohgiraffers.section01.list;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        // 컬렉션 (배열의 단점 극복)
        
        // 3가지의 인터페이스 중 1가지를 상속 받아 구현

        /*
        * 1. List 인터페이스
        * - 순서가 있는 데이터의 집합으로 데이터 중복 허용
        * 
        * 2. Set 인터페이스
        * - 순서가 없는 데이터의 집합
        * 
        * 3. Map 인터페이스
        * - 키와 값 한 쌍으로 이루어지는 데이터 집합
        * - 데이터 순서 관리하지 않는다. key값은 중복 불가
        * - value는 중복 가능
        * 
        * */

        // ArrayList

        ArrayList alist = new ArrayList();

        // List는 인터페이스이기 때문에 생성자를 가질 수 없다. 따라서 직접 적인 인터페이스 생성 불가
//        List list = new List();
        
        // List로 직접적인 생성은 불가능하기 때문에 List를 상속 받은 ArrayList로 생성   <-  다형성
        List list = new ArrayList();

        alist.add("Apple");
        alist.add("Orange");
        alist.add("Banana");
        alist.add("Remon");
        alist.add(3);           // Auto-boxing 처리가 된다 -> 기본 자료형 int,bouble과 같은것을 알아서 Integer, Double로 변경되어 저장된다.
        alist.add('c');
        alist.add(1.7);

        // 주소 값이 아니라 바로 값이 출력된다 -> toString이 자체적으로 오버라이드 되어 있기 떄문에
        System.out.println("alist = " + alist);

        for (int i = 0; i < alist.size();i++){
            System.out.println(i + "번째의 값: " + alist.get(i));
        }

        alist.add("Apple");

        System.out.println("alist = " + alist);

        alist.add(1,2);

        System.out.println("alist = " + alist);

        alist.remove(3);
        System.out.println("alist = " + alist);

        alist.remove("Apple");
        System.out.println("alist = " + alist);
        
        // set : 해당 위치의 값 수정
        alist.set(1, Boolean.valueOf(true));        // Boolean.valueOf를 이용하여 boolean을 Boolean으로 바꾸며 Wrapper클래스 활용
        System.out.println("alist = " + alist);

        // 모든 프레임워크 클래스는 제네릭 클래스로 지정되어 있다.
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Lemon");
        strList.add("Mango");
        strList.add("Grape");
        System.out.println("strList = " + strList);

        // 지정 타입에 맞지 않으면 저장 불가.
//        strList.add(5);
//        strList.add('n');

        // 정렬

        Collections.sort(strList);
        System.out.println("strList = " + strList);

        // 연결 리스트로 변경
        strList = new LinkedList<>(strList);

        //Iterator 이용한 내림차순 저장
        Iterator<String> dIter = ((LinkedList<String>)strList).descendingIterator();

        List<String> destList = new ArrayList<>();
        while (dIter.hasNext()){
            destList.add(dIter.next());
        }

        System.out.println("dIter = " + destList);
    }
}

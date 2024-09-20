package com.ohgiraffers.section03.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        // Map
        
        // 키와 값 세트로 저장

        HashMap hmap = new HashMap();

        hmap.put("one",new Date());
        hmap.put(12,"red apple");
        hmap.put(33,133);
        hmap.put(355,40.24);

        System.out.println("hmap = " + hmap);

        hmap.put(12,"yellow apple");
        System.out.println("hmap = " + hmap);

        System.out.println("12키에 해당하는 값: "+ hmap.get(12));
        
        hmap.remove(33);
        System.out.println("hmap = " + hmap);

        System.out.println("hmap.size() = " + hmap.size());

        Map<String,String> hmap2 = new HashMap<>();
        hmap2.put("fdsin","one");
        hmap2.put("sd","two");
        hmap2.put("scacsin","three");
        hmap2.put("scd","four");

        System.out.println("hmap2 = " + hmap2);
        
        // key만 분리해서 set만들기
        Set keySet = hmap2.keySet();
        System.out.println("hmap2.keySet() = " + hmap2.keySet());
        System.out.println("ketSet = " + keySet);

        Iterator kk = keySet.iterator();
        
        while (kk.hasNext()){
            System.out.println("hmap2.get(kk.next()) = " + hmap2.get(kk.next()));
        }
    }
}

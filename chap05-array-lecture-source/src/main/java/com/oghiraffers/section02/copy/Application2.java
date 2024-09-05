package com.oghiraffers.section02.copy;

public class Application2 {
    public static void main(String[] args) {

        // 얕은 복사를 활용한 예제 : 리턴 값으로 동일한 배열을 리턴하고 싶은 경우 사용

        String[] str = {"푸바오","러바오","아이바오","후이바오","루이바오"};

        System.out.println("판다 :"+str.hashCode());

        print(str);
        
        // 리턴 값으로 활용
        String[] animals = getAnimals();
        print(animals);

    }

    public static void print( String[] st ){
        for(int i = 0; i<st.length;i++){
            System.out.println(i+1+"번째 출력: " + st[i]);
        }

    }

    public static String[] getAnimals(){
        String[] animals = {"후이바오","루이바오"};

        System.out.println("getAnimals의 hashCode : "+animals.hashCode());

        return animals;
    }
}

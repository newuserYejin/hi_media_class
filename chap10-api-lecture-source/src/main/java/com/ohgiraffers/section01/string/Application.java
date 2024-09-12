package com.ohgiraffers.section01.string;

public class Application {
    public static void main(String[] args) {

        // String 클래스 메소드

        // .charAt() : 해당 문자열의 특정 인덱스에 해당 하는 문자 반환

        String str1 = "apple";

        for(int i = 0; i< str1.length();i++){
            System.out.println(str1.charAt(i));
        }
        
        // concat(): 문자열을 인자로 전달 된 문자열을 합쳐서 새로운 문자열로 반환
        
        String str2 = "java";
        String str3 = "mySql";

        System.out.println("concat 활용: " + (str2.concat(str3)));
        System.out.println("concat 활용 후의 str2: "+str2);
        
        // trim() : 문자열의 앞뒤 공백 제거 후 반환

        String trimStr = " dfamfosdofm       ";
        System.out.println(trimStr.trim());

        // toUpperCase(), toLowerCase()

        // subString(): 문자열의 일부를 잘라내어 새로운 문자열 반환
        // subString(시작위치 , 종료 부분 인덱스 +1);
        // subString(시작위치 인덱스) : 시작 위치의 인덱스부터 끝까지 반환
        
        String str4 = "javamySQL";
        System.out.println(str4.substring(0,4));

        //replace() : 문자열에서 대체할 문자열로 분자열을 변경해서 사용한다.
        System.out.println(str4.replace("java","python"));

    }
}

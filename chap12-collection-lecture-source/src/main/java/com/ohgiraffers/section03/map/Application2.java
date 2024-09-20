package com.ohgiraffers.section03.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        // properties

        /*
        * Map과 비슷하지만 key와 value 모두 문자열만 사용가능하다.
        * */

        Properties prop = new Properties();

        prop.setProperty("driver","com.mysql");
        prop.setProperty("url","jdbc.mysql");
        prop.setProperty("username","ohgiraffers");
        prop.setProperty("password","ohgiraffers");

        System.out.println("prop = " + prop);

        // 예외처리 -> 파일 입출력 관련은 예외처리 강제화
        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

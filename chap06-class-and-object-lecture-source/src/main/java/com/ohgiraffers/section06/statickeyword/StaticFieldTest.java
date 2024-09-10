package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){}

    // 저장 된 값을 가져오기 위한 getter 생성

    public int getNonStaticCount(){
        return this.nonStaticCount;
    }


    // static 필드에 접근하기 위해서는 클래스명.변수명으로 접근
    // this도 가능하나 사용하지 않는다.
    public int getStaticCount(){
        return StaticFieldTest.staticCount;
//        return staticCount;
    }

    public void increaseNonStaticCount(){
        this.nonStaticCount ++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;
//        staticCount++;
    }

}

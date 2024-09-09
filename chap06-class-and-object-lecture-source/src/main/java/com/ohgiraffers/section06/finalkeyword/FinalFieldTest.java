package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    
    // final 키워드

    /* final 사용 위치
    * 1. 지역변수 : 초기화 후 변경 불가
    * 2. 매개변수 : 호출 시 전달인자 변경 불가능
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가능
    * 4. 클래스 변수 : 프로그램 시작 후 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    * */

    // 1. non-static 필드
    // 기본값으로 둘 수 없기 때문에 final 을 사용할때는 선언과 동시에 초기화 필수

    // 방법1. 선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;

    // 방법2. 생성자를 통한 초기화
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }
    
    // 2. static 필드에 final 키워드 사용
    private static final double PI = 3.14;

    // static 이 붙은 키워드는 생성자는 초기에 로드되면서 생성되는데 생성자호출은 그 후의 일이기때문에 생성자를 이용한 초기화 불가능.
    
    // 단, 정적 초기화 블록으로 초기화 가능
    private static final double STATIC_DOUBLE;

    static {
        STATIC_DOUBLE = 0.5;
    }


}

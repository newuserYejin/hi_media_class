package com.ohgiraffers.section03.overriding;

// 클래스에 final 을 붙이게 되면 상속을 제한하는 의미이다.
public class SubClass extends SuperClass{
    
    // 메소드 이름 변경하면 오류 발생
//    @Override
//    public void method2(int num){}
    
    // 메서드 리턴 타입 타입 변경 시 오류 발생
    
    // 매개변수의 갯수나 타입 변경 시 오류 발생

    // 메소드 이름 , 리턴타입, 매개변수 갯수, 타입, 순서 모두 일치해야 한다.

    // private 메서드 오버라이딩 불가
    
    // final 키워드 오버라이딩 불가
    
    // 부모 메서드의 접근 제한자와 같거나 더 넓은 범위로 해야한다.
    
//    @Override
//    void protectedMethod(){}          // 더 좁은 범위로는 불가

//    @Override
//    protected void protectedMethod(){}        // 이건 가능
    
    @Override
    public void protectedMethod(){}         // 더 큰 범위로도 가능

}

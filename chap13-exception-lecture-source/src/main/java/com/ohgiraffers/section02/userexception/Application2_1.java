package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.priceNegativeException;

public class Application2_1 {
    public static void main(String[] args) {
        ExceptionTest2 et = new ExceptionTest2();

        // 에외처리 주의사항

        /*
        * catch블럭 은 위에서부터 아래로 자신과 맞는 타입의 경우를 찾아 동작하게 되는데,
        * 상위 타입인 NegativeException 가 먼저오면 NegativeException 를 상속 받은
        * MoneyNegativeException 와 priceNegativeException 모두 앞에서 걸러지기 때문에
        * MoneyNegativeException 에는 닿지 못한다. 따라서 에러가 발생한다.
        *
        * 단 하위타입인 MoneyNegativeException 가 먼저 작성되는건 괜찮다.
        * */

//        try {
//            et.checkEnoughMoney(2000,300);
//
//            // 예외상황 별 catch 다르게 작성해서 처리
//        } catch (NegativeException e) {
//            System.out.println("상품 값이 음수!!");
//            System.out.println(e.getMessage());
//        } catch (MoneyNegativeException e) {
//            System.out.println("돈이 음수!!");
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("돈이 부족!!");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("아직 프로그램 종료 안됐음");
//        }

        // finally : 예외 발생과 상관 없이 실행할 내용

        System.out.println( "프로그램을 종료합니다.");
    }
}

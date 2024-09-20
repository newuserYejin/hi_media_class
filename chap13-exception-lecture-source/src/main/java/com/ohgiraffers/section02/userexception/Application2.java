package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.priceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest2 et = new ExceptionTest2();

        try {
            et.checkEnoughMoney(2000,300);
            
            // 예외상황 별 catch 다르게 작성해서 처리
        } catch (priceNegativeException e) {
            System.out.println("상품 값이 음수!!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("돈이 음수!!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("돈이 부족!!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("아직 프로그램 종료 안됐음");
        }
        
        // finally : 예외 발생과 상관 없이 실행할 내용

        System.out.println( "프로그램을 종료합니다.");
    }
}

package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.priceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest2 et = new ExceptionTest2();

        try {
//            et.checkEnoughMoney(-20000, 30000);
//            et.checkEnoughMoney(20000, -30000);
            et.checkEnoughMoney(200000, 30000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

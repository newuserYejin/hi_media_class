package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.priceNegativeException;

public class ExceptionTest2 {
    public void checkEnoughMoney(int price, int money) throws priceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        // 상품 가격 음수
        if (price < 0){
            throw new priceNegativeException("상품 가격이 음수입니다.");
        }

        // 가진돈이 음수
        if(money < 0){
            throw new MoneyNegativeException("보유 금액은 음수 일 수 없습니다.");
        }

        if (money < price){
            throw new NotEnoughMoneyException("가진 돈 보다 비싼 상품입니다.");
        }

    }
}

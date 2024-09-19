package com.ohgiraffers.section01.list;

import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {

        // stack

        // LIFO 구조

        Stack<Integer> integerStack = new Stack<>();
        
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = " + integerStack);
        
        // stack에서 요소를 찾을 때 search() 사용 가능 <- 현재 몇번째에 있는지
        System.out.println(integerStack.search(3));
        
        /*
        * peek() : 가장 상단의 요소 반환
        * pop() : 가장 상단 요소 반환 후 삭젠
        * */

        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);

        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);


    }
}

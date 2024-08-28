package com.ohgiraffers.section01.method;

public class Home {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Home home = new Home();

        home.add(num1,num2);
    }

    public void add (int a, int b) {
        int c = a + b;
        int d = b++;

        sub(c,d);

        System.out.println("결과: " + c);

        sub(a,b);
    }

    public void sub (int a, int b) {
        System.out.println("결과: " + (a - b));
    }
}

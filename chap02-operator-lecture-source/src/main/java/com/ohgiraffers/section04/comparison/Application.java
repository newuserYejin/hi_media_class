package com.ohgiraffers.section04.comparison;

public class Application {
    static int solution(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        Application app = new Application();

        System.out.println(app.solution(num1, num2));

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = l;
        i = ch;
    }
}

package com.ohgiraffers.section04.scanner;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();

        System.out.println(rm.randomNumber(-50,50));
        System.out.println(rm.randomUpperAlphabet(5));
        System.out.println(rm.rockPaperScissors());
        System.out.println(rm.tossCoin());
    }
}

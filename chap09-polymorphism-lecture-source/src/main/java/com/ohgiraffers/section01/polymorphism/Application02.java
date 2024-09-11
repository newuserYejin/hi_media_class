package com.ohgiraffers.section01.polymorphism;

public class Application02 {

    public static void main(String[] args) {
        Animals[] animals = new Animals[5];

        animals[0] = new Frog();
        animals[1] = new Raccoon();
        animals[2] = new Frog();
        animals[3] = new Raccoon();
        animals[4] = new Frog();

        for (Animals a : animals){
            a.eat();
        }

        System.out.println("================================");
        for (Animals a: animals){
            if (a instanceof Frog){
                ((Frog) a).attack();
            } else if (a instanceof Raccoon) {
                ((Raccoon) a).bite();
            }
        }
    }
}

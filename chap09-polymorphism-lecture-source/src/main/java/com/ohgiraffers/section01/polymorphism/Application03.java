package com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {
     
        // 다형성을 적용하여 리턴타입에 활용

        Application03 app3 = new Application03();

        Animals ani = app3.getRandomAnimal();

        ani.eat();

        if (ani instanceof Frog){
            ((Frog) ani).attack();
        } else if (ani instanceof Raccoon){
            ((Raccoon) ani).bite();
        } else{
            System.out.println("너는 누구야?");
        }
    }

    public Animals getRandomAnimal(){           // 어떤게 반환될지 모르기 때문에 두가지의 공통 Animals 를 리턴형식으로 지정한다.
        int random = (int)(Math.random() *2);
        return random == 0 ? new Raccoon() : new Frog();
    }
}

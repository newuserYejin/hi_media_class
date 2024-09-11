package com.ohgiraffers.section01.polymorphism;

public class Application01 {
    public static void main(String[] args) {

        // 다형성

        System.out.println("================동물 생성================");
        Animals animals = new Animals();

        animals.eat();
        animals.run();
        animals.howling();

        System.out.println("================너구리 생성================");
        Raccoon raccoon = new Raccoon();
        raccoon.eat();
        raccoon.run();
        raccoon.howling();
        raccoon.bite();

        System.out.println("================개구리 생성================");
        Frog frog = new Frog();
        frog.eat();
        frog.run();
        frog.howling();
        frog.attack();

        // 부모 타입으로 자식의 인스턴스 주소값 저장
        Animals a1 = new Frog();                // 개구리는 동물이다.
        Animals a2 = new Raccoon();             // 너구리는 동물이다.

//        Frog f1 = new Animals();              동물은 개구리다라는 의미가 되기 때문에 안된다.
        System.out.println("============동적 바인딩 확인=============");
        a1.howling();
                            // a1, a2는 부모의 클래스로 생성되지만 자식의 부분에 override가 된 것이 있다면 그걸로 덮어 씌워진다.
        System.out.println("==============클래스 형변환==============");
        ((Frog)a1).attack();
        ((Raccoon)a2).bite();

        // 타입 형변환을 잘못하면 컴파일에서는 문제가 없지만 런타임시 문제가 발생한다.
        // instanceod 로 타입 확인

        System.out.println("=============타입 확인===============");
        System.out.println("a1 is Frog? :" + (a1 instanceof Frog));
        System.out.println("a1 is Raccoon? :" + (a1 instanceof Raccoon));

        System.out.println("a1 is Animal? :" + (a1 instanceof Animals));
        System.out.println("a1 is Object? :" + (a1 instanceof Object));

        // 업캐스팅 & 다운 캐스팅

        // 다운 캐스팅(자동형 변환)
        Animals ani = new Frog();

        // 업 캐스팅(강제 형변환)
//        Raccoon ra = (Raccoon) new Animals();

    }
}

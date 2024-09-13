package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        // animal은 rabbit 의 후손이 아닌 부모이기 떄문에 불가
//        RabbitFarm<Animal> farm1 =new RabbitFarm<Animal>();

//          RabbitFarm<Integer> testrb = new RabbitFarm<Integer>();
//          testrb.setAnimal(1);
//          System.out.println(testrb.getAnimal());

          RabbitFarm<Rabbit> rb1= new RabbitFarm<Rabbit>();
          RabbitFarm<Bunny> rb2 = new RabbitFarm<Bunny>();
          RabbitFarm<DrunkenBunny> rb3 = new RabbitFarm<DrunkenBunny>();

          // 자신 또는 자신이 상속받거나 자신을 상속받은 클래스만을 넘겨줄 수 있다
          rb1.setAnimal(new DrunkenBunny());
          rb1.getAnimal().cry();
          rb2.setAnimal(new Bunny());
          rb2.getAnimal().cry();
          rb3.setAnimal(new DrunkenBunny());
          rb3.getAnimal().cry();
    }

}

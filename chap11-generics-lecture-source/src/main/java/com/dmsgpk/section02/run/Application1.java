package com.dmsgpk.section02.run;

import com.dmsgpk.section02.Bunny;
import com.dmsgpk.section02.DrunkenBunny;
import com.dmsgpk.section02.Rabbit;
import com.dmsgpk.section02.RabbitFarm;

public class Application1 {
    // extends : 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.
    public static void main(String[] args) {

        /*
        * extends 키워드를 이용하여 특정 타입만 사용하도록 범위 지정
        * -> 지정한 특정 타입과 함께, 특정 타입의 자식 타입들도 대입 가능
        *
        * */

        // Animal 타입은 Rabbit의 후손이 아니기 때문에, 제네릭 클래스 인스턴스 생성이 불가하다.
        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

        // <T>의 타입을 객체형태(Rabbit)으로 지정한 것.
        RabbitFarm<Rabbit> farm = new RabbitFarm<>();
        RabbitFarm<Bunny> farm1 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm2 = new RabbitFarm<>();

        farm.setAnimal(new Rabbit());
        farm1.setAnimal(new Bunny());
        farm2.setAnimal(new DrunkenBunny());

        farm.getAnimal().cry(); // animal의 타입? => Rabbit
        farm1.getAnimal().cry(); // animal의 타입? => Bunny
        farm2.getAnimal().cry(); // animal의 타입? => DrunkenBunny
    }

}

package com.dmsgpk.section02.run;

import com.dmsgpk.section02.*;

public class Application2 {
    // 와일드카드(wildCard)
    public static void main(String[] args) {

        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        * 그 객체의 타입 변수를 제한 할 수 있다.
        *
        * <?> : 제한 없음
        * <? extends [type]> : 와일드카드의 상한 제한
        *                      Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능
        * <? super [type]>   : 와일드카드의 하한 제한
        *                      Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능
        * */

        // 와일드카드팜 객체 생성
        WildCardFarm wildCardFarm = new WildCardFarm();

        // 매개변수의 타입 제한이 없는 경우
        // 포유류는 토끼 농장에 생성할 수 없다. 매개변수로 사용할 수 없다.
        // 포유류라서가 아니라 토끼들만 토끼농장에 상속받아 사용할 수 있게 만들었기 때문이다.
        // wildCardFarm.anyType(new RabbitFarm<>(new Mammal()));

        // >> wildCardFarm에서 .참조하는 타입이 무엇인지 확인해라!

        // 매개변수로 전달이 되는 걸 확인할 수 있다.
        // RabbitFarm을 생성만 가능하면 <?>에서는 모두 매개변수로 사용 가능하다.

        System.out.println("==================<?> ==================");
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        System.out.println();


        // extends Bunny이기 때문에 Bunny거나 Bunny의 후손 토끼농장만 매개변수로 사용 가능.
        // 상위 타입으로 만든 토끼농장은 매개변수로 사용 불가능하다.
        // 타입과 타입의 후손을 이용해 생성한 인스턴스만 인자로 사용
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));

        System.out.println("==================<? extends Bunny> ==================");
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        System.out.println();


        // extends Bunny의 <? super>이기 때문에 Bunny이거나 Bunny의 상위 토끼농장만 매개변수로 사용 가능.
        // 후손타입으로 만든 드렁큰버니 토끼농장은 매개변수로 사용 불가능하다.

        System.out.println("==================<? super Bunny> ==================");
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        System.out.println();

    }
}

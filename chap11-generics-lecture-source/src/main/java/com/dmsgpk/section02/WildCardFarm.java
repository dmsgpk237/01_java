package com.dmsgpk.section02;

public class WildCardFarm {

    // 매개변수로 전달받는 토끼농장을 구현할 때 사용할 타입변수를 제한한다.

    // 토끼농장에 있는 어떤 토끼든 상관없이 우리가 매개변수를 받아서 쓸 수 있다.
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // Bunny거나 Bunny를 상속받은 토끼농장만 사용가능
    // 버니와 드렁큰버니 2개의 타입의 매개변수만 받아서 사용할 수 있다.
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    //Bunny거나 Bunny의 부모타입인 토끼농장만 사용 가능
    // 버니와 래빗 2개의 타입의 매개변수만 받아서 사용할 수 있다.
    public void superType(RabbitFarm<? super Bunny> farm) {

        farm.getAnimal().cry();
    }
}

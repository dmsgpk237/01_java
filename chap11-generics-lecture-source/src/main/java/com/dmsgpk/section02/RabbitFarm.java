package com.dmsgpk.section02;

    // 인터페이스 클래스 상속시 implements 키워드 대신 extends 키워드를 사용해야 한다.
    // public class RabbitFarm<T implements Animal> {} => 에러
    // public class RabbitFarm<T extends Animal> {} => 정상

public class RabbitFarm<T extends Rabbit> {


    // 현재 상황으로는 어떤 타입을 사용할 지 모르지만,
    // Rabbit이나 Rabbit을 상속받는 Bunny, DrunkBunny 토끼의 후손만 가능하다.
    private T animal;

    // 기본 생성자
    public RabbitFarm() {

    }
    // 매개변수 있는 생성자
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

}

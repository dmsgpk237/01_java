package com.dmsgpk.section01.polymorphism;

public class Application {

    /*
    * 다형성
    *
    * 다형성이란 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미한다.
    * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
    * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
    *
    * 다형성은 객체지향 프로그래밍의 4대 특징(캡슐화, 상속, 추상화, 다형성) 중 하나이며
    * 활용성이 높고, 장점이 많다. 하지만 학습이 어렵다.
    * */

    /*
    * 다형성 장점
    * 1. 여러 타입의 객체를 하나의 타입으로 관리 할 수 있기에 유지보수성과 생산성 증가
    * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메시지를 수신 할 수 있다.
    *    동일한 메시지를 수신하고 처리할 때 객체별로 다르게 할 수 있다.
    * 3. 확장성이 좋은 코드를 작성할 수 있다.
    * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
    * */

    public static void main(String[] args) {

        System.out.println("-------------------- Animal 생성 --------------------");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("-------------------- Rabbit 생성 --------------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("-------------------- Tiger 생성 --------------------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

    }
}

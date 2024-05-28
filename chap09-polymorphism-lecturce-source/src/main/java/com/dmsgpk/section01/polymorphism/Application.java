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

        System.out.println();
        System.out.println("-------------------- Rabbit 생성 --------------------");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println();
        System.out.println("-------------------- Tiger 생성 --------------------");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        // 부모 타입으로 자식의 인스턴스 주소를 저장
        System.out.println();
        System.out.println("======== 동적 바인딩 확인 ========");
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        // Rabbit이라는 객체와 Tiger이라는 객체는 Animal을 상속받았기 때문에 가능하다.
        // 하지만 반대의 경우는 불가능 예) Rabbit r = new Animal();
        // 토끼가 동물 안에 속해있지만, 동물이 토끼 안에 속해있지는 않기 때문이다.

        /*
        * 동적 바인딩이란?
        *
        * 컴파일 당시에는 해당 타입의 메소드와 연결이 되어있다가
        * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것
        * */

        a1.cry(); //컴파일 당시에는 animal에 연결이 되어 있다가, 실행하면 rabbit과 연결되는 것
        a2.cry();

        // 현재 레퍼런스 변수의 타입이 Animal이기 때문에 Rabbit과 Tiger가 가지고 있는 고유 기능은 동작불가.
        // a1.jump();

        //만약 쓰고 싶으면 형변환 해서 써야한다.
        System.out.println();
        System.out.println("=========클래스타입 형변환=========");
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

        // 타입 형변환을 잘못하는 경우 컴파일시 문제되지 않지만 런타임시 Exception 발생
        // ((Tiger)a1).bite();

        // instanceof 연산자(참/거짓)
        // 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        System.out.println();
        System.out.println("======== instanceof 확인 ========");
        System.out.println("a1이 Tiger인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1가 Rabbit인지 확인 : " + (a1 instanceof Rabbit));

        // 하나의 인스턴스가 여러가지 타입을 가질 수 있다 -> 상속받은 타입도 함께 가지고 있다(다형성)
        System.out.println("a1이 Animal인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1이 Object인지 확인 : " + (a1 instanceof Object));

        System.out.println();
        System.out.println("=========== 조건이 맞는 경우에만 실행 ===========");
        // instanceof 연산자를 활용해서 타입에 맞는 경우에만 클래스 형변환을 적용
        if (a1 instanceof Rabbit) {
            ((Rabbit)a1).jump();
        }
        if (a2 instanceof Tiger) {
            ((Tiger)a2).bite();
        }


        // 클래스의 업캐스팅과 다운캐스팅
        /*
        * 클래스의 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형변환 -> 부모 클래스로 형변환
        * down-casting : 하위 타입으로 형변환 -> 자식 클래스로 형변환
        * 작성 여부에 따라 명시적과 묵시적으로 구분된다.
        * */

        // 묵시적 형변환 -> up-casting의 경우 적용됨.
        Animal animal1 = (Animal) new Rabbit(); //up-casting 명시적 형변환
        Animal animal2 = new Rabbit(); // up-casting 묵시적 형변환

        Rabbit rabbit1 = (Rabbit) animal1; //down-casting 명시적 형변환
        // Rabbit rabbit2 = animal1; //down-casting 묵시적 형변환 불가


    }
}

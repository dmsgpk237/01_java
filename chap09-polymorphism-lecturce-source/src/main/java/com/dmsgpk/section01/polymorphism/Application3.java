package com.dmsgpk.section01.polymorphism;

public class Application3 {

    // 다형성을 적용해, 매개변수에 활용할 수 있다.

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // 동일한 타입
        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed((Animal) animal3);
        app3.feed((Animal) animal4);

        // 인스턴스를 생성하여 바로 묵시적 형변환을 이용해 전달 가능
        app3.feed(new Rabbit());
        app3.feed(new Tiger());
    }

    // 다형성이 없으면 Rabbit과 Tiger 객치를 각 각 따로 만들어서 사용해야 하는데,
    // Animal로 하나로 합치니 두 개를 다 쓰지 않아도 쓸 수 있음.

    public void feed(Animal animal) {
        animal.eat();

    }
}

package com.dmsgpk.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        // 다형성을 적용해 객체 배열을 만들어 인스턴스를 연속 처리

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        // Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적 바인딩을 이용 가능
        // i 가 animals의 length 길이까지 i를 하나씩 증가시켜서 animals 안에 있는 객체를 하나씩 훑는다.
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();

        }

        // 각 클래스 별 고유한 메소드를 동작시키기
        // down-casting을 명시적으로 해줘야 함.
        // CalssCastExcetpion instanceof 연산자를 이용해서 확인해야 함.

        System.out.println();
        for (int i = 0; i < animals.length; i++) {

            // animals i에 있는 객체가 Rabbit이면 Rabbit으로 형변환 해준다.
            if (animals[i] instanceof Rabbit) {
                ((Rabbit)animals[i]).jump();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger)animals[i]).bite();
            } else {
                System.out.println("호랑이나 토끼가 아닌뎁쇼");
            }

        }

    }
}

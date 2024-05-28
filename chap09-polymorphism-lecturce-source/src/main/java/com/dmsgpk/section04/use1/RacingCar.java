package com.dmsgpk.section04.use1;

// 처음 빨간줄이 나오는 이유는 Car안에 있는 추상 메소드를 구현하라고 컴파일러가 알려주는 것.
public class RacingCar extends Car{

    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");

    }
}

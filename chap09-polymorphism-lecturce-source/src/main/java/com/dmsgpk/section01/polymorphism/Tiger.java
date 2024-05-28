package com.dmsgpk.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 달리지 않습니다. 어슬렁 어슬렁 걸어다닙니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흐으으으으으응");
    }

    // 호랑이 물어뜯기 기능 있음
    public void bite() {
        System.out.println("호랑이가 물어뜯습니다 크르르라아아아앙!!");
    }
}

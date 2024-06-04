package com.dmsgpk.section01.intro;

/*
* 자바에서는 메서드를 독립적으로 선언하는 것이 불가능
* -> 클래스나 인터페이스 내부에서만 선언되기 때문에 메서드를 가지는 클래스나 인터페이스가 필요하다.
* 람다식은 이 중 인터페이스를 사용할 수 있다.
* 모든 인터페이스에 메서드를 작성하다고 람다식을 활용 가능한 것은 아니다.
* 인터페이스 내부에 하나의 추상메서드가 선언된 인터페이스만 람다식으로 사용 가능하다.
* 이런 인터페이스를 함수적 인터페이스(functional interface)라고 한다.
* */

// 인터페이스가 함수적 인터페이스인지 확인해주는 기능(@FunctionalInterface)
@FunctionalInterface
public interface Calculator {

    public int sumTwoNumbers(int a, int b);

    // 두 개의 추상메서드가 선언되어 에러남. 주석처리.
    // public int multiplyTwoNumbers(int a, int b);




}

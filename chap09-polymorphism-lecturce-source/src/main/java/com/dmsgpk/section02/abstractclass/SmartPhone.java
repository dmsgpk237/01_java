package com.dmsgpk.section02.abstractclass;

// java에서는 단일 상속만 가능하다
public class SmartPhone extends Product /*,java.util.Scanner*/{

    public SmartPhone() {}

    //추상메소드 구현
    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }

    // 이렇게 해야지만 product 안에 있는 기능을 사용할 수 있다.
}

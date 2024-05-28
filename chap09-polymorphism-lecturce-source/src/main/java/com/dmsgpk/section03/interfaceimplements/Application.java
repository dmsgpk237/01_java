package com.dmsgpk.section03.interfaceimplements;

public class Application {

    // interface에 대해 이해
    public static void main(String[] args) {
        /*
        * 인터페이스(interface)
        * 자바의 클래스와 유사한 형태지만, 추상메소드와 상수 필드만 가질 수 있는
        * 클래스의 변형체이다.
        *
        * 객체들의 상호작용 통로, 개발할 때 화면 모두 인터페이스라고 한다.
        * */

        /*
        * 인터페이스의 사용목적
        * 1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다.(표준화)
        * 2. 자바의 단일상속의 단점을 극복할 수 있다.(다중 상속이 가능)
        *
        * > 추상 클래스와 인터페이스는 면접 질문에서도 많이 나온다.
        * */

        // 인스턴스를 직접 생성하지 못하고 생성자 자체가 존재하지 않는다.
        // InterProduct interProduct = new InterProduct();

        // 레퍼런스 타입으로 구현 가능.
        InterProduct interProduct = new Product();

        /*
        * 인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출
        *
        * 동적바인딩: 컴파일 당시에 해당 타입의 메소드와 연결되어 있다가
        *           런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것
        *
        *
        * */


        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        // 오버라이딩 하지 않으면 인터페이스의 default 메소드 호출
        interProduct.defaultMethod();

        // static 메소드는 인터페이스명.메소드명() 으로 호출함.
        InterProduct.staticMethod();

        // 상수 필드 접근도 인터페이스명.필드명 으로 접근이 가능
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

    }
}

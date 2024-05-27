package com.dmsgpk.section06.finalkeyword;

public class FinalFieldTest {
    /*
    * final
    * : 변경 불가의 의미를 담고 있는 키워드이다.
    *
    * final이 사용되는 곳 -> 변경 불가의 의미
    *
    * 1. 지역변수 : 초기화 이후에 값 변경 불가
    * 2. 매개변수 : 메소드 호출 시 전달한 인자 변경 불가
    * 3. 전역변수 : 인스턴스 생성 후, 초기화 이후 값 변경 불가
    * 4. 클래스(static) 변수 : 프로그램 start 후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * */

    // non-static field에 final 사용
    // -> 클래스 안에 변수를 만드는데, 스태틱이 붙지 않는 걸 논 스태틱이라고 함

    // private final int nonStaticNum;

    // 해결 방법 2가지
    // 1. 선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1; //카멜 케이스를 쓰지 않고 다 대문자를 써서 구분을 해준다.

    // 2. 생성자를 이용해서 초기화 한다.
    private final String NON_STATIC_NAME;

    // alt + insert > Constructor(생성자 생성)
    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    // 매개변수 있는 생성자를 만들어서 기본 생성자를 만들지 않는데, 우리가 일부러 기본 생성자를 만들면 오류
//    public FinalFieldTest() {
//    }

    // static field에 final 사용

    /*
    * static에서도 자바에서 지정한 기본값이 들어가기 때문에
    * final 키워드 사용시 초기화를 하지 않으면 에러가 발생한다.
    * */

    /*
    * 생성자를 이용한 초기화는 불가능
    * 생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에는 초기화가 일어나지 않는다.
    * 하지만 static은 프로그램이 start될 때 할당되기 때문에
    * 초기화 되지 않은 상태로 선언된 것과 동일하여
    * 기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
    * */

    //선언과 동시에 초기화
    private static final int STATIC_NUM = 1;

    // 생성자를 이용한 초기화 -> 에러 발생
//    private static final double STATIC_DOUBLE;
//
//    public FinalFieldTest(double staticDouble) {
//        STATIC_DOUBLE = staticDouble;
//    }



}

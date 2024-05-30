package com.dmsgpk.section01.generic;

public class GenericTest<T> {

    /*
    * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
    * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성된다.
    *
    * 타입변수는 T가 아닌 다른 알파벳도 가능하며, 클래스 선언부 <> 다이아몬드 연산자 안에
    * 여러개의 타입변수를 작성하는 것도 가능하다. 예) <T, B, C>
    * */


    private T value; // 타입 결정이 안 된 상태.


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

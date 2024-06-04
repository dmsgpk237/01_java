package com.dmsgpk.section02;

import java.util.Objects;
import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {

        /*
        * Predicate : 매개변수와 boolean 리턴값이 있는 textXXX()를 가지고 있다.
        *             이 메서드들은 매개변수 값을 이용하여 true 혹은 false 값을 리턴하는 역할을 한다.
        * */

        /* Predicate<T>#test(T t) : boolean : T를 조사하여 boolean을 리턴한다. */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123")); // true
        System.out.println("문자열인지 확인 : " + predicate.test(123)); // false




    }
}

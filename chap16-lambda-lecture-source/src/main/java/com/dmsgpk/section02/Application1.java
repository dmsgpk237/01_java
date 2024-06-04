package com.dmsgpk.section02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 표준 함수적 인터페이스
        * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
        * Consumer  : 리턴값이 없는 accept() 메서드를 가지고 있다. (매개변수 소비자 역할)
        * Supplier  : 매개변수가 없고, 리턴값이 있는 getXXX() 메서드를 가지고 있다.
        * Function  : 매개변수와 리턴값이 있는 applyXXX() 메서드를 가지고 있다.
        *             (매개변수를 리턴값으로 매핑)
        * Operator  : Function과 똑같이 applyXXX() 메서드를 가지고 있는데,
        *             매개변수로 연산을 한 후 통일된 타입으로 리턴한다.
        * Predicate : 매개변수와 boolean 값을 반환하는 testXXX() 메서드를 가지고 있다.
        *             (매개변수를 활용해서 boolean 값을 리턴한다.)
        * */

        Runnable runnable = () -> System.out.println("hello");
        runnable.run();

        /* Consumer<T>#accept(T t) : void : 객체 T를 받아 소비 */
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 출력됨");
        consumer.accept("이걸 출력! hello world");

        /* BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비 */
        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + "와(과) " + time + "이(가) 출력됨");
        biConsumer.accept("hello world", LocalTime.now());

        /* IntConsumer#accept(int value) : void : int값을 받아서 소비 */
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 숫자 " + num + "의 제곱은 " + (num*num) + "입니다.");
        intConsumer.accept(15);

        /* LongConsumer#accept(long value) : void : long 값을 받아서 소비 */
        LongConsumer longConsumer = (num) -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(1047820487);

        /* ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int 값을 받아 소비 */
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (((random, value) -> System.out.println("0부터 " + value + "전까지의 난수 발생 :" + random.nextInt(value))));
        // 객체를 넣어줘야 함.
        objIntConsumer.accept(new java.util.Random(), 30);

        /* ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long 값을 받아 소비 */
        ObjLongConsumer<LocalDate> objLongConsumer = (date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는 : " + date.plusDays(10));
        objLongConsumer.accept(LocalDate.now(), 10);

        /* ObjDoubleConsumer<T>#accept(T t) : void : 객체 T와 double 값을 받아 소비 */
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }

}

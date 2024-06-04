package com.dmsgpk.section02;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {

        // Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메서드를 가지고 있다.


        /* Supplier<T>#get() : T(리턴을 제네릭으로) : 객체 T를 리턴 */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);


        /* BooleanSupplier#getAsBoolean() : boolean : boolean 값을 리턴 */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0 ? false : true;
            // 랜덤이 0이면 false, 아니면 true를 반환하는 삼항연산자 작성
        };
        System.out.println("random true or false : " + booleanSupplier.getAsBoolean());


        /* IntSupplier#getAsInt() : int : int 값을 리턴 */
        IntSupplier intSupplier = () -> (int) (Math.random() *6) +1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());


        /* DoubleSupplier#getAsDouble() : double : double 값을 리턴 */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴 값 : " + doubleSupplier.getAsDouble());


        /* LongSupplier#getAsLong() : long : long 값을 리턴 */
        LongSupplier longSupplier = () -> new java.util.Date().getTime(); // 1970년 1월 1일 0시 0분 0초 이후 지난 시간
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());




    }
}

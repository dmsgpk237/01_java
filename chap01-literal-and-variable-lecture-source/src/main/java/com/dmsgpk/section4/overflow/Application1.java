package com.dmsgpk.section4.overflow;

public class Application1 {

    public static void main(String[] args) {


        //num1 = num1 + 1;

        /*
        * 오버 플로우
        *
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값을 순환시킨다.
        * */

        byte num1 = 127;
        System.out.println("num = " + num1);

        //후위 증감 연산자
        num1++; // 오버플로우 발생

        // 127 -> -128

        System.out.println("num1 overflow = " + num1);

        // 기억해야 할 것
        // 타입이 정해진 값을 넘어가게 되면 오버 플로우가 발생한다.
        // 오버 플로우가 발생하면 최대값이 최소값이 된다.


        /*
        * 언더 플로우
        *
        * 오버 플로우와 반대 개념으로 최소 범위보다 작은 수가 나올 경우 발생하는 현상이다.
        *
        * */

        byte num2 = -128; // 바이트 최소 저장범위

        System.out.println("num2 = " + num2);

        num2 --; // --는 빼는 역할 (++는 더하는 역할)

        System.out.println("num2 underflow = " + num2);

        // 이처럼 저장할 수 없는 수는 순환을 한다.

        int firstNum = 10000000;
        int secondNum = 700000; // int의 최대 저장 수는 대략 21억이다.

        int multi = firstNum * secondNum; //칠천억
        System.out.println("multi = " + multi); //-796692480

        /*
        * 해결방법
        *
        * 오버플로우를 예측하고 더 큰 자료형으로 결과 값을 받아서 처리한다.
        * */

        long longMulti = (firstNum + secondNum);

        System.out.println("longMulti = " + longMulti);

        longMulti = (long) firstNum * secondNum; //강제 형변환

    }
}

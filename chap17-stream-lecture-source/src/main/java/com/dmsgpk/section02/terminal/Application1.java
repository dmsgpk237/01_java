package com.dmsgpk.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /*
        * Calculating
        * 수학연산과 관련된, 다양한 메서드를 제공하는데 최소, 최대, 종합 등의 결과를 보여준다.
        * */

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        // count() : 스트림에 담겨있는 개수를 반환
        System.out.println("count: " + count);

        // sum() : 스트림에 담겨있는 숫자들의 총합을 반환
        System.out.println("sum: " + sum);


        int oddSum = IntStream.range(1, 10)
                .filter(i -> i % 2 ==1)
                .sum();
        System.out.println("oddSum: " + oddSum); // 1, 3, 5, 7, 9 = 25


        //Optional이 붙는 것은 존재할 수도 있고 없을 수도 있음을 뜻한다.
        // OptionalInt : 값이 존재할 수도 있도, 존재하지 않을 수도 있는 "int"를 표현하는 타입
        // 그래서 OptionalInt max에 IntStream을 담아준 거다.
        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("max" + max);

        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min);

    }
}

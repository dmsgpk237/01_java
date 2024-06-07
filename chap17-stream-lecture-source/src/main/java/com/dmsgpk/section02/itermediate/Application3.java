package com.dmsgpk.section02.itermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {

        /*
        * Stream<T> sorted();
        * Stream<T> sorted(Comparator<? super T> comparator);
        * sorted() 인자가 없어도 호출가능, 인자가 없으면 오름차순으로 자동 정렬됨.
        * */

        List<Integer> integerList = IntStream.of(5, 10,99, 2, 1, 35)
                .boxed() // Integer형태로 변환
                .sorted() // 오름차순으로 정렬(내림차순은 Comparator.reverseOrder())
                .toList(); // 리스트 형태로 변환(return)
        System.out.println("integerList : " + integerList);


    }
}

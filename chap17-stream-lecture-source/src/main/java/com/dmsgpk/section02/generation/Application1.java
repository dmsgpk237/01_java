package com.dmsgpk.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        // 배열과 컬렉션 객체의 stream() 메서드를 활용한 스트림 생성

         String[] sarr = new String[] {"java", "oracle", "jdbc"};

        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        // 배열의 일부분(0번 인덱스부터 2번 인덱스 이전까지)를 스트림으로 변환
        System.out.println("============ 일부분만 스트림으로 변환 ============");
        Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
        strStream2.forEach(System.out::println);

        System.out.println("============ 리스트를 스트림으로 변환 ============");
        List<String> strList = Arrays.asList("abc", "def", "ghi");
        Stream<String> strStream3 = strList.stream();
        strStream3.forEach(System.out::println);

        // 컬렉션의 경우 스트림 생성을 생략하고 사용 가능
        System.out.println("============ 컬렉션을 스트림으로 변환 ============");
        strList.forEach(System.out::println);

        //Builder를 활용한 스트림 생성
        System.out.println("============ builder를 활용한 스트림 생성 ============");
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();
        builderStream.forEach(System.out::println);
    }
}

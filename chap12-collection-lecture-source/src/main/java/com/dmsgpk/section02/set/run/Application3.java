package com.dmsgpk.section02.set.run;

import java.util.Iterator;
import java.util.TreeSet;

public class Application3 {
    // TreeSet
    public static void main(String[] args) {

        /*
        * TreeSet 클래스
        * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        * 이진 검색 트리는 데이터를 추가하거나 제거하는 등 기본 동작 시간이 매우 빠르다.
        * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
        * */

        TreeSet<String> tSet = new TreeSet<>();
        // 이게 자식을 먼저 읽고 부모를 읽어서 부모 안에 자식이 들어갈 수 있는 구조인거다.
        // Set<String> tSet2 = new TreeSet<>();
        tSet.add("java");
        tSet.add("oracle");
        tSet.add("jdbc");
        tSet.add("html");
        tSet.add("css");

        // 자동 오름차순 정렬 -> 트리구조로 값을 읽어내는 것, 가장 작은 자식부터 부모까지.
        System.out.println(tSet);


        System.out.println("======================== Iterator ========================");
        // 목록 만들어서 하나씩 대문자로 변경해서 출력하기
        // 값을 하나씩 꺼내오려면 Iterator로 하나씩 목록을 만들어줘야 한다.
        Iterator<String> iter = tSet.iterator();
        // Iterator이 가지고 있는 기능은 아래와 같다.
        // hasNext() : 다음 값이 있는지 확인
        // next() : 다음 값을 가져오는

        while (iter.hasNext()) {
            // 스트링 타입이 되었으니 어퍼케이스를 쓸 수 있다.
            System.out.println((String) iter.next().toUpperCase());
        }

        System.out.println("======================== 배열을 이용 ========================");
        Object[] arr = tSet.toArray();

        //배열인 상태에서는 향상된 for문을 쓸 수 있었다.
        for (Object obj : arr) {
            System.out.println(((String) obj).toUpperCase());
        }



    }
}

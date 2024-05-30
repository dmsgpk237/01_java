package com.dmsgpk.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복되지 않게 하나의 null값만 저장)
        * */

        /*
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * Hash -> 해서 알고리즘을 사용해서 검색 속도가 빠르다는 장점이 있다.
        * */

        HashSet<String> hSet = new HashSet<>();
//        Set sSet = new HashSet<>();
//        Collection hset2 = new HashSet();
        // > 사용은 가능하나 잘 사용하지 않고, 첫 번째 방법을 가장 많이 사용함.

        hSet.add(new String("java"));
        hSet.add("oracle");
        hSet.add("jabc");
        hSet.add("html");
        hSet.add("css");
        // 순서를 유지하지 않는다.
        System.out.println(hSet);

        // 중복을 허용하지 않는다.
        hSet.add("java");
        System.out.println(hSet);

        System.out.println("저장된 객체 수 : " + hSet.size());
        System.out.println("포함 확인 : " + hSet.contains("oracle"));

        /*
        * 저장된 객체를 한 개씩 꺼내는 기능이 없다.
        * 반복문을 이용해서 연속처리하는 방법을 구현해보자.
        * */

        // 1. toArray() 배열로 바꾸고 for문 사용
        Object[] arr = hSet.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        // 2. interator()로 목록을 만들어서 연속 처리
        Iterator<String> iter = hSet.iterator();

        while(iter.hasNext()) {
            System.out.println("Iterator로 목록 만들어 출력 : " + iter.next());
        }

        //hSet.remove("oracle");
        // 삭제했닝? true or false
        Boolean result = hSet.remove("oracle");
        System.out.println(result);
        System.out.println(hSet);


        // 전부 다 지웠닝? true or false
        hSet.clear();
        System.out.println(hSet.isEmpty());
        System.out.println(hSet);

    }

}

package com.dmsgpk.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {

    // Map
    public static void main(String[] args) {
        /*
        * Map 인터페이스의 특징
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키(key)와 값(value)를 하나씩 쌍으로 저장하는 방식을 사용한다.
        *
        * 키(key)
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 키 요소는 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
        *
        * HashMap, HashTable, TreeMap 등 대표적인 클래스가 존재한다.
        * HashMap이 가장 많이 사용되며 HashTable은 jdk 1.0부터 존재해, HashMap과 동일하게 동작된다.
        * -> 하위호환을 위해 남겨놓은 것이기 때문에 가급적이면 HashMap을 사용하는 것을 권장한다.
        * */

        HashMap hMap = new HashMap();
        // Map hmp2 = new HashMap();

        // HashMap에 저장할 때는 put 사용하고, 키(a)와 값(20)을 쌍으로 저장한다.
        // 저장할 떼 주의할 점은 둘 다 객체를 넣어야 한다.
        // 여기서 one은 객체가 아닌데, 이 때는 오토박싱이 된다.
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println("hMap : " + hMap);

        // 중복 체크
        // hmap.put(키값, 값)
        hMap.put(12, "yellow banana");
        System.out.println("hMap : " + hMap);

        // 값 중복 확인
        hMap.put(12, "yello banana");
        hMap.put(13, "yello banana");
        hMap.put(14, "yello banana");

        System.out.println("hMap : " + hMap);

        // remove() -> 삭제
        // key 값으로 접근해서 저장된 값을 삭제
        hMap.remove(13);
        hMap.remove(14);
        System.out.println("hMap : " + hMap);

        // 저장된 객체 수 확인
        System.out.println("hMapdp 저장된 객체 수 : " + hMap.size());

        //통신할 때 사용하는 제이슨이 있고, 제이슨도 키와 벨류로 이루어져있다.
    }

}

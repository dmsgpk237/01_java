package com.dmsgpk.jumptojava.Q10;

import java.util.HashMap;
import java.util.HashSet;

public class Q10 {

    // 매직 넘버 제거하기
    /*
     * 다음은 커피의 종류(1: 아메리카노, 2: 아이스아메리카노, 3: 카페라떼, 4: 아이스 카페라떼)를 입력하면 가격을 알려주는 프로그램이다.
     * 이 코드에서 1, 2, 3과 같은 매직 넘버를 제거하여 프로그램을 개선해보자.
     * */

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFF_LATTE,
        ICE_CAFE_LATTE
    };


    public static void printCoffeePrice(CoffeeType type) {

        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 3500);
        priceMap.put(CoffeeType.CAFF_LATTE, 4000);
        priceMap.put(CoffeeType.ICE_CAFE_LATTE, 4500);
        int price = priceMap.get(type);
        System.out.println(String.format("제품 가격은 %d원 입니다.", price));

    }


    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);
        printCoffeePrice(CoffeeType.ICE_AMERICANO);
        printCoffeePrice(CoffeeType.CAFF_LATTE);
        printCoffeePrice(CoffeeType.ICE_CAFE_LATTE);

    }
}

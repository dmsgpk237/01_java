package com.dmsgpk.subproject;

public class Barista {
    /*
    * 주문에 따라 커피를 만들어야 함.
    * */
    private int coffeeStock = 5000; // 5000g 커피보유
    public Coffee[] makeCoffee(Order order) {
        // 재고 차감 처리 - 커피 한 잔에 20g 사용

        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];

        for(int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }
        return coffees;
    }
}

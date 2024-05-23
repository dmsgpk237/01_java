package com.dmsgpk.test12345;

public class Tesla03 {

    /*
    문제 설명:

    Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.
    */

    private String model;
    private int year;
    private String kinds;
    private int price;

    public void teslaModel(String model) {
        this.model = model;
    }

    public void teslaYear(int year) {
        this.year = year;
    }

    public void teslaKinds(String kinds) {
        this.kinds = kinds;
    }

    public void teslaPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return "2";
    }

}

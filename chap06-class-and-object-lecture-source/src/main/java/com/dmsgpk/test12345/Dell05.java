package com.dmsgpk.test12345;

public class Dell05 {

    /*
    Laptop 클래스

    문제 설명:
    Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    */

    private String brand;
    private String model;
    private String performance;

    public void dellBrand(String dellBrand) {
        this.brand = brand;
    }

    public void dellModel(String dellModel) {
        this.model = model;
    }

    public void dellPerformance(String dellPerformance) {
        this.performance = performance;
    }

//    public String getBrand() {
//        return this.brand;
//    }
//
//    public String getModel() {
//        return this.model;
//    }
//
//    public String getPerformance() {
//        return this.performance;
//    }

    // 이것도 안 됨

    public String getInfo() {
        return "이 노트북의 브랜드는 : " + brand + " 이고, 모델명은 : " + model + " 이며, 사양은 : " + performance + " 입니다.";
    }
}

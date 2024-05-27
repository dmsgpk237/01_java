package com.dmsgpk.section08.initblock;

public class Product {

    // 1. 필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체가 생성된다.
//    private String name; // 제품명
//    private int price; // 제품 가격
//    private static String brand; // 제품 브랜드

    // 2. 명시적 초기화
    private String name = "갤럭시"; // 제품명
    private int price = 100000; // 제품 가격
    private static String brand = "삼성"; // 제품 브랜드

    // 3. 인스턴스 초기화 블럭
    {
        name = "z플립";
        price = 1209880;
        brand = "samsung";

        /*
        * 주의사항
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있는 것처럼 보이지만
        * static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행했다.
        * 따라서 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에
        * 인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰게 되는 것.
        * */

        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    // 4. static 초기화 블럭
    static {
        // static 초기화 블럭은 static 필드만 초기화 할 수 있음.
//        name = "iphone";
//        price = 2300000;
        brand = "lg";

        System.out.println("정적 초기화 블럭 동작함...");

    }
    // 정적 초기화 블럭은 인스턴스 초기화 블럭보다 먼저 실행이 된다.
    // 인스턴스 초기화 블럭 실행이 나중에 돼서 값이 lg가 아닌 samsung이 나오는 것.


    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;

        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    // 필드값 전체 문자열 합치기해서 문자열 반환
    public String getInformation() {
        return "Product [name = " + this.name + ", price = " + this.price + ", brand = " + Product.brand + "]";
    }

}

package com.dmsgpk.test12345;

public class Puppy01 {

    /*
    문제 설명:

    이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    */

    private String name;
    private int age;
    private String kinds;

    public void puppyName(String name) {
        this.name = name;
    }

    public void puppyAge(int age) {
        this.age = age;
    }

    public void puppyKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getInfo() {
        return "이 강아지의 이름은 : " + this.name + " 이며, 나이는 : " + this.age + "살 이고, 종류는 : " + this.kinds + " 입니다.";
    }


}

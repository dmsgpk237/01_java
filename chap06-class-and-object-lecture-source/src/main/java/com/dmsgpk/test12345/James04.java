package com.dmsgpk.test12345;

public class James04 {

    /*
    문제 설명:

    나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다. 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    */

    private String name;
    private int age;
    private char marriage;
    private int kid;
    private String kidName;

    public James04(String name, int age, char marriage, int kid, String kidName) {
        this.name = name;
        this.age = age;
        this.marriage = marriage;
        this.kid = kid;
        this.kidName = kidName;
    }

    public String getInfo() {
        return "이 남자의 이름은 : " + name + " 이며, 나이는 : " + age + "살 이고, 결혼 유무는 : " + marriage + " 이며, 자식은 " + kid + " 명이 있고, " +
                "자식의 이름은 " + kidName + " 입니다.";
    }
}

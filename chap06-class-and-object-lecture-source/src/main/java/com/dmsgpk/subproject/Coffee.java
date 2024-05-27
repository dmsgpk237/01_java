package com.dmsgpk.subproject;

public class Coffee {

    // 커피 종류 [ 아메리카노 / 라떼 ]
    private final String coffeeName;

    // 옵션 [ HOT / ICE ]
    private final String option;

    public Coffee(String coffeeName, String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    // toString : 필드에 있는 모든 내용을 출력하고 싶을 때 만드는 메소드
    // 모든 클래스에서 만들 수 있고 그 클래스에 있는 내용을 모두 다 출력하고 싶을 때 사용하는 것.
    // alt+insert에 나오는 내용들은 우리가 많이 사용하는 내용들을 알려줌.

    public String toString() {
        return "%s(%s)".formatted(coffeeName, option);
    }
}


package com.dmsgpk.section01.intro;

public interface OuterCalculator {

    // 내부 인터페이스

    @FunctionalInterface
    public interface Sum {
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiple(int a, int b);
    }

    @FunctionalInterface
    public interface Division {
        int division(int a, int b);
    }


}

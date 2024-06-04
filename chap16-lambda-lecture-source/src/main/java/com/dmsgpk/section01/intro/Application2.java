package com.dmsgpk.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;
        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));

        OuterCalculator.Minus min = (x, y) -> x - y;
        System.out.println("20과 10의 차 : " + min.minusTwoNumber(20, 10));

        OuterCalculator.Multiple mul = (x, y) -> x * y;
        System.out.println("20과 10의 곱 : " + mul.multiple(20, 10));

        OuterCalculator.Division div = (x, y) -> x / y;
        System.out.println("20과 10의 나누기 : " + div.division(20, 10));

    }
}

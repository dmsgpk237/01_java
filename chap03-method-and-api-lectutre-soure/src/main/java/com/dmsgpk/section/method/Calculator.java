package com.dmsgpk.section.method;

public class Calculator {



    // 삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 메서드

    public int nonStaticNumberOf(int first, int second) {

//        int result = (first > second) ? second : first;

        return (first > second) ? second : first;
    }

    // 삼항연산자로 두 수를 비교해서 큰 값을 return 해주는 메서드
    public static int staticMaxNumberOf(int first, int second) {

        return (first > second) ? first : second;

    }

    // 더하기, 빼기, 곱하기, 나누기, 나머지
    // 이 각각을 수행할 수 있는 메서드를 만들고
    // 더하기, 빼기, 곱하기, 나누기 => non-static
    // 나머지 => static

    public int plusNumber(int num1, int num2) {

        return num1 + num2;

    }

    public int minusNumber(int num1, int num2) {

        return num1 - num2;

    }

    public int multipleNumber(int num1, int num2) {

        return num1 * num2;

    }

    public int divideNumber(int num1, int num2) {

        return num1 / num2;

    }

    public static int remainderNumber(int num1, int num2) {

        return num1 % num2;

    }
}

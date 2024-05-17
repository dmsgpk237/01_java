package com.dmsgpk.section01.method;

public class Application10 {

    public static void main(String[] args) {

        Calculator calc = new Calculator(); // 참조하려고 하는 곳에 작성하는 것임.

        int num1 = 16;
        int num2 = 5;

        //더하기
        System.out.println("두 수를 더한 결과 : " + calc.plusNumber(num1, num2));

        //빼기
        System.out.println("두 수를 뺀 결과 : " + calc.minusNumber(num1, num2));

        //곱하기
        System.out.println("두 수를 곱한 결과 : " + calc.multipleNumber(num1, num2));

        //나누기
        System.out.println("두 수를 나눈 결과 : " + calc.divideNumber(num1, num2));

        //나머지
        System.out.println("두 수를 나눈 결과의 나머지 : " + Calculator.remainderNumber(num1, num2));

    }



}

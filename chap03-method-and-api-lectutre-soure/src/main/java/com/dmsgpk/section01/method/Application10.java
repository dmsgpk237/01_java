package com.dmsgpk.section01.method;

public class Application10 {

    public static void main(String[] args) {

        Calculator calc = new Calculator(); // 참조하려고 하는 곳에 작성하는 것임.

        int num1 = 16;
        int num2 = 5;

         /*  Calculator Class에
            더하기, 빼기,  곱하기, 나누기, 나머지
            이 각각을 수행할 수 있는 메서드를 만들고
            Applicaion10의 main 메서드에 출력하라.

            (더하기, 빼기, 곱하기, 나누기 => non-static
            나머지 => static)
        */

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

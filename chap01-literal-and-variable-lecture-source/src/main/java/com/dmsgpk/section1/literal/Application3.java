package com.dmsgpk.section1.literal;

public class Application3 {

    public static void main(String[] args) {

        // 수업목표: 문자열 합치기 결과를 예측하고, 사용할 수 있다.
        System.out.println("====== 두 개의 문자열 합치기 ======");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println("====== 세 개의 문자열 합치기 ======");
        // 더하기의 연산 순서를 알 수 있습니다.
        //'+' 연산의 방향은 왼쪽에서 오른쪽이다. (숫자부터 연산)
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + "9" + 9);
        System.out.println("9" + (9+9));
        System.out.println("9" + (9*2));
        System.out.println("9" + 9 * 2);

        //10과 20의 사칙연산 + 나머지연산 결과를 출력하세요
        System.out.println("====== 10과 20의 사칙연산 결과 ======");
        System.out.println("10과 20의 합 :  " + (10 + 20));
        System.out.println("10과 20의 차 :  " + (10 - 20));
        System.out.println("10과 20의 곱 :  " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 :  " + (10 / 20));
        System.err.println("10과 20의 나누기 한 나머지 :  " + (10 % 20));
        //out 대신에 err을 넣으면 콘솔에서 그 줄만 빨갛게 보인다.

        /* 디버깅을 배우기 전까지 코드가 에러났을 때 가장 좋은 방법은
        콘솔에다가 결과값을 계속 찍어보는 것이다.
        어디서 내가 생각한 것과 다른 결과값이 나왔는지 확인하는 것이다.

        alt + j 로 커서를 복사해 한 번에 입력할 수 있다.
        당분간은 콘솔에다가 찍는 수업을 계속 할 것이다.
        콘솔에 보기좋게 바꾸는 연습을 계속 해야된다.
         */



    }
}

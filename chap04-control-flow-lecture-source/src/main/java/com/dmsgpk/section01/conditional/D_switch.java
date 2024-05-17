package com.dmsgpk.section01.conditional;

import java.util.Scanner;

public class D_switch {

    /*
    * [switch문 표현식]
    *
    * switch([비교할 변수]) {
    *   case [비교값 1] : 비교값 1과 일치하는 경우 실행할 구문; break;
    *   case [비교값 2] : 비교값 2와 일치하는 경우 실행할 구문; break;
    *   default : case에 모두 해당하지 않는 경우 실행할 구문; break;
    * }
    *
    * 여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것
    * if-else-if와 유사하다. 그래서 일부 호환도 가능하다.
    *
    * [if와 switch의 차이점]
    * switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
    * switch문은 정확하게 일치하는 경우에만 비교가 가능하다. 그래서 대소비교를 할 수 없다,
    * case절에는 변수를 사용할 수 없다. (값만 비교 가능)
    * */

    /*
    * 정수 2개와 연산자 기호 문자를 입력 받아서
    * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
    * */
    public void testSimpleSwitchStatement() {
        Scanner sc  = new Scanner(System.in);

        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.println("연산 기호 입력(+, -, *, /, % : ");
        char op = sc.next().charAt(0);

        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        // 연산 결과를 저장할 변수
        int result = 0;

        switch (op) {

            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
                /*산수연살 외에 다른 문자에 대한 처리는 생략하였음. -> default 생략*/
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine() {

        /*
        * switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
        * 1. JDK 1.7 이상부터 switch문을 이용해 문자열 비교를 할 수 있다.
        * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
        */

        // switch문을 이용한 간단한 자판기
        System.out.println("=== dmsgpk vending machine ===");
        System.out.println("   사이다   콜라   환타   박카스    핫식스    ");
        System.out.println("==========================================");
        System.out.println("음료를 선택 해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selDrink = sc.nextLine();

        int price = 0;


        switch (selDrink) {
            case "사이다" :
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
                break;

            case "콜라" :
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
                break;

            case "환타" :
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
                break;

            case "박카스" :
                System.out.println("박카스를 선택하셨습니다.");
                price = 800;
                break;

            case "핫식스" :
                System.out.println("핫식스를 선택하셨습니다.");
                price = 900;
                break;
        }

        System.out.println(price + " 원을 투입 해주세요.");

    }


}

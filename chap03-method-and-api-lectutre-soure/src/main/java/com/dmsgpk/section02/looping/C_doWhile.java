package com.dmsgpk.section02.looping;

import java.util.Scanner;

public class C_doWhile {

    /*
    * [dh while문 표현식]
    * 초기식 :
    * so {
    *   // 반복할 코드
    *   // 증감식
    * 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우 수행되는 코드.
    *
    * } while ([조건식])
    *
    * */
    public void testSimpleDoiWhileStatement() {
        do {
            System.out.println("최소 한 번은 동작함...");
        } while (false);
        System.out.println("반복문 종료 확인...");
    }

    public void testDoWhileExample1() {

        /*
         * 키보드로 문자열을 입력받아 반복적으로 출력
         * */

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            //반복할 코드
            // 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우 수행되는 코드.
            // [증감식]

            System.out.println("문자열을 입력하세요 : ");
            str= sc.nextLine();
            System.out.println(str);

            /*
             * equals() : 문자열은 == 비교가 불가능하다.
             * Strind 클래스에서 제공하는 equals() 기능으로 비교가 가능하다.
             * */
        } while (!str.equals("exit"));
        System.out.println("프로그램을 종료합니다...");

    }
}

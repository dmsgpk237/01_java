package com.dmsgpk.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
        * nextLine() : 공백을 포함한 한 줄 입력을 위한 개행문자(줄바꿈) 전까지 문자열로 반환한다.
        * next() : 공백문자나 개행문자 전까지 읽어서 문자열로 반환한다.
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("인사말을 입력해주세요 : "); //안녕하세요 반갑습니다.

        String greeting = sc.nextLine();

        System.out.println(greeting);

        System.out.println("인사말을 입력해주세요");

        String greeting2 = sc.next();

        System.out.println(greeting2);

    }
}

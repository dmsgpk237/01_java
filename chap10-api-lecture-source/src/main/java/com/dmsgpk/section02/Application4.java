package com.dmsgpk.section02;

public class Application4 {
    // 이스케이프(escape)문자

    public static void main(String[] args) {
        /*
        * 이스케이프(escape) 문자
        * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용됨.
        * 이스케이프 문자      의미
        *    \n          개행(줄바꿈)
        *    \t              탭
        *    \'           작은 따옴표
        *    \"            큰 따옴표
        *    \\          역슬래쉬 표시
        * */

        System.out.println("안녕하세요. \n저는 \'권은혜\' 입니다.");
        System.out.println("안녕하세요.\t저는 \t 홍길동입니다.");
        System.out.println();
        System.out.println("\' \t \t \t \'");
        System.out.println("      \'      ");
        System.out.println();
        System.out.println("  ==========");
        System.out.println("      v       ");

        /*
        * split 할 때 이스케이프 문자를 사용해야하는 특수문자도 존재한다.
        * 이스케이프 문자 사용 안 하는 특수문자
        * ~ ` ! @ # - _ ; : ' \ " , < > /
        *
        * 이스케이프 문자를 사용하는 특수문자 (\\)
        * $ ^ * ( ) + | { } [ ] . ?
        * \\
        * */


        // 차이점
        String str = "java^oracle^jdbc";
        String[] sarr = str.split("^");

        for (String s : sarr) {
            System.out.println(s);
        }

        String str1 = "java^oracle^jdbc";
        String[] sarr1 = str1.split("\\^");

        for (String s : sarr1) {
            System.out.println(s);
        }

    }
}

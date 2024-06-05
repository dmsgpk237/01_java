package com.dmsgpk.section1.literal;

public class Application1 {
    public static void main(String[] args) {

        /* 여기 사이에 있는 글자나 문자는 모든게 주석이 된다.
        *
        System.out.println("a");
        System.out.println("b");
        System.out.print("c");
        System.out.print("d");
        System.out.println("wow");
        System.out.println("ho ho ho");
        System.out.println("sout + enter");
        System.out.print("syso + enter");
        *
        */

        //(주석) 수업목표 : 여러가지 값의 형태를 출력 할 수 있다.

        System.out.println(123);
        // 정수 출력

        System.out.println(12.3);
        // 실수 출력

        System.out.println('a'); // 문자열이 아닌 문자는 홀따옴표로 감싸주어야 한다.

        System.out.println("ㅁ"); //문자열은 쌍따옴표로 감싸주어야 한다.

        System.out.println('1'); //홀따옴표 안에 있기 때문에 문자로 인식된다.

        System.out.println("안녕하세요? ㅎㅎ"); //문자열은 문자가 여러개가 나열 된 형태를 의미하며 쌍따옴표로 감싸져있다.

        System.out.println("123"); //쌍따옴표 안에 있기 때문에 정수열이 아닌 문자열이다.

        System.out.println(" "); //문자열은 빈 값도 취급된다.

        System.out.println(' '); //문자는 빈 값이 취급되지 않는다. 근데 띄어쓰기를 넣었기 때문에 취급

        System.out.println("a"); //한 개의 문자도 쌍따옴표 안에 넣으면 문자열이다.

        System.out.println(true); //논리 값은 진실과 거짓이 있다.

        System.out.println(false); //논리 값은 논리 값으로만 취급된다

    }
}

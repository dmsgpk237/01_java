package com.dmsgpk.section02.enumtype;

public class Application {
    public static void main(String[] args) {

        /*
         * Enum을 이용하여 선언된 인스턴스는 싱글톤으로 관리가 된다. = 인스턴스가 한 개임을 보장한다.
         * */

        Subject subject1 = Subject.JAVA;
        Subject subject2 = Subject.HTML;
        Subject subject3 = Subject.ORACLE;

        // .toString 이용해 문자열로 관리하기가 쉽다.
        System.out.println(Subject.JAVA.toString());
        System.out.println();

        //values()를 이용해 상수값 배열을 반환
        Subject[] subjects = Subject.values();

        for (Subject s : subjects) {
            System.out.println(s);
        }

        // 타입 안전을 보장
        // Subject subject4 = 0; //이렇게 만든다고 0을 의미하지 않음.
        Subject subject4 = Subject.JAVA;

    }


}

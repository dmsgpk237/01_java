package com.dmsgpk.section02;

public class Application2 {
    //문자열 객체를 만드는 다양한 방법
    public static void main(String[] args) {
        /*
        * 문자열 객체를 만드는 방법
        * 1. "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리 (singleton)
        * 2. new String("문자열") : 매번 새로운 인스턴스를 생성
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));

        System.out.println("str2 == str3 : " + (str2 == str3));

        System.out.println("str3 == str4 : " + (str3 == str4));

        /*
        * hashCode 값 비교
        * */
        System.out.println("str1의 hashCode : " + str1.hashCode());
        System.out.println("str2의 hashCode : " + str2.hashCode());
        System.out.println("str3의 hashCode : " + str3.hashCode());
        System.out.println("str4의 hashCode : " + str4.hashCode());
        // 주소값은 다른데 hashCode는 다 같게 나옴. 규약때문임.

        // 문자열은 불변이라는 특징을 가지고 있음.
        str2 += "oracle";

        // str2이 저장된 곳에 oracle을 추가하는 것이 아닌,
        // 새로운 객체를 만들어서 거기에 str2의 내용과 oracle을 써서 저장함.
        System.out.println("str1 == str2 : " + (str1 == str2));

        /*
        * equals() : String 클래스의 equals() 메서드는 인스턴스 비교가 아닌 문자열 값을 비교해서
        *            동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록
        *            Object equals() 메서드를 재정의(Overriding) 해두었다.
        *            따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열인지 비교하기 위해서는
        *            == 연산 대신에 equals() 메서드를 사용해야 한다.
        * */

        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str1.equals(str4) : " + str1.equals(str4));


    }
}
